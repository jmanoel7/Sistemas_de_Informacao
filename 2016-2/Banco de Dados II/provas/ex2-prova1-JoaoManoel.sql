DROP FUNCTION IF EXISTS fun_atualiza_preco_cd (INTEGER, NUMERIC(14,2));

CREATE FUNCTION fun_atualiza_preco_cd (IN in_idcd INTEGER, IN in_preco_venda NUMERIC(14,2)) RETURNS SETOF VARCHAR AS
$$
  DECLARE
	var_preco_venda NUMERIC(14,2);
  BEGIN
  
	SELECT preco_venda INTO var_preco_venda
	FROM cd
	WHERE idcd = in_idcd;
	
	IF (in_preco_venda < 10 OR in_preco_venda > 100) THEN
		RETURN NEXT 'O valor informado está fora da faixa de preços de Cds';
	ELSE
		UPDATE cd
		SET preco_venda = in_preco_venda
		WHERE idcd = in_idcd;
		
		RETURN NEXT 'Preço alterado com sucesso';
	END IF;
	
	RETURN;
  END;
$$
LANGUAGE 'plpgsql';

SELECT * FROM fun_atualiza_preco_cd(1, 23.15);