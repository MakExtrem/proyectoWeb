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
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cita` (
  `id` int NOT NULL AUTO_INCREMENT,
  `estado` int DEFAULT NULL,
  `fecha_atencion` varchar(255) DEFAULT NULL,
  `fecha_registro` varchar(255) DEFAULT NULL,
  `hora_atencion` varchar(255) DEFAULT NULL,
  `id_medico` int DEFAULT NULL,
  `id_paciente` int DEFAULT NULL,
  `id_user` int DEFAULT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  `nombre_medico` varchar(255) DEFAULT NULL,
  `nombre_paciente` varchar(255) DEFAULT NULL,
  `especialidad_medico` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` VALUES (1,0,'2023-04-13','2024-04-03','10:00',8,1,1,'todo ok','Joel Mendoza','Elvis Prueba','Medicina General'),(2,1,'2023-04-03','2023-04-03','01:47',2,1,1,'todo ok','Carlos Martinez','Elvis Prueba','Medicina General'),(3,1,'2023-04-03','2023-04-03','20:36',2,1,1,'Llegare 15 minutos tarde','Carlos Martinez','Elvis Prueba','Medicina General'),(4,1,'2023-04-03','2023-04-03','18:57',4,1,1,'todo ok','Jose Pachas','Elvis Prueba','Cardiología'),(20,1,'2024-05-03','2024-05-26','02:35',1,1,1,'Llegare 15 minutos tarde','Pedro Garcia','Elvis Prueba','Dermatologia'),(21,1,'2024-05-04','2024-05-26','23:40',1,1,1,'Llegare 15 minutos tarde','Pedro Garcia','Elvis Prueba','Dermatologia'),(22,1,'2024-05-05','2024-05-27','02:07',2,1,1,'Llegare 15 minutos tarde','Carlos Martinez','Elvis Prueba','Medicina General'),(23,1,'2024-05-10','2024-05-27','02:08',8,1,1,'No ire','Joel Mendoza','Elvis Prueba','Medicina General'),(24,1,'2024-05-04','2024-05-27','02:13',1,1,1,'No ire','Pedro Garcia','Elvis Prueba','Dermatologia'),(54,1,'2024-05-04','2024-05-27','02:20',8,1,1,'No ire','Joel Mendoza','Elvis Prueba','Medicina General'),(55,1,'2024-05-11','2024-05-27','01:22',8,1,1,'No ire','Joel Mendoza','Elvis Prueba','Medicina General'),(57,1,'2024-05-12','2024-05-27','02:52',8,1,1,'No ire','Joel Mendoza','Elvis Prueba','Medicina General'),(59,1,'2024-05-30','2024-05-27','20:00',3,1,1,'Llegare un poco tarde','Kim Pachas','Elvis Prueba','Dermatologia'),(60,1,'2024-05-29','2024-05-27','10:20',4,1,1,'Alisten un silla de Ruedas','Jose Pachas','Elvis Prueba','Cardiología'),(61,1,'2024-05-24','2024-05-30','22:41',8,3,3,'Ninguna','Joel Mendoza','Mario Delgado','Medicina General'),(62,1,'2024-05-16','2024-05-30','00:19',8,1,1,'Llegare 15 minutos tarde','Joel Mendoza','Elvis Prueba','Medicina General'),(63,1,'2024-05-31','2024-05-30','03:00',1,1,1,'Llegare 30 minutos tarde','Pedro Garcia','Elvis Prueba','Dermatologia'),(64,1,'2024-05-31','2024-05-30','03:00',4,1,1,'llegare 15 minutos tarde','Jose Pachas','Elvis Prueba','Cardiología'),(65,1,'2024-06-30','2024-06-30','13:12',13,1,1,'Prueba tablas','Xiomara Paz','Elvis Prueba','Dermatologia'),(66,1,'2024-06-30','2024-06-30','17:16',13,1,1,'Prueba tablas','Xiomara Paz','Elvis Prueba','Dermatologia'),(67,1,'2024-06-23','2024-06-30','14:23',1,1,1,'Prueba tablas','Pedro  Garcia','Elvis Prueba','Dermatologia'),(68,1,'2024-06-06','2024-06-30','23:23',13,1,1,'Prueba tablas','Xiomara Paz','Elvis Prueba','Dermatologia'),(69,1,'2024-06-07','2024-06-30','14:59',8,1,1,'Ninguna','Joel Mendoza','Elvis Prueba','Medicina General'),(70,1,'2024-05-31','2024-06-30','15:20',8,1,1,'Prueba tablas','Joel Mendoza','Elvis Prueba','Medicina General'),(71,1,'2024-07-13','2024-07-13','10:50',11,8,8,'Prueba tablas','Carlos Pinedo','Arleth Salazar','Oftalmología'),(72,1,'2024-07-12','2024-07-13','13:50',12,9,9,'Ninguna','Roger Trujillo','Suemmi Perez','Oftalmología'),(73,1,'2024-07-10','2024-07-13','13:30',4,9,9,'Ninguna','Jose Pachas','Suemmi Perez','Cardiología'),(74,1,'1994-07-13','2024-07-13','07:50',14,5,5,'Ninguno','Federico Sandoval','Momote Foreman','Dermatologia'),(75,1,'2024-07-13','2024-07-13','08:30',7,5,5,'Ninguno','Martin Pachas','Momote Foreman','Medicina intensiva'),(76,1,'1995-07-13','2024-07-13','10:10',7,9,9,'Ninguna','Martin Pachas','Suemmi Perez','Medicina intensiva'),(77,1,'2024-07-13','2024-07-13','10:00',10,5,5,'Ninguna','Maria Gonzales','Momote Foreman','Psiquiatría'),(78,1,'2024-07-11','2024-07-13','15:00',7,8,8,'Ninguna','Martin Pachas','Arleth Salazar','Medicina intensiva'),(79,1,'2024-08-10','2024-07-13','16:10',16,5,5,'Llegare 15 minutos tarde','Julio Guevara','Momote Foreman','Medicina intensiva'),(80,1,'2024-10-24','2024-07-13','12:00',4,10,10,'ninguna','Jose Pachas','Percy Perez','Cardiología'),(81,1,'2024-07-13','2024-07-13','11:00',12,8,8,'Ninguna','Roger Trujillo','Arleth Salazar','Oftalmología'),(82,1,'2024-11-10','2024-07-13','15:00',10,11,11,'llegare 15 minutos tarde','Maria Gonzales','Kevin Solorzano','Psiquiatría'),(83,1,'2024-07-14','2024-07-14','13:00',8,8,8,'Ninguna','Joel Mendoza','Arleth Salazar','Medicina General'),(84,1,'2024-07-14','2024-07-14','15:00',2,9,9,'Ninguna','Carlos Martinez','Suemmi Perez','Medicina General'),(85,1,'2024-10-24','2024-07-15','15:24',8,5,5,'Ninguna','Joel Mendoza','Momote Foreman','Medicina General'),(86,1,'1995-10-24','2024-07-15','20:10',4,5,5,'Ninguna\n','Jose Pachas','Momote Foreman','Cardiología'),(87,0,'2024-07-10','2024-07-15','23:00',19,5,5,'Ninguna','Roger Guevara','Momote Foreman','Ginecologia');
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
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
