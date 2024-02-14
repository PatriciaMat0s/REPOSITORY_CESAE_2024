-- PRÁTICA LABORATORIAL MySQL 03



-- CRIAR A BD:

 CREATE DATABASE CONCURSO_PATOS;


-- 2CRIAR AS TABELAS CONFORME O INDICADO NO ENUNCIADO:

CREATE TABLE Evento (
    Data DATE,
    Hora TIME,
    Chefe INT,
    Nome VARCHAR(255),
    Bolo VARCHAR(255),
    NrAssistentes INT,
    Tema VARCHAR(255),
    Sabor VARCHAR(255),
    PRIMARY KEY (Data, Hora, Chefe)
);


-- INSERIR REGISTOS NA TABELA:

INSERT INTO evento (data, hora, chefe, nome, bolo, NrAssistentes, Tema, Sabor) Values
('2020-09-14', '12:23', '56', 'Bourdain', 'Bolo Brigadeiro Gourmet', '2', 'Aniversário', 'Limão'),
('2021-05-03', '17:00', '71', 'Ramsay', 'Mousse de chocolate branco e framboesas', '3', 'Casamento', 'Chocolate'),
('2021-05-03', '14:43', '81', 'Oliver','Pavlova de laranja', '0', 'Casamento', 'Laranja'),
('2022-05-24', '16:55', '23', 'Batali','Bolo húmido de baunilha e limão', '2', 'Halloween', 'Baunilha'),
('2022-05-24', '18:09', '81', 'Oliver','Merengue de tiramisú e limoncello', '4', 'Aniversário', 'Chocolate'),
('2022-05-24', '15:38', '44', 'Flay','Mousse de baunilha', '3', 'Casamento', 'Baunilha'),
('2023-02-15', '18:12', '56', 'Baurdain','Brigadeiro Ferrero', '1', 'Aniversário', 'Chocolate');

-- EXEMPLO DE TESTE:
SELECT * FROM Evento;


-- 5. A partir da forma como a informação está registada crie uma View para mostrar a informação de forma a 
-- responder às seguintes necessidades: 
-- a. Quantas receitas têm chocolate como parte do seu sabor principal? 
-- b. Quantas mouses foram propostas? 

-- AS VIEWS SAO COMO QUE ALIAS QUE SE USAM EM BLOCOS DE CODIGO TIPO FUNÇOES

create view ex5a as 
select count(sabor) 
from evento
where sabor = 'chocolate';

create view ex5b as
select count(bolo)
from evento
where bolo like '%Mousse%';


-- EXEMPLO DE TESTE:
SELECT * from ex5a;
SELECT * from ex5b;


-- 6. A partir da forma como a informação está registada crie uma Stored Procedure para mostrar a informação de 
-- forma a responder às seguintes necessidades: 
-- a. Quantos bolos propôs um dado chefe? 
-- b. Quais os bolos que foram propostos numa dada data? 
-- c. Quantos bolos de um dado tema foram propostos? 
-- d. Quais as três últimas receitas que foram propostas por um dado chefe? 


-- EXECUTAR UM PROCEDURE DE CADA VEZ - METER NUMA TAB DO MYSQLWORKBENCH
-- TIPO VIEWS MAS CONSIGO PASSAR LHES ARGUMENTOS
--  

CREATE PROCEDURE 6a
(IN chefeArgumento VARCHAR(50) )
BEGIN
select count(bolo)
from evento
where nome = chefeArgumento;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE 6b
(IN dataConfecao Date )
BEGIN
select *
from evento
where data = dataConfecao;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE 6c
(IN temaArgumento varchar(50) )
BEGIN
select count(bolo)
from evento
where tema = temaArgumento;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE 6d
(IN nomeChefe varchar(50) )
BEGIN
select *
from evento
where nome = nomeChefe
order by data limit 3;
END //
DELIMITER ;


-- EXEMPLO DE TESTE:
CALL 6a ('Bourdain');


