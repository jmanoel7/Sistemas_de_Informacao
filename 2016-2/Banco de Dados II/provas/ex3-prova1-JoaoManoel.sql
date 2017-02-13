DROP FUNCTION IF EXISTS fun_insere_musica (VARCHAR(60), TIME WITHOUT TIME ZONE);

CREATE FUNCTION fun_insere_musica (IN in_nomemusica VARCHAR(60), IN in_duracao TIME WITHOUT TIME ZONE) RETURNS SETOF INTEGER AS
$$
  DECLARE
	ret_idmusica INTEGER;
  BEGIN
  
	SELECT nextval('seq_musica') INTO ret_idmusica;
	
	INSERT INTO musica (idmusica, nomemusica, duracao)
	VALUES (ret_idmusica, in_nomemusica, in_duracao);
	
	RETURN NEXT ret_idmusica;
	
	RETURN;
  END;
$$
LANGUAGE 'plpgsql';

SELECT * FROM fun_insere_musica('Poderoso Deus!', '00:15:35');