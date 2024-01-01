-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.11.0-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando estructura para tabla tdi.materias
CREATE TABLE IF NOT EXISTS `materias` (
  `id` int(11) NOT NULL,
  `Asignatura` varchar(40) DEFAULT NULL,
  `Semestre` int(11) DEFAULT NULL,
  `Profesor` varchar(40) DEFAULT NULL,
  `Creditos` int(11) DEFAULT NULL,
  `Salon` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla tdi.materias: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` (`id`, `Asignatura`, `Semestre`, `Profesor`, `Creditos`, `Salon`) VALUES
	(1, 'Physics', 1, 'Daniel', 12, 'P-103'),
	(2, 'Chemistry', 2, 'Gustavo', 8, 'O-112'),
	(3, 'Life Science', 1, 'Martin', 10, 'P-114'),
	(4, 'Political Science', 3, 'Andres', 8, 'P-118'),
	(5, 'Computer Science', 4, 'Sofia', 14, 'O-123'),
	(6, 'Mathmatics', 1, 'Eric', 4, 'P-105');
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
