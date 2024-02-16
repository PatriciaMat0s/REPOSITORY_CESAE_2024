-- PRÁTICA LABORATORIAL MySQL 03



-- CRIAR A BD:

 CREATE DATABASE BIBLIOTECA_PATOS;


-- 2CRIAR AS TABELAS CONFORME O INDICADO NO ENUNCIADO:

CREATE TABLE editora(
id_editora INT AUTO_INCREMENT,
nome_editora VARCHAR(50),
PRIMARY KEY (id_editora)
);
 
CREATE TABLE autor(
id_autor INT AUTO_INCREMENT,
nome_autor VARCHAR(50),
pais VARCHAR(50),
PRIMARY KEY (id_autor)
);
 
CREATE TABLE genero(
id_genero INT AUTO_INCREMENT,
genero VARCHAR(50),
PRIMARY KEY (id_genero)
);
 
CREATE TABLE cliente(
id_cliente INT AUTO_INCREMENT,
nome VARCHAR(60),
email VARCHAR(60),
contacto INT,
PRIMARY KEY (id_cliente)
);
 
CREATE TABLE livro(
id_livro INT AUTO_INCREMENT,
titulo VARCHAR(50),
id_editora INT,
id_autor INT,
id_genero INT,
PRIMARY KEY (id_livro),
FOREIGN KEY (id_editora) REFERENCES editora(id_editora),
FOREIGN KEY (id_autor) REFERENCES autor(id_autor),
FOREIGN KEY (id_genero) REFERENCES genero(id_genero)
);
 
CREATE TABLE emprestimo(
id_emprestimo INT AUTO_INCREMENT,
data_devolucao DATE,
data_emprestimo DATE,
id_cliente INT,
id_livro INT,
PRIMARY KEY (id_emprestimo),
FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
FOREIGN KEY (id_livro) REFERENCES livro(id_livro)
);


-- INSERIR REGISTOS NA TABELA:

INSERT INTO editora (nome_editora) VALUES 
('Porto Editora'), 
('LeYa'), 
('Planeta'), 
('Editorial Presença'), 
('Gradiva'), 
('Plátano Editora'), 
('Edições Piaget'), 
('Grupo Lidel'), 
('Livros do Brasil'), 
('Sextante Editora'), 
('Pergaminho'); 

INSERT INTO autor (nome_autor, pais) VALUES 
('Frank Herbert','EUA'), 
('Olga Ravn','Dinamarca'), 
('Richard Morgan','EUA'), 
('Daniel Silva','EUA'), 
('José Rodrigues dos Santos','Portugal'), 
('Stephen King','EUA'), 
('Joana Marques','Portugal'), 
('Ricardo Araújo Pereira','Portugal'), 
('Juliet Marillier','Alemanha'), 
('Chloe Gong','França'), 
('TJ Klune','França'), 
('David Costa','Brasil'), 
('V.E. Schwab','Alemanha'); 

INSERT INTO genero (genero) VALUES 
('Fantasia'), 
('Ficção Científica'), 
('Crónicas'), 
('Contos'), 
('Biografias'), 
('Poesia'), 
('Romance'), 
('Policial e Thiller'), 
('Humor'), 
('Literatura'), 
('Monografias'); 

INSERT INTO livro (titulo, id_editora, id_autor, id_genero) VALUES 
('Leão Da Insanidade',9,6,2), 
('Vigarista Com Pecados',4,13,9), 
('Companheiros Do Rio',6,10,11), 
('Cobras De Vento',4,7,9), 
('Árvores E Guardiões',4,11,2), 
('Agentes E Cães',9,3,6), 
('Influenciar Com Vigor',3,2,4), 
('Conquista Sem Pecado',9,3,10), 
('Chorando Na Tecnologia',4,5,1), 
('Prepare-Se Para As Minas',7,11,4), 
('Sacerdote Dos Perdidos',4,10,7), 
('Chuvas De Desejo',6,10,4), 
('Estrangeiros De Tristeza',3,10,9), 
('Estranhos De Amanhã',6,5,1), 
('Cobras E Defensores',10,9,4), 
('Ratos E Descendentes',6,11,7), 
('União Das Paliçadas',5,1,6), 
('Visão Com Asas',11,4,3), 
('Ainda Respirando Nas Profundezas',7,4,10), 
('Sons Na Minha Esposa',7,5,11), 
('Herói Sem Glória',4,12,4), 
('Falcão Do Vento',1,11,10), 
('Meninas Da Nação',8,11,5), 
('Guardiões Do Mundo',9,4,8), 
('Assassinos E Inimigos',1,7,8), 
('Humanos E Fantasmas',10,12,3), 
('Amaldiçoar Com Força',3,4,10), 
('Clímax Sem Fé',3,13,7), 
('Protegido Pelo Caçador',3,1,6), 
('Prepare-Se Para O Universo',2,3,3); 

INSERT INTO cliente (nome, email, contacto) VALUES 
('Miguel Antunes','mantunes187@gmail.com','912456789'), 
('Armindo Guterres','armindo.1963@live.com.pt','921568793'), 
('Rita Rodrigues','ritinha111@gmail.com','963184687'), 
('Larissa Ventura','lariss_ventura@hotmail.com','963215897'), 
('Roberto Fragoso','robfrag@yahoo.com','928649873'), 
('Adélia Custódio','adeliaamcustodio@hotmail.com','913254893'), 
('Sofia Velasquez','velasquez.sof333@live.com.pt','916588731'),
('Delfim Pestana','pestanas1978@gmail.com','936544486'), 
('Vânia Quaresma','vania.quaresma.77@yahoo.com','926888369'), 
('Maria Pardo','pardo_maria@hotmail.com','913654879'), 
('Wilson Guimarães','wwwilsonnn1994@gmail.com','963211548'), 
('Nilton Godinho','nilton_god_@hotmail.com','923345869'), 
('Clara Dantas','clarinha2000_1@live.com.pt','915487358'), 
('Emanuel Rocha','emanuelonrocks@gmail.com','962144487'), 
('Mark Raposo','markfoxx@hotmail.com','935587694'), 
('Tiago Pacheco','tigas_pacheco@yahoo.com','916687943'), 
('Raquel Caldas','caldas.raquel2001@live.com.pt','923648776'), 
('Miriam Figueiras','miri_figueiras4321@hotmail.com','913478282'), 
('Carlos Teixeira','carlosjrteixeira@gmail.com','963188413'); 

