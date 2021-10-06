-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2021 at 12:00 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `labpoe_torneo`
--

-- --------------------------------------------------------

--
-- Table structure for table `jugador`
--

CREATE TABLE `jugador` (
  `dui` char(10) COLLATE utf8mb4_spanish_ci NOT NULL,
  `nombre` varchar(80) COLLATE utf8mb4_spanish_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `estatura` double NOT NULL,
  `peso` double NOT NULL,
  `id_posicion` char(2) COLLATE utf8mb4_spanish_ci NOT NULL,
  `id_universidad` varchar(100) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Dumping data for table `jugador`
--

INSERT INTO `jugador` (`dui`, `nombre`, `edad`, `estatura`, `peso`, `id_posicion`, `id_universidad`) VALUES
('12345678-9', 'Luis Enrique Vasquez Aquila', 19, 1.65, 120, 'AP', 'UNICAES');

-- --------------------------------------------------------

--
-- Table structure for table `posicion`
--

CREATE TABLE `posicion` (
  `id_posicion` varchar(2) COLLATE utf8mb4_spanish_ci NOT NULL,
  `posicion` varchar(40) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Dumping data for table `posicion`
--

INSERT INTO `posicion` (`id_posicion`, `posicion`) VALUES
('AP', 'Ala-Pívot'),
('BA', 'Base'),
('C', 'Pívot'),
('E', 'Escolta'),
('SF', 'Alero');

-- --------------------------------------------------------

--
-- Table structure for table `universidad`
--

CREATE TABLE `universidad` (
  `codigo_universidad` varchar(10) COLLATE utf8mb4_spanish_ci NOT NULL,
  `nombre` varchar(120) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Dumping data for table `universidad`
--

INSERT INTO `universidad` (`codigo_universidad`, `nombre`) VALUES
('UES', 'Universidad Nacional de El Salvador'),
('UNICAES', 'Universidad Católica de El Salvador');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`dui`),
  ADD KEY `id_universidad_fk` (`id_universidad`),
  ADD KEY `id_posicion_fk` (`id_posicion`) USING BTREE;

--
-- Indexes for table `posicion`
--
ALTER TABLE `posicion`
  ADD PRIMARY KEY (`id_posicion`);

--
-- Indexes for table `universidad`
--
ALTER TABLE `universidad`
  ADD PRIMARY KEY (`codigo_universidad`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `jugador_ibfk_1` FOREIGN KEY (`id_posicion`) REFERENCES `posicion` (`id_posicion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jugador_ibfk_2` FOREIGN KEY (`id_universidad`) REFERENCES `universidad` (`codigo_universidad`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
