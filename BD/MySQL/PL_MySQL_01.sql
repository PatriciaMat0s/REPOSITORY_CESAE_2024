-- FICHA MYSQL - PL01

-- CRIAR BASE DE DADOS:::
-- create database loja_seunome;


-- NOTAS:
-- So se pode usar o auto-incremento nas PK simples, nunca nas compostas!


-- INSERIR TABELAS:::
-- >>>>>>>>>>> MANEIRA A:
-- Sem as alter tables, as foreign keys sao apresentadas em cada tabela
-- A ordem de apresentaçao das tabelas tem em conta a sua utilizacao, ou seja, ligam se com FOREIGN KEYS as tabelas ja criadas


CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    data_inscricao DATE DEFAULT CURDATE(),
    pontos INT,
    PRIMARY KEY (id_cliente)
    );
    
CREATE TABLE Venda (
    id_venda INT AUTO_INCREMENT,
    data_venda DATE,
    desconto FLOAT,
    PRIMARY KEY (id_venda),
    FOREIGN KEY (cliente)
    );

CREATE TABLE Produto (
    id_produto INT AUTO_INCREMENT,
    descricao VARCHAR(50),
    preco FLOAT,
    stock INT,
    PRIMARY KEY (id_produto)
    );
    
CREATE TABLE Venda_Produto (
    id_venda_produto INT,
    quantidade INT,
    PRIMARY KEY (id_venda_produto),
    FOREIGN KEY (id_venda),
    FOREIGN KEY (id_produto)
	);
    
     
    ------------------


-- >>>>>>>>>>> MANEIRA B:

-- A ordem das tabelas nao importa, as foreign keys nao aparecem nas tabelas e sim no fim, com o alter tables


CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    data_inscricao DATE DEFAULT CURDATE(),
    pontos INT,
    PRIMARY KEY (id_cliente)
    );
    
CREATE TABLE Venda (
    id_venda INT AUTO_INCREMENT,
    data_venda DATE,
    desconto FLOAT,
    id_cliente INT,   -- ATENÇAO, id_cliente é foreign key mas tem de se declarar como atributo ao criar a tabela!
    PRIMARY KEY (id_venda)
    );

CREATE TABLE Produto (
    id_produto INT AUTO_INCREMENT,
    descricao VARCHAR(50),
    preco FLOAT,
    stock INT,
    PRIMARY KEY (id_produto)
    );
    
CREATE TABLE Venda_Produto (
    id_venda_produto INT,
    id_venda INT,
    id_produto INT,  
    quantidade INT,
    PRIMARY KEY (id_venda_produto)
    );


ALTER TABLE Venda
ADD FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente);
 
ALTER TABLE Venda_Produto
ADD FOREIGN KEY (id_venda) REFERENCES Venda(id_venda),
ADD FOREIGN KEY (id_produto) REFERENCES Produto(id_produto);




-------------------------------------

-- 7>>>
-- - Inserir +3 novos clientes à tabela de clientes:
insert into Cliente (nome, cidade, data_inscricao, pontos) values 
('Tobias', 'Botulho', '2023-03-11', 193), 
('Mizé', 'Mizarela', '2019-01-21', 2), 
('Vitorino', 'Leça Balio', '2022-09-29', 180);


-- - Inserir +5 novos produtos à tabela de produtos:
insert into Produto (descricao, preco, stock) values 
('Martelo magnético', 25, 1), 
('calhau hidráulico', 50, 1), 
('enxofre cáusticp', 45, 2), 
('ferramenta de corte diagonal', 35, 3), 
('aplanador anti-gravítico', 120, 1); 


-- - Atualize o valor de pontos do cliente nr 3 para 2789;
UPDATE Cliente
SET pontos = 2789
WHERE nome='Miguel';


-- - Atualize o stock do ‘Berbequim’ para 13:
UPDATE Produto
SET stock = 13
WHERE nome='Berbequim';