INSERT INTO emprestimo (data_devolucao, data_emprestimo, id_cliente, id_livro) VALUES 
('2022-01-06','2020-12-09',19,18), 
('2021-08-22','2019-06-07',7,23), 
('2022-04-19','2021-07-14',11,10), 
('2021-11-02','2019-04-20',4,13), 
('2022-05-26','2019-10-31',13,22), 
(NULL,'2021-09-24',13,25), 
('2022-04-17','2022-02-06',2,25), 
('2022-06-06','2022-05-25',17,10), 
('2022-06-24','2021-01-30',1,20), 
('2021-06-06','2020-03-28',10,2), 
(NULL,'2021-11-28',5,6), 
(NULL,'2021-04-21',16,29), 
(NULL,'2021-02-07',14,2), 
(NULL,'2020-10-24',10,30), 
('2022-07-26','2022-01-08',17,3), 
(NULL,'2020-04-16',13,23), 
('2022-07-03','2019-08-18',16,25), 
('2021-09-06','2019-12-25',19,13), 
(NULL,'2021-02-27',9,12), 
('2021-06-22','2019-12-18',7,14), 
(NULL,'2021-01-28',4,3), 
('2021-08-24','2020-06-14',13,21), 
('2022-04-26','2021-12-17',8,7), 
('2022-05-14','2019-11-07',6,3), 
(NULL,'2019-11-03',1,25), 
('2021-03-27','2020-02-05',14,15), 
('2020-06-05','2020-06-04',10,16), 
('2020-12-28','2020-11-27',13,18), 
('2022-01-21','2019-11-24',7,12), 
('2021-12-25','2019-12-01',3,23); 



-- 4. A partir da forma como a informação está registada crie uma View para mostrar a informação de forma a 
-- responder às seguintes necessidades: 

-- NOTA: Alguns dos exercícios poderão necessitar do auxilio de funções como CONCAT(), YEAR(), CURDATE(). 

-- SELECT CURDATE();
-- The date is returned as "YYYY-MM-DD" (string) or as YYYYMMDD (numeric).

-- SELECT CONCAT('SQL', ' is', ' fun!');

-- SELECT YEAR('2017/08/25')
-- The YEAR() function returns the year part for a specified date.



-- a. Uma lista com o nome dos clientes que têm um email que contenha o texto ‘gmail’ e tenham um 
-- contacto que comece em 91 ou 96; 

create view ex4a as
select nome
from cliente
where (contacto like '91%' || contacto like '96%') && email like '%gmail%';


-- b. Uma lista com os empréstimos que ainda não foram devolvidos, acrescente uma coluna chamada ‘Dias’ 
-- que faça o cálculo do número de dias decorridos desde a data do empréstimo. 

create view ex4b as
select *, datediff(current_date(),data_emprestimo) as 'Dias'
from emprestimo
where data_devolucao is null;


-- c. Uma lista com todos os anos e total de empréstimos por cada ano; 

create view ex4c as
select count(data_emprestimo), year(data_emprestimo)
from emprestimo
group by year(data_emprestimo);


-- d. Uma lista com o nome das editoras e a respetiva quantidade de livros de cada uma, apresentado só as 
-- editoras com mais de 3 livros. 

create view ex4d as
    SELECT ed.nome, 
    FROM editora AS ed
    JOIN livro AS l
    ON ed.id_editora = l.id_livro
    WHERE b.fabricante = 'Adidas';

select year(data_emprestimo)
from editora
  FROM editora AS ed
    JOIN livro AS l
    ON ed.id_editoraik = b.id_equipa
where data_devolucao is null
    group by a.nome_autor
    order by total_emprestimos desc
    limit 3;

-- e. Uma lista com o género e a quantidade de livros por género existentes na biblioteca; 

-- f. Uma lista com o nome das editoras e nome dos géneros que cada editora tem disponível nesta 
-- biblioteca; 

-- g. Uma lista com o top 3 nomes dos autores mais requisitados e respetivo total de empréstimos, que não 
-- pertençam aos EUA; 

create view ex4g as
    select a.nome_autor, a.pais, count(emp.id_emprestimo) as total_emprestimos
    from autor as a
    join livro as l
    on l.id_autor=a.id_autor
    join emprestimo as emp
    on l.id_livro=emp.id_livro
    where a.pais != 'EUA'
    group by a.nome_autor
    order by total_emprestimos desc
    limit 3;


-- h. Uma lista com o título dos livros, nomes e email dos clientes, e data de empréstimos, cujos os livros 
-- ainda não foram devolvidos antes de 2021, ordenados do mais antigo para o mais recente;

create view ex4g as
    select a.nome_autor, a.pais, count(emp.id_emprestimo) as total_emprestimos
    from autor as a
    join livro as l
    on l.id_autor=a.id_autor
    join emprestimo as emp
    on l.id_livro=emp.id_livro
    where a.pais != 'EUA'
    group by a.nome_autor
    order by total_emprestimos desc
    limit 3;


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