// PAra criar o banco de dados no PGAdmin:

CREATE DATABASE ibge_db;

//para cirar a tabela no PGAdmin

CREATE TABLE minha_tabela (
    id BIGINT NOT NULL,
    nome VARCHAR(255),
    CONSTRAINT pk_minha_tabela PRIMARY KEY (id)
);
