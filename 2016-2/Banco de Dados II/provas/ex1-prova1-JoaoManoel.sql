DROP FUNCTION IF EXISTS fun_lista_autores (VARCHAR(60));

DROP TYPE IF EXISTS type_autores;

CREATE TYPE type_autores AS (idmusica INTEGER, idautor INTEGER, nome_autor VARCHAR(60));

CREATE FUNCTION fun_lista_autores (IN in_nomemusica VARCHAR(60)) RETURNS SETOF type_autores AS
$$
  BEGIN
	RETURN QUERY
		SELECT m.idmusica, a.idautor, a.nome_autor
		FROM autor a NATURAL JOIN musica_autor NATURAL JOIN musica m
		WHERE m.nomemusica = in_nomemusica;
  END;
 $$
LANGUAGE 'plpgsql';

SELECT * FROM fun_lista_autores('Anos Dourados');