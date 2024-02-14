-- PRÁTICA LABORATORIAL MySQL 02



-- 1. CRIAR A BD 'CAMPEONATO_PATOS':

 CREATE DATABASE CAMPEONATO_PATOS;



-- 2. CRIAR AS TABELAS CONFORME O INDICADO NO ENUNCIADO:

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



-- 3. INSERIR OS REGISTOS APRESENTADOS NO ENUNCIADO EM CADA UMA DAS TABELAS CRIADAS:

INSERT INTO treinador (nome, idade, telefone) 
VALUES 
('António', 34, 922424561), 
('Barbosa', 45, 965552936), 
('Tavares', 48, 933332267), 
('Joaquim', 57, 918638465),
('Alberto', 33, 966785309), 
('Duarte', 54, 912773446); 

INSERT INTO equipa (nome, cidade, diretor) 
VALUES 
('Académico', 'Porto', 'Mário'), 
('Universitário', 'Coimbra', 'João'), 
('Juventude', 'Braga', 'Silva'), 
('Tigres', 'Espinho', 'Cardoso'); 

INSERT INTO bola (id_equipa, fabricante) 
VALUES 
(1, 'Adidas'), 
(1, 'Reebok'), 
(1, 'Adidas'), 
(2, 'Adidas'), 
(2, 'Olimpic'), 
(2, 'Nike'), 
(3, 'Reebok'), 
(3, 'Olimpic'); 

INSERT INTO escalao (descricao) 
VALUES- 
('iniciados'), 
('juvenis'), 
('juniores'), 
('seniores'); 

INSERT INTO experiencia (id_equipa, id_treinador, id_escalao, anos) 
VALUES 
(1, 1, 3, 10), 
(1, 1, 4, 5), 
(1, 2, 1, 2), 
(1, 2, 3, 3), 
(1, 2, 2, 4), 
(2, 3, 3, 15), 
(4, 5, 2, 12); 



-- 4. Criar views para as seguintes consultas, nomeando cada como ‘Ex_<letra do exercício>’ (exemplo: Ex_a): 


-- a. Mostrar o id, o nome e a idade dos treinadores com menos de 40 anos de idade; 

    CREATE VIEW Ex4a AS 
    SELECT id_treinador, nome, idade
    FROM treinador
    WHERE idade < 40;


-- b. Mostrar todos os dados da tabela Experiencias relativos aos treinadores que treinaram juniores ou que tenham mais do que 10 anos de experiência;

    CREATE VIEW Ex4b AS 
    SELECT ex.*
    FROM experiencia AS ex
    JOIN treinador AS t
    ON ex.id_treinador = t.id_treinador
    WHERE ex.id_escalao = 3 OR ex.anos > 10;


-- c. Mostrar todos os dados dos treinadores com idade pertencente ao intervalo [45, 53] e por ordem decrescente da idade; 

    CREATE VIEW Ex4c AS 
    SELECT *
    FROM treinador
    WHERE idade BETWEEN 45 AND 53 
    ORDER BY idade DESC;


-- d. Mostrar todos os dados dos treinadores cujo nome começa pela letra A. 

    CREATE VIEW Ex4d AS 
    SELECT *
    FROM treinador
    WHERE nome LIKE 'A%';


-- e. Mostrar o número total de equipas no campeonato e chamar a essa agregação ‘Total de Equipas’. 

    CREATE VIEW Ex4e AS 
    SELECT COUNT(id_equipa) AS 'Total de equipas'
    FROM equipa;


-- f. Mostrar o total de treinadores com idade superior a 40 anos e calcular a média desse agrupamento; 

    CREATE VIEW Ex4f AS 
    SELECT COUNT(idade), ROUND(AVG(idade),0) 
    FROM treinador
    WHERE idade > 40; 


-- g. Mostrar a idade do treinador mais velho. 

    CREATE VIEW Ex4g AS 
    SELECT MAX(idade)
    FROM treinador;
   

-- h. Mostrar o id das equipas que utilizam bolas do fabricante Adidas;

    CREATE VIEW Ex4h AS 
    SELECT b.id_equipa
    FROM equipa AS eq
    JOIN bola AS b
    ON eq.id_equipa = b.id_equipa
    WHERE b.fabricante = 'Adidas';


-- i. Mostrar o resultado da alínea anterior, mas sem repetições; 

    CREATE VIEW Ex4i AS 
    SELECT DISTINCT eq.id_equipa
    FROM equipa AS eq
    JOIN bola AS b
    ON eq.id_equipa = b.id_equipa
    WHERE b.fabricante = 'Adidas';


-- j. Mostrar a media das idades dos treinadores de juvenis; 

    CREATE VIEW Ex4j AS 
    SELECT ROUND(AVG(treinador.idade),0)
    FROM treinador AS t
    JOIN experiencia AS ex
    ON ex.id_treinador = t.id_treinador
    JOIN escalao AS esc
    ON esc.id_escalao = ex.id_escalao
    WHERE esc.id_escalao = 2;


-- k. Mostrar os nomes e os telefones dos treinadores e os nomes das equipas por eles treinadas; 

    CREATE VIEW Ex4k AS 
    SELECT t.nome, t.telefone, eq.nome
    FROM treinador AS t
    JOIN experiencia AS ex
    ON ex.id_treinador = t.id_treinador
    JOIN equipa AS eq
    ON eq.id_equipa = ex.id_equipa


-- l. Mostrar todos os dados da equipa do Académico e o nome dos respetivos treinadores; 

    CREATE VIEW Ex4l AS 
    SELECT eq.*, t.nome
    FROM equipa AS eq
    JOIN experiencia AS ex
    ON eq.id_equipa = ex.id_equipa
    JOIN treinador AS t
    ON t.id_treinador = ex.id_treinador
    WHERE eq.nome = 'Académico';


-- m. Mostrar a idade do treinador mais velho do Académico; 

    CREATE VIEW Ex4l AS 
    SELECT MAX(t.idade)
    FROM equipa AS eq
    JOIN experiencia AS ex
    ON eq.id_equipa = ex.id_equipa
    JOIN treinador AS t
    ON t.id_treinador = ex.id_treinador
    WHERE eq.nome = 'Académico';


-- n. Mostrar o total de anos de experiência do treinador António do Académico.

CREATE VIEW Ex4n AS 
    SELECT SUM(ex.anos)
    FROM equipa AS eq
    JOIN experiencia AS ex
    ON eq.id_equipa = ex.id_equipa
    JOIN treinador AS t
    ON t.id_treinador = ex.id_treinador
    WHERE eq.nome = 'Académico' AND t.nome = 'António';