-- - Atualize o nome de ‘Vitor’ (cliente nr 11) para ‘Vitorino’ e os pontos para 327:
UPDATE Cliente
SET nome = 'Vitorino', pontos ='327'
WHERE nome='Berbequim';


-- - Elimine os produtos cuja descrição seja ‘Calha’ da tabela produto:
DELETE FROM Produto
WHERE descricao = "Calha";


-- 8>>>>
-- - Ver toda a informação de todos os clientes:
-- o SELECT e o FROM sao sempre obrigatorios
SELECT * /*ou: SELECT id_cliente, nome, cidade, data_inscricao, pontos*/ 
FROM Cliente


-- - Ver todas as cidades dos clientes (sem duplicados); 
-- cuidado com * desnecessarios, colunas extra requerem processamento 
SELECT DISTINCT cidade --distinct é uma restriçao
FROM Cliente


-- - Ver a descrição, preço, preço com iva (23%) de todos os produtos e chame ao último atributo ‘Preço + IVA’:
-- SELECT descricao, preco, preco*1.23 AS 'Preço + IVA'
SELECT descricao, preco, ROUND(preco*1.23, 2) AS 'Preço + IVA' --alias
FROM Produto


-- - Ver todos os clientes que se inscreveram entre ‘2000-01-01’ e ‘2009-01-01’ e com mais de 1000 pontos:
SELECT nome -- ou SELECT *
FROM Cliente
-- WHERE 2000-01-01 < data_inscricao < 2009-01-01 AND pontos > 1000
-- Simplificar, tirar condiçoes com os operadores logicos:
WHERE data_inscricao BETWEEN '2000-01-01' AND '2009-01-01' AND pontos > 1000


-- - Ver produtos com stock igual a 0, 15 e 60:
SELECT *
FROM Produto
-- WHERE stock = 0 OR stock = 15 OR stock = 60
-- ou simplificar:
WHERE stock IN ('0,15,60')

-- !!!para queries mais avançadas e maiores, fazer por partes para verificar se estamos a fazer bem - uma condiçao de cada vez

-- - Ver todos os clientes cujo nome contenha ‘ana’, ordenado por ordem descendente pelo id_cliente:
SELECT *
FROM Cliente
WHERE nome LIKE '%ana%' -- nome contem ana no inicio meio e fim

-- ana% procurar algo que comece com ana
-- %ana procurar algo que termine em ana

ORDER BY id_cliente DESC -- sem indicaçao, por default ordena ASC



-- - Ver todos os clientes cujo nome seja composto no total por 5 caracteres sendo o último um ‘a’:
SELECT *
FROM Cliente
WHERE nome LIKE '____a'


-- - Ver todos os produtos cuja descrição comece por ‘P’ ou ‘T’ ou termine em ‘CA’:
SELECT *
FROM Produto
-- WHERE descricao LIKE 'P%' OR LIKE 'T%' OR LIKE '%CA' -- OK 
WHERE descricao REGEXP '^p|^t|ca$' -- ou REGEXP '^[pt]|ca$'


-- - Ver apenas o 6º,7º,8º cliente com mais pontos; 
select * --select pontos
from Cliente
order by pontos desc
LIMIT 5,3 
/* LIMIT OFFSET,NUMBER OF VALUES OF THE INTERVAL offset 
   valor previo ao limite inferior, numero de valores que quero apurar*/ 


-- - Ver as cidades que tenham mais de 1 cliente; 
-- SELECT cidade, count(nome) -- COM FUNÇOES DE AGREGAÇAO NAO USAR ATRIBUTOS SOLTOS: SELECT count(nome) 
SELECT cidade, count(cidade) --SE FOREM AGRUPAMENTOS PEQUENOS
-- SELECT cidade, count(cidade), avg(pontos) --podemos aadicionar mais funçoes
-- Podiamos ter usado count(*) pois nao vai ocntar atributo, vai ocntar as linhas, das poucas funçoes em que nao temos de especificar atributo
-- contar cidades ou clientes é igual neste caso
FROM Cliente
GROUP BY cidade 
HAVING count(cidade) > 1 
/*WHERE usa-se so qdo ha filtros ou condiçoes sem funçoes de agregaçao - o count() é!. Se as há usa se o HAVING*/


