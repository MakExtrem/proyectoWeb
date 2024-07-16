CREATE DATABASE  IF NOT EXISTS `spring` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spring`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: spring
-- ------------------------------------------------------
-- Server version	8.0.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `activo` int DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `dni` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` varchar(255) DEFAULT NULL,
  `fecha_registro` varchar(255) DEFAULT NULL,
  `id_especialidad` int DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `numero_colegiatura` int DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,1,'Garcia','Cuesta César 6 - Chattanooga, Mur / 60146',12345678,'pedro.garcia@gmail.com','1995-04-03','2024-04-03',1,'Pedro',384927615,971967404,'male'),(2,1,'Martinez','Avenida Siempre Viva 745',23456789,'carlos.martinez@gmail.com','1985-02-17','2024-04-03',2,'Carlos',725193846,915847362,'male'),(3,1,'Pachas','Calle Falsa 123, Ciudad Imaginaria',34567890,'kim.pachas@gmail.com','1990-05-23','2024-04-03',1,'Kim',918273645,928374615,'female'),(4,1,'Pachas','Boulevard de los Sueños Rotos 101',45678901,'jose.pachas@gmail.com','1993-08-12','2024-04-03',3,'Jose',564738291,936281547,'male'),(7,1,'Pachas','Calle Sin Nombre 505',56789012,'martin.pachas@gmail.com','1995-04-03','2024-04-03',4,'Martin',237495861,947185263,'male'),(8,1,'Mendoza','Camino del Infinito 9 ',67890123,'joel.mendoza@gmail.com','1987-11-29','2024-04-03',2,'Joel',819263745,953726184,'male'),(9,1,'Paes','Callejón Diagon 7',78901234,'jorge.paes@gmail.com','1992-07-14','2024-04-03',5,'Jorge',475829136,968352471,'male'),(10,1,'Gonzales','Avenida de la Fortuna 888',89012345,'maria.gonzales@gmail.com','1988-09-06','2024-04-03',5,'Maria',692815473,974619385,'female'),(11,1,'Pinedo','Paseo del Descubrimiento 1492',90123456,'carlos.pinedo@gmail.com','1991-01-25','2024-04-03',6,'Carlos',153794628,987463521,'male'),(12,1,'Trujillo','Calle de la Esperanza 2024',11234567,'roger.trujillo@gmail.com','1989-03-18','2024-04-03',6,'Roger',347182569,993182657,'male'),(13,1,'Paz','Ruta de la Aventura 4040',22345678,'xiomara.paz@gmail.com','1994-06-30','2024-04-03',1,'Xiomara',628394715,942876531,'female'),(14,1,'Sandoval','Calle Nunca Muera 231',33456789,'federico.sandoval@gmail.com','1986-10-10','2024-04-03',1,'Federico',632515236,956374812,'male'),(15,1,'Sousa','Jr. Talara 24',71404628,'petronila.sousa@gmail.com','1956-07-16','2024-07-13',2,'Petronila',123546289,924212725,'felame'),(16,1,'Guevara','Avenida Peru 123',85426315,'Jguevara@gmail.com','1994-10-24','2024-07-13',4,'Julio',985123548,985632154,'male'),(17,1,'alvarez','Av.peru 1213',52136458,'juanavarez@gmail.com','1195-10-24','2024-07-15',8,'Juan',326541458,954215563,'male'),(18,1,'nuñes','Avenida Peru 123',52136458,'marianuez@gmail.com','1195-10-24','2024-07-15',9,'Maria',326541458,954215563,'felame'),(19,1,'Guevara','Calle de la Esperanza 2024',11234567,'rogerguevara@gmail.com','1986-10-10','2024-07-15',7,'Roger',326541458,956374812,'male');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-16  0:12:37
