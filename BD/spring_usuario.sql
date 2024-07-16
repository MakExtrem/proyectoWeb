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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `rol` enum('USER','ADMIN','MODERATOR') DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'user@gmail.com','$2a$10$GFxl7AsdYDs8k6smhYnTqO0dpZNYLiQ0aX3v1SS.e2c2pBZJuwxlq','USER','Userprueba'),(2,'elvislevano95@gmail.com','$2a$10$eK5D3VAMa3frqd1CakCVv.5RaMUph0R5R3fAZo2PTJF/AEQBPynIS','MODERATOR','Esandoval'),(3,'mario@gmail.com','$2a$10$xi3Gm8VPRt2hoV73bStMdOluWc2ZLkIXRxRNGprszJl8r9YEbiPpO','USER','Mdelgado'),(4,'pedro@gmail.com','$2a$10$XDHYAFtrx1MX3N/sQfaypuabalw43BXA8YK9FDFZdXuyVCZvHWVQu','USER','Pmorte'),(5,'Momo@gmail.com','$2a$10$AS3lx9jPrYMj.WwtZ1Gwbu1rBWJdejjD6QzuplqQfIgQ7p0F/p38W','USER','Momo'),(6,'jose@gmail.com','$2a$10$ctk2NCa9clUiSPv1g0UyJuMsX6euaqBUkXyGL1hOqV9po4suYjwTO','USER','Jose'),(7,'cielo@gmail.com','$2a$10$h4ztieX2tZBNfkHV5xHAHeNQ8ucO3TB4GBv9do2ovRYdku/Oxnzti','USER','Cielo'),(8,'arleth@gmail.com','$2a$10$Yvft3yDu4SZb6UFkSfJQVuqNqNxv/4C.JqM1Y6VYy/wmJGxHk/ZIu','USER','Karleth'),(9,'suemi@gmail.com','$2a$10$0M7TJ5sCxKii3lfz5hhpGuzr8manKQj7E6fNxPkCQ17qsBQIADMIC','USER','Sue'),(10,'Percy@gmail.com','$2a$10$EkwMYfLhQFEqr5XTmAhzxuKKAwAsgT6LJa.POO27ynWcb9ZcgWMAK','USER','ext1234'),(11,'kevin@gmail.com','$2a$10$V2HDFUJCJD9lMOA6anhlleUYuybA6P41jw6h4s.G35sfxnlqlyN0a','USER','Force'),(12,'dioni@gmail.com','$2a$10$i8vk4/NtEqhYNavO8uJibOK6pVeIBb0vpySugzRdX8l9VpaS/.oq.','USER','Dornt'),(13,'alex@gmail.com','$2a$10$sIiHB5r5lgnEVKmHmyfSseTnM3gHNC2mbj/SP8LhGrc5O/9XZGWv2','USER','Alex1995'),(14,'juan@gmail.com','$2a$10$.qbIAj.LOR7e7ih4KSPxAOFpUr4du1OM9m4UTZ9jADwr0bWzpgmS6','USER','juan');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
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
