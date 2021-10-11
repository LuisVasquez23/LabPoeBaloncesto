-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-10-2021 a las 19:51:56
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `labpoe_torneo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `codigo_equipo` varchar(4) COLLATE utf8mb4_spanish_ci NOT NULL,
  `nombre` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`codigo_equipo`, `nombre`) VALUES
('LL', 'La libertad'),
('SA', 'Santa Ana'),
('SS', 'San Salvador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `dui` char(10) COLLATE utf8mb4_spanish_ci NOT NULL,
  `nombre` varchar(80) COLLATE utf8mb4_spanish_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `estatura` double NOT NULL,
  `peso` double NOT NULL,
  `id_posicion` char(2) COLLATE utf8mb4_spanish_ci NOT NULL,
  `id_universidad` varchar(100) COLLATE utf8mb4_spanish_ci NOT NULL,
  `id_equipo` varchar(4) COLLATE utf8mb4_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`dui`, `nombre`, `edad`, `estatura`, `peso`, `id_posicion`, `id_universidad`, `id_equipo`) VALUES
('02135645-9', 'Adrian', 19, 1.85, 123, 'AP', 'UNASA', 'SS'),
('12345678-9', 'Luis', 19, 1.8, 120, 'AP', 'UNASA', 'SA'),
('12653452-6', 'Ricardo', 20, 1.7, 130, 'C', 'UNICAES', 'SA'),
('15935765-4', 'Nestor', 22, 1.75, 135, 'BA', 'UNICAES', 'SA'),
('4561237-9', 'Felipe', 22, 1.75, 122, 'E', 'UNICAES', 'SA'),
('45789636-9', 'Javier', 23, 1.85, 125, 'SF', 'UNICAES', 'SA'),
('56453215-5', 'Argueta', 22, 1.9, 123, 'BA', 'UNICAES', 'SS'),
('65453215-2', 'Sergio', 22, 1.75, 125, 'SF', 'UNASA', 'SA'),
('65453215-9', 'Fernando', 20, 1.8, 120, 'AP', 'UNICAES', 'SA'),
('6545658-9', 'Arturo', 20, 1.85, 125, 'AP', 'UNASA', 'SA'),
('65457898-9', 'Carlos', 20, 1.85, 130, 'SF', 'UNICAES', 'SA'),
('75395145-8', 'Jairo', 19, 1.85, 122, 'C', 'UNASA', 'SA'),
('78654369-2', 'Ernesto', 20, 1.7, 125, 'E', 'UNASA', 'SA'),
('78984565-2', 'Miguel', 19, 1.72, 125, 'C', 'UNASA', 'SA'),
('84316579-8', 'Juan', 18, 1.75, 120, 'C', 'UNICAES', 'SA'),
('8529632-5', 'Miguel', 23, 1.72, 123, 'C', 'UNASA', 'SA'),
('85645698-9', 'Eduardo', 21, 1.85, 120, 'AP', 'UNICAES', 'SA'),
('87654320-9', 'Mario', 18, 1.77, 124, 'SF', 'UNASA', 'SS'),
('8963214-5', 'Luis', 19, 1.86, 123, 'AP', 'UNICAES', 'SS'),
('95632458-9', 'Angel', 21, 1.85, 130, 'AP', 'UNASA', 'SS'),
('9876321-5', 'Cesar', 21, 1.88, 132, 'E', 'UNICAES', 'SS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `posicion`
--

CREATE TABLE `posicion` (
  `id_posicion` varchar(2) COLLATE utf8mb4_spanish_ci NOT NULL,
  `posicion` varchar(40) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `posicion`
--

INSERT INTO `posicion` (`id_posicion`, `posicion`) VALUES
('AP', 'Ala-Pívot'),
('BA', 'Base'),
('C', 'Pívot'),
('E', 'Escolta'),
('SF', 'Alero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `universidad`
--

CREATE TABLE `universidad` (
  `codigo_universidad` varchar(10) COLLATE utf8mb4_spanish_ci NOT NULL,
  `nombre` varchar(120) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `universidad`
--

INSERT INTO `universidad` (`codigo_universidad`, `nombre`) VALUES
('UNASA', 'Universidad Autonoma de Santa Ana'),
('UNICAES', 'Universidad Católica de El Salvador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`codigo_equipo`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`dui`),
  ADD KEY `id_universidad_fk` (`id_universidad`),
  ADD KEY `id_posicion_fk` (`id_posicion`) USING BTREE,
  ADD KEY `id_equipo_fk` (`id_equipo`) USING BTREE;

--
-- Indices de la tabla `posicion`
--
ALTER TABLE `posicion`
  ADD PRIMARY KEY (`id_posicion`);

--
-- Indices de la tabla `universidad`
--
ALTER TABLE `universidad`
  ADD PRIMARY KEY (`codigo_universidad`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `jugador_ibfk_1` FOREIGN KEY (`id_posicion`) REFERENCES `posicion` (`id_posicion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jugador_ibfk_2` FOREIGN KEY (`id_universidad`) REFERENCES `universidad` (`codigo_universidad`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jugador_ibfk_3` FOREIGN KEY (`id_equipo`) REFERENCES `equipo` (`codigo_equipo`) ON DELETE SET NULL ON UPDATE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
