CREATE TABLE Cargo (
  codigo SERIAL,
  nome VARCHAR (20) NOT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE Departamento (
codigo INTEGER NOT NULL ,
nome VARCHAR ( 20 ) NOT NULL ,
PRIMARY KEY ( codigo )
);

CREATE SEQUENCE seq_departamento INCREMENT BY 1 ;

CREATE TABLE CIDADE (
IBGE INTEGER NOT NULL ,
NOME VARCHAR ( 30 ) NOT NULL ,
AREA FLOAT NOT NULL ,
UF_PK INTEGER NOT NULL ,
PRIMARY KEY (IBGE)
);

ALTER TABLE CIDADE
ADD CONSTRAINT UF_fk FOREIGN KEY ( UF_PK ) REFERENCES ESTADO ( IBGE ) ;
