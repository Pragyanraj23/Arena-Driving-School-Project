-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: drivingschooldb
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `addprogram`
--

DROP TABLE IF EXISTS `addprogram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addprogram` (
  `pname` varchar(50) NOT NULL,
  `fees` int NOT NULL,
  `discription` varchar(255) NOT NULL,
  PRIMARY KEY (`pname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addprogram`
--

LOCK TABLES `addprogram` WRITE;
/*!40000 ALTER TABLE `addprogram` DISABLE KEYS */;
INSERT INTO `addprogram` VALUES ('2-months',6000,'Good at two wheeler'),('3months program',5000,'Good at two wheeler'),('5months',10000,'personal trainer'),('8 months',150000,'provide vechile and pesonal trainer');
/*!40000 ALTER TABLE `addprogram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_detail`
--

DROP TABLE IF EXISTS `admin_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_detail` (
  `id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `number` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_detail`
--

LOCK TABLES `admin_detail` WRITE;
/*!40000 ALTER TABLE `admin_detail` DISABLE KEYS */;
INSERT INTO `admin_detail` VALUES ('admin','admin','admin@gmail.com','6391081905');
/*!40000 ALTER TABLE `admin_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactus`
--

DROP TABLE IF EXISTS `contactus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactus` (
  `serialno` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone_no` varchar(10) NOT NULL,
  `query` varchar(256) NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`serialno`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactus`
--

LOCK TABLES `contactus` WRITE;
/*!40000 ALTER TABLE `contactus` DISABLE KEYS */;
INSERT INTO `contactus` VALUES (1,'Ayush Pandey','Ayush533653p@gmail.com','54574677','gjgvkhk',NULL),(2,'Ayush Pandey','Ayush533653p@gmail.com','6391081905','good execellent','2024-03-30'),(3,'Ayush Kumar Pandey','Ayush533653p@gmail.com','6387882043','very good','2024-04-01'),(4,'Ayush Kumar Pandey','Ayush533653p@gmail.com','6387882043','very good','2024-04-02'),(5,'Ayush Kumar Pandey','Ayush533653p@gmail.com','6387882043','very good','2024-04-02'),(6,'Ayush Kumar Pandey','Ayush533653p@gmail.com','6391081905','execellent','2024-04-02'),(7,'aditya kumar pandey','aditya@gmail.com','6391081905','Query regarding location','2024-05-16'),(8,'Suraj','rajmaurya1686@gmail.com','9919932198','I wanna contact to you\r\n','2024-05-18');
/*!40000 ALTER TABLE `contactus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `serialno` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `review` varchar(255) NOT NULL,
  `rating` varchar(256) NOT NULL,
  PRIMARY KEY (`serialno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,'Ayush','Ayush533653p@gmail.com','very good','5'),(2,'Ayush Kumar Pandey','Ayush533653p@gmail.com','very good','5'),(3,'Ayush Kumar Pandey','Ayush533653p@gmail.com','very good','5'),(4,'Ayush Kumar Pandey','Ayush533653p@gmail.com','very good','5'),(5,'Ayush Kumar Pandey','Ayush533653p@gmail.com','very good','5'),(6,'Ayush Pandey','Ayush533653p@gmail.com','very good','3');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news_announcement`
--

DROP TABLE IF EXISTS `news_announcement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `news_announcement` (
  `serialno` int NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`serialno`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_announcement`
--

LOCK TABLES `news_announcement` WRITE;
/*!40000 ALTER TABLE `news_announcement` DISABLE KEYS */;
INSERT INTO `news_announcement` VALUES (1,'10%DISCOUNT','2024-04-13');
/*!40000 ALTER TABLE `news_announcement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ride_log`
--

DROP TABLE IF EXISTS `ride_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ride_log` (
  `ride_id` int NOT NULL AUTO_INCREMENT,
  `trainer_id` varchar(45) NOT NULL,
  `trainee_id` varchar(45) NOT NULL,
  `source` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `duration` varchar(205) NOT NULL,
  `performance` varchar(255) NOT NULL,
  `devices` varchar(255) NOT NULL,
  `vehicle` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  PRIMARY KEY (`ride_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ride_log`
--

LOCK TABLES `ride_log` WRITE;
/*!40000 ALTER TABLE `ride_log` DISABLE KEYS */;
INSERT INTO `ride_log` VALUES (1,'Aman1234','trainne001','bbd','chinhat','4 hours','good','15454','up53 4587','2024-05-16'),(2,'Aman1234','trainne001','bbd','chinhat','4 hours','good','15454','up53 4587','2024-05-17');
/*!40000 ALTER TABLE `ride_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tadmmisionrcv_form`
--

DROP TABLE IF EXISTS `tadmmisionrcv_form`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tadmmisionrcv_form` (
  `admissionid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(255) NOT NULL,
  `age` int NOT NULL,
  `program` varchar(100) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `date` date NOT NULL,
  `phoneno` varchar(45) NOT NULL,
  `id` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `fees` int DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `trainerid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`admissionid`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tadmmisionrcv_form`
--

LOCK TABLES `tadmmisionrcv_form` WRITE;
/*!40000 ALTER TABLE `tadmmisionrcv_form` DISABLE KEYS */;
INSERT INTO `tadmmisionrcv_form` VALUES (21,'Ayush Pandey','ayush533653p@gmail.com','Silver line\r\nSilver line apartment',23,'2-months','male','2024-05-09','6387882043','trainee1','trainee1',6000,'Confirmed','Aman123'),(22,'Ayush Pandey','ayush533653p@gmail.com','Silver line\r\nSilver line apartment',23,'2-months','male','2024-05-09','6387882043','trainee00','0000',6000,'Confirmed','Aman123'),(23,'Anish kumar pandey','anish@gmail.com','village +post Sohanpur Deoria Uttar Pradesh',18,'3months program','male','2024-05-09','65656565','trainne001','01010',5000,'Confirmed','Aman1234'),(24,'aditya pandey','Aditya@gmail.com','gorakhpur',20,'5months','male','2024-05-09','6387882043','trainnee1234','1230',10000,'Confirmed','Aman1234'),(25,'saurya pandey','saurya@gmail.com','village +post Sohanpur Deoria Uttar Pradesh',18,'8 months','male','2024-05-09','63878799','saurya1200','1200',150000,'Confirmed',NULL),(26,'vikash singh','vikash@gmail.com','hakma',24,'8 months','male','2024-05-09','48484848','vikash0000','0303',150000,'Confirmed',NULL),(28,'Raj','raj@123gmail.com','Lucknow ,indira nagar',22,'8 months','male','2024-05-18','8520142525',NULL,NULL,NULL,'Not Confirm',NULL),(29,'suraj','suraj@123gmail.com','Lucknow ,indira nagar',22,'2-months','male','2024-05-18','8520142525',NULL,NULL,NULL,'Not Confirm',NULL),(31,'surajMohan','surajmohan@123gmail.com','Lucknow ,indira nagar',55,'2-months','male','2024-05-18','7850236456',NULL,NULL,NULL,'Not Confirm',NULL);
/*!40000 ALTER TABLE `tadmmisionrcv_form` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trainerregistration`
--

DROP TABLE IF EXISTS `trainerregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trainerregistration` (
  `userid` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `experince` varchar(100) NOT NULL,
  `discription` varchar(100) NOT NULL,
  `address` varchar(252) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainerregistration`
--

LOCK TABLES `trainerregistration` WRITE;
/*!40000 ALTER TABLE `trainerregistration` DISABLE KEYS */;
INSERT INTO `trainerregistration` VALUES ('Aman123','aman1234','Ayush Pandey','ayush533653p@gmail.com','6387882043','5 year','Good at two wheeler','Gorakhpur ,Rustampur Azad Chowk'),('Aman1234','aman1234','Ayush Kumar Pandey','Ayush533653p@gmail.com','6391081905','5 year','Good at two wheeler','Village+post sohanpur uttar pradesh');
/*!40000 ALTER TABLE `trainerregistration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-21 10:44:49
