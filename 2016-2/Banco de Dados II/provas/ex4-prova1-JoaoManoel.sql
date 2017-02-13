DROP FUNCTION IF EXISTS fun_remove_autores_sem_musica();

CREATE FUNCTION fun_remove_autores_sem_musica () RETURNS SETOF VARCHAR AS
$$
  DECLARE
	reg RECORD;
  BEGIN
	RETURN NEXT 'Autores Deletados (sem Músicas na Loja de CDs)';
	RETURN NEXT '----------------------------------------------';
	FOR reg IN
		SELECT *
		FROM autor
		WHERE idautor NOT IN (
			SELECT DISTINCT idautor FROM musica_autor
		)
	LOOP
		RETURN NEXT  'IdAutor: ' || reg.idautor || ';  Nome_Autor: ' || reg.nome_autor;
		DELETE FROM musica_autor WHERE idautor = reg.idautor;
		DELETE FROM autor        WHERE idautor = reg.idautor;
	END LOOP;
	RETURN;
  END;
 $$
LANGUAGE 'plpgsql';

SELECT * FROM fun_remove_autores_sem_musica();