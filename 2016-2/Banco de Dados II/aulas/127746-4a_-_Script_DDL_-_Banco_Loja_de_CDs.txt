-- DROP DATABASE if exists ifgoias;

-- CREATE DATABASE ifgoias;

-- Apaga as Tabelas de Relacionamentos
DROP TABLE IF EXISTS cd_gravadora;
DROP TABLE IF EXISTS musica_auditoria;
DROP TABLE IF EXISTS musica_autor;
DROP TABLE IF EXISTS faixa;

-- Apaga as Tabelas Entidades
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS cd;
DROP TABLE IF EXISTS cd_categoria;
DROP TABLE IF EXISTS gravadora;
DROP TABLE IF EXISTS musica;

-- Apaga as Sequences de Chaves Primárias
DROP SEQUENCE IF EXISTS seq_autor;
DROP SEQUENCE IF EXISTS seq_cd;
DROP SEQUENCE IF EXISTS seq_cd_categoria;
DROP SEQUENCE IF EXISTS seq_faixa;
DROP SEQUENCE IF EXISTS seq_gravadora;
DROP SEQUENCE IF EXISTS seq_musica;

-- Cria as Sequences de Chaves Primárias
CREATE SEQUENCE seq_autor INCREMENT 1 START 1;
CREATE SEQUENCE seq_cd INCREMENT 1 START 1;
CREATE SEQUENCE seq_cd_categoria INCREMENT 1 START 1;
CREATE SEQUENCE seq_faixa INCREMENT 1 START 1;
CREATE SEQUENCE seq_gravadora INCREMENT 1 START 1;
CREATE SEQUENCE seq_musica INCREMENT 1 START 1;

-- Cria as Tabelas Entidades e Relacionamentos
CREATE TABLE IF NOT EXISTS autor (
  idAutor integer DEFAULT nextval('seq_autor'),
  Nome_Autor varchar(60) NOT NULL,
  PRIMARY KEY (idAutor)
);


CREATE TABLE IF NOT EXISTS gravadora (
  idGravadora integer DEFAULT nextval('seq_gravadora'),
  NomeGravadora varchar(50) NOT NULL,
  Endereco varchar(50) DEFAULT NULL,
  Telefone varchar(20) DEFAULT NULL,
  Contato varchar(20) DEFAULT NULL,
  URL varchar(80) DEFAULT NULL,
  PRIMARY KEY (idGravadora)
);


CREATE TABLE IF NOT EXISTS cd_categoria (
  idCategoria integer DEFAULT nextval('seq_cd_categoria'),
  Menor_Preco decimal(14,2) DEFAULT NULL,
  Maior_Preco decimal(14,2) DEFAULT NULL,
  PRIMARY KEY (idCategoria)
);

CREATE TABLE IF NOT EXISTS cd (
  idCD integer DEFAULT nextval('seq_cd'),
  CD_Indicado integer DEFAULT NULL,
  idGravadora integer NOT NULL,
  Nome_CD varchar(60) NOT NULL,
  Preco_Venda decimal(14,2) DEFAULT NULL,
  Dt_Lancamento date DEFAULT NULL,
  PRIMARY KEY (idCD),
  CONSTRAINT cd_ibfk_1 FOREIGN KEY (idGravadora) REFERENCES gravadora (idGravadora) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS musica (
  idMusica integer DEFAULT nextval('seq_musica'),
  NomeMusica varchar(60) NOT NULL,
  Duracao time DEFAULT NULL,
  PRIMARY KEY (idMusica)
);

CREATE TABLE IF NOT EXISTS faixa (
  Numero_Faixa integer DEFAULT nextval('seq_faixa'),
  idMusica integer NOT NULL,
  idCD integer NOT NULL,
  PRIMARY KEY (Numero_Faixa,idCD,idMusica),
  CONSTRAINT faixa_ibfk_1 FOREIGN KEY (idCD) REFERENCES cd (idCD) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT faixa_ibfk_2 FOREIGN KEY (idMusica) REFERENCES musica (idMusica) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS musica_autor (
  idAutor integer NOT NULL,
  idMusica integer NOT NULL,
  PRIMARY KEY (idAutor,idMusica),
  CONSTRAINT musica_autor_ibfk_1 FOREIGN KEY (idMusica) REFERENCES musica (idMusica) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT musica_autor_ibfk_2 FOREIGN KEY (idAutor) REFERENCES autor (idAutor) ON DELETE NO ACTION ON UPDATE NO ACTION
);