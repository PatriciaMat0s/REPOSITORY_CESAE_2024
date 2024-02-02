
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
VALUES 
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