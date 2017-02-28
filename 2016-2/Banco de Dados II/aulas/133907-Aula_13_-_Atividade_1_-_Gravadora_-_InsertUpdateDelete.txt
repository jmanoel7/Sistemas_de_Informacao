DROP TABLE IF EXISTS Gravadora_Auditoria;

CREATE TABLE Gravadora_Auditoria (
  id 			SERIAL,
  idGravadora 		INTEGER,
  oldnomegravadora	VARCHAR(50),
  oldendereco		VARCHAR(50),
  oldtelefone		VARCHAR(20),
  oldcontato		VARCHAR(20),
  oldurl		VARCHAR(80),
  nomegravadora		VARCHAR(50),
  endereco		VARCHAR(50),
  telefone		VARCHAR(20),
  contato		VARCHAR(20),
  url			VARCHAR(80),
  dt_operacao		DATE,
  usuario		VARCHAR(50),
  acao			VARCHAR(20)
);

CREATE OR REPLACE FUNCTION auditoria_gravadora_completa() RETURNS trigger AS $$
BEGIN
  IF (TG_OP = 'INSERT') THEN
    
    INSERT INTO gravadora_auditoria (idGravadora,nomegravadora, endereco, telefone, contato, url, dt_operacao, usuario, acao)
    VALUES(NEW.idgravadora, NEW.nomegravadora, NEW.endereco, NEW.telefone, NEW.contato, NEW.url, now(), current_user, TG_OP);
	
    RAISE NOTICE 'Foi inserida uma nova gravadora de nome "%" na tabela "%"', NEW.nomegravadora, TG_TABLE_NAME;				    			    
		
    RETURN NEW;
  END IF;
	
  IF (TG_OP = 'UPDATE') THEN

    INSERT INTO gravadora_auditoria (idGravadora, oldnomegravadora, oldendereco, oldtelefone, oldcontato, oldurl, nomegravadora, endereco, telefone,
                                     contato, url, dt_operacao, usuario, acao)
    VALUES(OLD.idgravadora, OLD.nomegravadora, OLD.endereco, OLD.telefone, OLD.contato, OLD.url, NEW.nomegravadora, NEW.endereco, NEW.telefone, 
	   NEW.contato, NEW.url, now(), current_user, TG_OP);
	
    RAISE NOTICE 'O registro da gravadora "%" na tabela "%" foi alterado', OLD.nomegravadora, TG_TABLE_NAME;				    

    RETURN NEW;
  END IF;

  IF (TG_OP = 'DELETE') THEN

    INSERT INTO gravadora_auditoria (idGravadora, oldnomegravadora, oldendereco, oldtelefone, oldcontato, oldurl, dt_operacao,usuario, acao)
    VALUES(OLD.idgravadora, OLD.nomegravadora, OLD.endereco, OLD.telefone, OLD.contato, OLD.url, now(), current_user, TG_OP);

    RAISE NOTICE 'O registro da gravadora "%" na tabela "%" foi excluido', OLD.nomegravadora, TG_TABLE_NAME;				    
    RETURN OLD;
  END IF;
END;$$
LANGUAGE plpgsql;


CREATE TRIGGER auditoria_completa
BEFORE INSERT or UPDATE or DELETE on Gravadora
FOR EACH ROW
EXECUTE PROCEDURE auditoria_gravadora_completa();

INSERT INTO gravadora(nomegravadora,endereco,telefone,contato,url) VALUES ('teste','rua ','+55 62 99999 9999','Dory','www'); 

UPDATE gravadora 
   SET nomegravadora = 'Teste UPDATE', endereco = 'Av.', telefone = '+55 61 88888 8888', contato = 'Carol', url = 'www.testeupdate.com.br'
 WHERE idgravadora = 8; 

DELETE FROM gravadora where idgravadora = 8;

SELECT * FROM gravadora;

SELECT * FROM gravadora_auditoria;
		