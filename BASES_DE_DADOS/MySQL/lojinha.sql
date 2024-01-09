-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Jan-2024 às 18:40
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `lojinha`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cidade` varchar(40) NOT NULL,
  `data_inscricao` date DEFAULT curdate(),
  `pontos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `cidade`, `data_inscricao`, `pontos`) VALUES
(1, 'Ana', 'Maia', '2018-03-11', 123),
(2, 'Bruno', 'Porto', '2006-06-22', 5347),
(3, 'Miguel', 'Porto', '2010-07-26', 1789),
(4, 'Maria', 'Valbom', '2006-05-21', 3234),
(5, 'Joana', 'Maia', '2011-08-07', 678),
(6, 'Anabela', 'Ermesinde', '2012-03-21', 864),
(7, 'Manuel', 'Gaia', '2019-06-22', 1123),
(8, 'Bruna', 'Porto', '2020-07-15', 1589),
(9, 'Joana', 'Gaia', '2021-04-14', 324),
(10, 'Raquel', 'Maia', '2019-01-21', 1899),
(11, 'Vitor', 'Gaia', '2020-09-29', 127),
(12, 'Tobias', 'Botulho', '2023-03-11', 193),
(13, 'Mizé', 'Mizarela', '2019-01-21', 2),
(14, 'Vitorino', 'Leça Balio', '2022-09-29', 180);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(11) NOT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `descricao`, `preco`, `stock`) VALUES
(1, 'Martelo', 5.99, 23),
(2, 'Parafuso', 0.99, 241),
(3, 'Prego', 0.2, 147),
(4, 'Rosca', 0.3, 0),
(5, 'Berbequim', 35.99, 15),
(6, 'Torneira', 20.99, 11),
(7, 'Lampada', 1.5, 0),
(8, 'Broca', 2.6, 60),
(9, 'Extensão', 10.5, 0),
(10, 'Tripla', 5.5, 16),
(11, 'Pincel', 3.99, 34),
(12, 'Calha', 2.99, 0),
(13, 'Martelo magnético', 25, 1),
(14, 'calhau hidráulico', 50, 1),
(15, 'enxofre cáusticp', 45, 2),
(16, 'ferramenta de corte diagonal', 35, 3),
(17, 'aplanador anti-gravítico', 120, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `id_venda` int(11) NOT NULL,
  `data_venda` date DEFAULT NULL,
  `desconto` float DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`id_venda`, `data_venda`, `desconto`, `id_cliente`) VALUES
(1, '2021-03-29', 0.05, 1),
(2, '2021-03-31', 0.2, 1),
(3, '2021-05-03', 0, 2),
(4, '2021-05-21', 0, 4),
(5, '2021-06-15', 0.1, 1),
(6, '2021-06-05', 0, 5),
(7, '2021-08-11', 0.05, 4),
(8, '2021-09-03', 0.25, 3),
(9, '2021-10-23', 0.5, 5),
(10, '2021-11-04', 0, 7),
(11, '2021-11-05', 0.5, 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda_produto`
--

CREATE TABLE `venda_produto` (
  `id_venda_produto` int(11) NOT NULL,
  `id_venda` int(11) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `venda_produto`
--

INSERT INTO `venda_produto` (`id_venda_produto`, `id_venda`, `id_produto`, `quantidade`) VALUES
(1, 1, 1, 2),
(2, 1, 3, 10),
(3, 2, 2, 20),
(4, 3, 5, 2),
(5, 4, 8, 5),
(6, 5, 10, 2),
(7, 5, 11, 10),
(8, 6, 6, 20),
(9, 7, 3, 120),
(10, 7, 1, 5),
(11, 7, 7, 2),
(12, 8, 3, 10),
(13, 9, 2, 80),
(14, 9, 3, 50),
(15, 9, 1, 3),
(16, 9, 8, 2),
(17, 10, 9, 10),
(18, 10, 2, 50),
(19, 10, 3, 70),
(20, 11, 5, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`);

--
-- Índices para tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices para tabela `venda_produto`
--
ALTER TABLE `venda_produto`
  ADD PRIMARY KEY (`id_venda_produto`),
  ADD KEY `id_venda` (`id_venda`),
  ADD KEY `id_produto` (`id_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `venda_produto`
--
ALTER TABLE `venda_produto`
  MODIFY `id_venda_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Limitadores para a tabela `venda_produto`
--
ALTER TABLE `venda_produto`
  ADD CONSTRAINT `venda_produto_ibfk_1` FOREIGN KEY (`id_venda`) REFERENCES `venda` (`id_venda`),
  ADD CONSTRAINT `venda_produto_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
