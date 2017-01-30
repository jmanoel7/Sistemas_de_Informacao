CREATE TYPE MusicasCDCD AS (nomeMusica VARCHAR, duracao TIME);

CREATE OR REPLACE FUNCTION Musicas_CDs ( IN codcd int )
	RETURNS SETOF MusicasCDCD AS $$
	BEGIN
		RETURN QUERY SELECT m.nomemusica, m.duracao
				FROM cd NATURAL JOIN faixa f
					NATURAL JOIN musica m
				WHERE idcd = codcd;
	END; $$
LANGUAGE PLPGSQL;

SELECT * FROM Musicas_CDs(1);