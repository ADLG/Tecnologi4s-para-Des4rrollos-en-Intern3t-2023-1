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

-- Volcando datos para la tabla tdi.mensajes: ~13 rows (aproximadamente)
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
INSERT INTO `mensajes` (`m_id`, `destinatario`, `remitente`, `texto`, `copia`, `fecha`) VALUES
	(69, 'Daniela', 'Gustavo', 'Te paso mis datos para la inscripción al club de b', NULL, '2022/11/13 14:41:38'),
	(71, 'Daniela', 'Gustavo', 'hola', NULL, '2022/11/13 14:41:51'),
	(75, 'Daniela', 'Jorge', 'Hola, Como estas ?', NULL, '2022/11/13 15:18:12'),
	(76, 'Daniela', 'Raquel', 'Cómo te fué ?', 'Gustavo', '2022/11/13 15:21:27'),
	(77, 'Daniela', 'David', 'Vamos a comer ?', NULL, '2022/11/13 15:21:27'),
	(78, 'Daniela', 'carmen', 'Hola como te fue en el examen', '', '2022/11/13 15:22:55'),
	(80, 'Gustavo', 'Daniela', 'Cómo te fué ?', '', '2022/11/13 17:08:53'),
	(81, 'Gustavo', 'Daniela', 'Mañana vamos a arreglar el carro y después a corre', NULL, '2022/11/13 17:08:53'),
	(82, 'Gustavo', 'Jorge', 'Vamos a jugar tenis mañana ¿ Quieres venir ?', '', '2022/11/13 17:09:07'),
	(83, 'Rafael', 'Gustavo', 'Ya va a llover', NULL, '2022/11/13 17:09:07'),
	(84, 'Daniela', 'Daniel', 'Las ranas también son personas?', 'Gustavo', '2022/11/13 18:05:41'),
	(85, 'Gustavo', 'Daniel', 'Las ranas también son personas?', NULL, '2022/11/13 18:05:41'),
	(87, 'Daniela', '????', '#%&!#&/"#$&")/($/)"', NULL, '2022/11/13 18:06:40');
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
