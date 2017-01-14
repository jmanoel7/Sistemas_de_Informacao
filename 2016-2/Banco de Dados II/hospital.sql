-- dory.go@gmail.com

-- Database: hospital

-- DROP DATABASE hospital;

CREATE DATABASE hospital
  WITH OWNER = aluno
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'pt_BR.UTF-8'
       LC_CTYPE = 'pt_BR.UTF-8'
       CONNECTION LIMIT = -1;


-- Table: public."Ambulatorio"

-- DROP TABLE public."Ambulatorio";

CREATE TABLE public."Ambulatorio"
(
  "numeroA" character(3) NOT NULL,
  andar character(2),
  capacidade integer,
  CONSTRAINT "numeroA" PRIMARY KEY ("numeroA")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Ambulatorio"
  OWNER TO aluno;




-- Table: public."Medico"

-- DROP TABLE public."Medico";

CREATE TABLE public."Medico"
(
  codcidade integer NOT NULL,
  "CRM" integer NOT NULL,
  especialidade character(20) NOT NULL,
  idade integer NOT NULL,
  nome character(100) NOT NULL,
  "numeroA" character(3) NOT NULL,
  CONSTRAINT "CRM" PRIMARY KEY ("CRM")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Medico"
  OWNER TO aluno;



