/*
1) Criar uma função que receba o nome da Música e retorne os registros com o IdMusica, IdAutor e Nome_Autor. (Valor 1.0)
*/  
DROP FUNCTION IF EXISTS questao1(VARCHAR);
CREATE OR REPLACE FUNCTION questao1(IN v_musica VARCHAR) RETURNS TABLE (id_musica INTEGER, id_autor INTEGER, nome VARCHAR)AS $$  
   BEGIN
	RETURN QUERY SELECT musica.idmusica, autor.idautor, autor.nome_autor
		       FROM musica NATURAL JOIN musica_autor NATURAL JOIN autor
		      WHERE musica.nomemusica = v_musica;
	RETURN;
   END $$
LANGUAGE PLPGSQL;

SELECT * FROM questao1('Cai Dentro');

/*
2) Criar uma função que receba o código do CD e o preço. A função deve alterar o preço de venda do CD indicado somente
   se o valor informado estiver dentro da faixa delimitada de preços. A função deve retornar uma string “Preço alterado
   com sucesso” ou “O valor informado está fora da faixa de preços de Cds”. (Valor 1.0)

					Faixa Delimitada de Preços
				valorMin 10			valorMax 100
*/

DROP FUNCTION IF EXISTS questao2(INTEGER, NUMERIC);
CREATE OR REPLACE FUNCTION questao2( IN id INTEGER, IN valor NUMERIC(14,2)) RETURNS TEXT AS $$
BEGIN
   IF (valor >= 10 AND valor <= 100) THEN
	   UPDATE cd SET preco_venda = valor WHERE idcd = id;
	   RETURN 'Preço alterado com sucesso';
   ELSE  
	   RETURN 'O valor informado está fora da faixa de preços de CDs';	 
   END IF; 
END$$
LANGUAGE PLPGSQL;       

SELECT questao2(1, 100.00);

/*
3) Criar uma função que receba os dados de uma música e realize a inserção na tabela Musica. A função deverá retornar 
   o código da Música cadastrada. Lembre-se, existe uma “sequence” que controla a chave primária.(Valor 1.0)
*/
DROP FUNCTION IF EXISTS questao3();
CREATE OR REPLACE FUNCTION questao3(IN nome VARCHAR, IN tempo TIME) RETURNS INTEGER AS $$
DECLARE 
   id_musica INTEGER;
BEGIN  
   id_musica = (SELECT nextval('seq_musica'));
   INSERT INTO musica VALUES(id_musica, nome, tempo);
   RETURN id_musica;
END$$
LANGUAGE PLPGSQL;

SELECT questao3('Teste Musica', '01:02:03');

/*
4) Criar uma função para excluir todos os autores que não estiverem relacionados em nenhuma Música. A função deverá
   retornar os registros excluídos com o IdAutor e Nome_Autor.(Valor 1.0)
*/

DROP FUNCTION questao4();
CREATE OR REPLACE FUNCTION questao4() RETURNS SETOF RECORD AS $$
DECLARE
	registro RECORD;
BEGIN
	FOR registro IN SELECT idautor, nome_autor FROM autor WHERE idautor NOT IN (SELECT DISTINCT idautor FROM musica_autor) LOOP 
		RETURN NEXT registro;
		DELETE FROM autor WHERE idautor = registro.idautor;
	END LOOP;
        
 END;$$
LANGUAGE PLPGSQL;

SELECT * FROM questao4() AS (idautor INTEGER, nome_autor VARCHAR);