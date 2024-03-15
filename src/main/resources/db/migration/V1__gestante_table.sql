CREATE TABLE gestante (
  id BIGINT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   data_nascimento datetime NOT NULL,
   cpf VARCHAR(255) NOT NULL,
   raca INT NOT NULL,
   sexo VARCHAR(255) NOT NULL,
   CONSTRAINT pk_gestante PRIMARY KEY (id)
);

ALTER TABLE gestante ADD CONSTRAINT uc_gestante_cpf UNIQUE (cpf);