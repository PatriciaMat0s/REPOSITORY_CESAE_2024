CREATE TABLE bola(
    id_bola INT AUTO_INCREMENT,
    id_equipa INT,
    fabricante VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_bola)
    );
CREATE TABLE equipa(
    id_equipa INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(50),
    diretor VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_equipa)
    );
 
CREATE TABLE experiencia(
    id_experiencia INT AUTO_INCREMENT,
    id_equipa INT,
    id_treinador INT,
    id_escalao INT,
    anos INT DEFAULT 0,
    PRIMARY KEY (id_experiencia)
    );
CREATE TABLE treinador(
    id_treinador INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    idade INT,
    telefone INT,
    PRIMARY KEY (id_treinador)
    );
CREATE TABLE escalao(
    id_escalao INT AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_escalao)
    );
ALTER TABLE bola 
ADD FOREIGN KEY (id_equipa) REFERENCES equipa(id_equipa);
 
ALTER TABLE experiencia
ADD FOREIGN KEY (id_equipa) REFERENCES equipa(id_equipa),
ADD FOREIGN key (id_treinador) REFERENCES treinador(id_treinador),
ADD FOREIGN KEY (id_escalao) REFERENCES escalao(id_escalao);