-- - Ver quais as vendas que não foi aplicado nenhum desconto; 
SELECT *
FROM Venda
WHERE NAO APANHEI


-- - Ver o top 3 produtos mais caros; 
SELECT *
FROM produto
ORDER BY preco DESC
LIMIT 3

-- - Ver todas as vendas que tiveram um desconto superior a 10%; 
select *
from venda
where desconto > .11 -- ou usar fraçao?




-- !!!Com a materia dos ultimos slides dos JOINS:::


-- - Ver todos os id_vendas, Nomes de cliente e Localidade de cliente; 
-- pedir info de mais de uma tabela - joins
select v.id_venda, c.nome, c.cidade
from cliente AS c -- COM JOINS CONVEM USAR ALIASES
join venda AS v
ON c.id_cliente = v.id_cliente
 

-- - Ver todos as descrições e preço unitário de produtos da venda nr 9; 
select p.descricao, p.preco
from produto as p
join Venda_Produto as vp
on p.id_produto = vp.id_produto
join venda AS v
on vp.id_venda=v.id_venda
where v.id_venda=9


-- - Ver todas as descrições, preço unitário e quantidade da venda nr 10; 
select p.descricao, p.preco, vp.quantidade
from produto as p
join venda_produto as vp
on p.id_produto = vp.id_produto
join venda AS v
on vp.id_venda=v.id_venda
where v.id_venda=10


-- - Ver exatamente os mesmos atributos que o ponto anterior, acrescentando uma coluna chamada ‘Total por Produto’ que multiplica o preço unitário e quantidade; ^

select p.descricao, p.preco, vp.quantidade, p.preco*vp.quantidade

--aprimorado:
select p.descricao, p.preco, vp.quantidade, round(p.preco*vp.quantidade,2) AS 'Total por Produto' 

--aprimorado plus:
select p.descricao, p.preco, vp.quantidade, concat(round(p.preco*vp.quantidade,2),'€') AS 'Total por Produto' 

from produto as p
join Venda_Produto as vp
on p.id_produto = vp.id_produto
join venda AS v
on vp.id_venda = v.id_venda
where v.id_venda=10

-- formataçoes cuidado e n adianta perder mto tempo.
-- vals numericos alinhados a direita - concat converte nums em texto
-- texto alinhado ...


-- - Ver todos os produtos vendidos entre '2021-05-01' e 'c'; 
SELECT p.*
from produto as p
join venda_produto as vp
on p.id_produto = vp.id_produto
join venda AS v
on vp.id_venda=v.id_venda
where v.data_venda BETWEEN '2021-05-01' AND '2021-05-01'


-- - Ver o total faturado em cada venda, sem desconto aplicado (ter atenção ao group by); 
SELECT v.id_venda,
SUM(ROUND(p.preco*vp.quantidade,2)) AS 'Total Facturado'
FROM produto AS p
JOIN venda_produto AS vp
ON p.id_produto = vp.id_produto
JOIN venda AS v
ON vp.id_venda = v.id_venda
WHERE  v.desconto = 0
GROUP BY  v.id_venda

-- se nao uso funç agrega nos filtros vai cair tudo no where ou having


-- - Ver quais os produtos vendidos a clientes de ‘Gaia’;
SELECT *
FROM cliente as c
JOIN venda as v
ON c.id_cliente = v.id_cliente
JOIN venda_produto as vp
ON v.id_venda = vp.id_venda
JOIN produto as P
on vp.id_produto=p.id_produto
WHERE c.cidade = 'Gaia'

