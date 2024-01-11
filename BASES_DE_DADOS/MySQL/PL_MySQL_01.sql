FICHA MYSQL - PL01

CRIAR BASE DE DADOS:::
create database loja_seunome;


NOTAS:
So se pode usar o auto-incremento nas PK simples, nunca nas compostas!


INSERIR TABELAS:::
>>> MANEIRA A:
Sem as alter tables, as foreign keys sao apresentadas em cada tabela
A ordem de apresentaçao das tabelas tem em conta a sua utilizacao, ou seja, ligam se com FOREIGN KEYS as tabelas ja criadas


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



>>> MANEIRA B:

A ordem das tabelas nao importa, as foreign keys nao aparecem nas tabelas e sim no fim, com o alter tables


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
    id_cliente INT,
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

7>>>
- Inserir +3 novos clientes à tabela de clientes:

insert into Cliente (nome, cidade, data_inscricao, pontos) values 
('Tobias', 'Botulho', '2023-03-11', 193), 
('Mizé', 'Mizarela', '2019-01-21', 2), 
('Vitorino', 'Leça Balio', '2022-09-29', 180);


- Inserir +5 novos produtos à tabela de produtos:

insert into Produto (descricao, preco, stock) values 
('Martelo magnético', 25, 1), 
('calhau hidráulico', 50, 1), 
('enxofre cáusticp', 45, 2), 
('ferramenta de corte diagonal', 35, 3), 
('aplanador anti-gravítico', 120, 1); 


- Atualize o valor de pontos do cliente nr 3 para 2789;
 
UPDATE Cliente
SET pontos = 2789
WHERE nome='Miguel';


- Atualize o stock do ‘Berbequim’ para 13:

UPDATE Produto
SET stock = 13
WHERE nome='Berbequim';


- Atualize o nome de ‘Vitor’ (cliente nr 11) para ‘Vitorino’ e os pontos para 327:

UPDATE Cliente
SET nome = 'Vitorino', pontos ='327'
WHERE nome='Berbequim';


- Elimine os produtos cuja descrição seja ‘Calha’ da tabela produto:

DELETE FROM Produto
WHERE descricao = "Calha";



8>>>>
- Ver toda a informação de todos os clientes:

SELECT * /*nome, cidade, data_inscricao, pontos*/ 
FROM Cliente


- Ver todas as cidades dos clientes (sem duplicados); 
SELECT DISTINCT cidade 
FROM Cliente


- Ver a descrição, preço, preço com iva (23%) de todos os produtos e chame ao último atributo ‘Preço + IVA’:

SELECT descricao, preco, preço+preco*0.23 AS 'Preço + IVA'
FROM Produto


- Ver todos os clientes que se inscreveram entre ‘2000-01-01’ e ‘2009-01-01’ e com mais de 1000 pontos:

SELECT nome
FROM Cliente
WHERE 2000-01-01 < data_inscricao < 2009-01-01


- Ver produtos com stock igual a 0, 15 e 60:
SELECT descricao
FROM Produto
WHERE stock = 0 AND stock = 15 AND stock = 60


- Ver todos os clientes cujo nome contenha ‘ana’, ordenado por ordem descendente pelo id_cliente:
SELECT nome
FROM Cliente
WHERE NOME LIKE 'ana'


- Ver todos os clientes cujo nome seja composto no total por 5 caracteres sendo o último um ‘a’:
SELECT nome
FROM Cliente
WHERE nome LIKE '____a'


- Ver todos os produtos cuja descrição comece por ‘P’ ou ‘T’ ou termine em ‘CA’:
SELECT descricao
FROM Produto
WHERE descricao LIKE 'P%' OR 'T%' OR '%CA'


- Ver apenas o 6º,7º,8º cliente com mais pontos; 
select PONTOS
from Cliente
order by pontos desc
limit 5,3 
/* LIMIT OFFSET,NUMBER OF VALUES OF TEH INTERVAL offset - valor previo ao limite inferior, numero de valores que quero apurar*/ 


- Ver as cidades que tenham mais de 1 cliente; 
SELECT cidade, count(nome)
FROM cLIENTE
group by cidade 
having count(nome) > 1
/*where so qdo ha condiçoes sem funcçoes de agregaçao; de outro modo usa se o having!*/



- Ver quais as vendas que não foi aplicado nenhum desconto; 



- Ver o top 3 produtos mais caros; 



- Ver todas as vendas que tiveram um desconto superior a 10%; 








-ultimos slides das QUERIES- Ver todos os id_vendas, Nomes de cliente e Localidade de cliente; 

- Ver todos as descrições e preço unitário de produtos da venda nr 9; 

- Ver todas as descrições, preço unitário e quantidade da venda nr 10; 

- Ver exatamente os mesmos atributos que o ponto anterior, acrescentando uma coluna chamada ‘Total por Produto’ que multiplica o preço unitário e quantidade; 

- Ver todos os produtos vendidos entre '2021-05-01' e '2021-08-01'; 

- Ver o total faturado em cada venda, sem desconto aplicado (ter atenção ao group by); 

- Ver quais os produtos vendidos a clientes de ‘Gaia’;


