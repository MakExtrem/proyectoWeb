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
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `activo` int DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `dni` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` varchar(255) DEFAULT NULL,
  `fecha_registro` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `iduser` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,0,'Prueba',69898828,'user@gmail.com','1995-04-03','2024-04-03','male','Elvis',956321547,1),(2,1,'Sandoval',57891516,'elvislevano95@gmail.com','1995-04-03','2024-04-03','male','Joel',975148508,2),(3,1,'Delgado',22712660,'mario@gmail.com','1995-04-03','2024-04-03','male','Mario',924620663,3),(4,1,'Morte',19087579,'pedro@gmail.com','1995-04-03','2024-04-03','male','Pedro',979223017,4),(5,1,'Foreman',79006106,'Momo@gmail.com','1995-04-03','2024-04-03','male','Momote',990034092,5),(6,1,'Farrell',28379410,'jose@gmail.com','1995-04-03','2024-04-03','male','Jose',902500767,6),(7,1,'Joj',12545631,'cielo@gmail.com','1995-05-03','2024-04-03','female','Cielo',924212726,7),(8,1,'Salazar',71404629,'arleth@gmail.com','1994-12-22','2024-07-13','female','Arleth',940065561,8),(9,1,'Perez',76541258,'suemi@gmail.com','1992-05-26','2024-07-13','female','Suemmi',985623157,9),(10,1,'Perez',75632545,'Percy@gmail.com','1996-12-25','2024-07-13','male','Percy',926351245,10),(11,1,'Solorzano',85423654,'kevin@gmail.com','1995-12-25','2024-07-13','ND','Kevin',945236548,11),(12,1,'Perez',85423651,'dioni@gmail.com','1996-01-30','2024-07-15','male','Dionicio',952364125,12),(13,1,'Solorzano',71404629,'alex@gmail.com','1995-10-24','2024-07-15','male','Alex',963258741,13),(14,1,'Tovar',45123654,'juan@gmail.com','1980-10-24','2024-07-15','male','Juan',985623157,14);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
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
