-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17/06/2023 às 18:04
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `no_funcionario` varchar(255) NOT NULL,
  `cargo` varchar(255) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `sexo` char(1) NOT NULL,
  `endereço` varchar(200) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `UF` char(2) NOT NULL,
  `senha` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `no_funcionario`, `cargo`, `telefone`, `email`, `sexo`, `endereço`, `bairro`, `cidade`, `UF`, `senha`) VALUES
(1, 'Diego', 'Bibliotecário', '81989486631', 'devdiegosan@gmail.com', 'M', 'Loteamento Santa Joana Rua E', 'Sertãozinho', 'Nazaré da Mata', 'PE', '827ccb0eea8a706c4c34a16891f84e7b'),
(2, 'Genival', 'Bibliotecário', '(81)98756-3214', 'genivalpereira@outlook.com', 'M', 'Rua Juliano Paz', 'Sossego', 'Limoeiro', 'PE', '827ccb0eea8a706c4c34a16891f84e7b'),
(3, 'Vitoria', 'Bibliotecária', '(81)97365-2469', 'vitoriasoares@gmail.com', 'F', 'Rua Lagoinha', 'Açudinho', 'Passira', 'PE', '827ccb0eea8a706c4c34a16891f84e7b');

-- --------------------------------------------------------

--
-- Estrutura para tabela `livros`
--

CREATE TABLE `livros` (
  `id` int(11) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `autor` varchar(255) NOT NULL,
  `editora` varchar(255) NOT NULL,
  `num_copias_disp` int(11) NOT NULL,
  `categoria` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `livros`
--

INSERT INTO `livros` (`id`, `titulo`, `autor`, `editora`, `num_copias_disp`, `categoria`) VALUES
(1, 'Orgulho e Preconceito', 'Jane Austen', 'CLARET', 2, 'Literatura Inglesa'),
(2, 'Dom Quixote de La Mancha', 'Miguel de Cervantes Saavedra', 'Montecristo', 3, 'Literatura Espanhola'),
(3, 'O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 'Autêntica', 2, 'Infantil'),
(4, 'Dom Casmurro', 'Machado de Assis', 'ATIRA', 3, 'Literatura Brasileira'),
(5, 'Macunaíma', 'Mario de Andrade', 'Principis', 5, 'Literatura Brasileira'),
(6, 'Vidas Secas', 'Glaciliano Ramos', 'RECORD', 3, 'Literatura Brasileira'),
(7, 'Guerra e Paz', 'Leon Tolstói', 'L&PM POCKET', 3, 'Literatura Russa'),
(8, 'A Redoma de Vidro', 'Sylvia Plath', 'Biblioteca Azul', 3, 'Romance'),
(9, 'A Hora da Estrela', 'Clarice Lispector', 'ROCCO DIGITAL', 3, 'Aventura'),
(10, 'A Morte em Veneza', 'Thomas Mann', 'Companhia das Letras', 1, 'Romance'),
(11, 'Em Busca do Tempo Perdido', 'Marcel Proust', 'VERTES', 2, 'Clássico'),
(12, 'O Banquete', 'Platão', 'L&PM POCKET', 3, 'Filosofia'),
(13, 'As Vinhas da Ira', 'John Steinbeck', 'RECORD', 1, 'Romance');

-- --------------------------------------------------------

--
-- Estrutura para tabela `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL,
  `id_livro` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `data_reserva` date NOT NULL,
  `data_devolucao` date NOT NULL,
  `status` int(11) NOT NULL DEFAULT 1,
  `multa` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `reservas`
--

INSERT INTO `reservas` (`id`, `id_livro`, `id_usuario`, `data_reserva`, `data_devolucao`, `status`, `multa`) VALUES
(1, 1, 2, '2023-06-12', '2023-06-16', 1, 1),
(2, 8, 5, '2023-06-12', '2023-06-16', 1, 1),
(3, 7, 6, '2023-06-12', '2023-06-16', 1, 1),
(4, 10, 9, '2023-06-16', '2023-06-19', 1, 0),
(5, 4, 1, '2023-06-16', '2023-06-19', 1, 0),
(6, 13, 10, '2023-06-16', '2023-06-20', 1, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `no_usuario` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `UF` char(2) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `sexo` char(1) NOT NULL,
  `status` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `no_usuario`, `endereco`, `bairro`, `cidade`, `UF`, `telefone`, `email`, `sexo`, `status`) VALUES
(1, 'Felipe Manoel', 'Rua Siqueira Campos', 'Juá', 'Nazaré da Mata', 'PE', '(81)98765-4321', 'felipemanoel@gmail.com', 'M', 0),
(2, 'Juliana Soares', 'Lotemento Costa Porto', 'Vila', 'Nazaré da Mata', 'PE', '(81)99632-5874', 'juvieira@outlook.com', 'F', 1),
(3, 'Patricia Oliveira da Silva', 'Rua Maria Madalena', 'Nazaré', 'Tracunhaém', 'PE', '(81)98523-3366', 'patysilva@gmail.com', 'F', 0),
(4, 'Sávio Vieira', 'Rua Euclides da Cunha', 'Lagoa Azul', 'Carpina', 'PE', '(81)99998-7825', 'saviovieira@gmail.com', 'M', 0),
(5, 'Solange Maria', 'Rua Odilon Estevão da Paz', 'Sertãozinho', 'Nazaré da Mata', 'PE', '(81)99564-8666', 'solangemaria@gmail.com', 'F', 1),
(6, 'Luiz Inácio Lula da Silva', 'Rua 157', 'Da Picanha', 'Limoeiro', 'PE', '(81)91571-5715', 'lulinha@yahoo.com', 'M', 1),
(7, 'Messias dos Santos', 'Rua Marechal Deodoro', 'Boa Viagem', 'Nazaré da Mata', 'PE', '(81)97322-5569', 'messiasb@gmail.com', 'M', 0),
(8, 'Hugo Lima', 'Rua Estevão Paz', 'Das Flores', 'Lagoa do Carro', 'PE', '(81)99876-6654', 'hugolima@gmail.com', 'M', 0),
(9, 'Gerlane Silva', 'Rua Campos Verdes', 'Biscotinho', 'Carpina', 'PE', '(81)97544-3621', 'gerlanesilva@gmail.com', 'F', 0),
(10, 'Suzana Vieira', 'Rua Osasco', 'Plim Plim', 'Limoeiro', 'PE', '(81)97895-5648', 'suzanavieira@hotmail.com', 'F', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `livros`
--
ALTER TABLE `livros`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_livro` (`id_livro`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Índices de tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `livros`
--
ALTER TABLE `livros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
