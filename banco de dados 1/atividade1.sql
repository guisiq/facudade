CREATE DATABASE  IF NOT EXISTS `unitins_faculdade` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `unitins_faculdade`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: unitins_faculdade
-- ------------------------------------------------------
-- Server version    8.0.18

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
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno` (
  `idaluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idaluno`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Jose da Silva','1234567890','jose@dasilca.com'),(2,'Joao Miguel','0987654321','joao@miguel.com'),(3,'Maria das Dores','123456098','maria@dasdores.com'),(4,'Miguel da Anunciação','09876789','miguel@daanunciacao.com'),(5,'Maria Joaquina de Amaral Pereira Goes','098709','maria@japg.com');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `idcurso` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `carga_horaria` int(11) DEFAULT NULL,
  `periodos` int(11) DEFAULT NULL,
  PRIMARY KEY (`idcurso`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Sistemas de Informação',3000,8),(2,'Engenharia da Computação',3600,9),(3,'Ciências Ocultas',2500,7),(4,'Letras Mal Escritas',2000,4);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disciplina` (
  `iddisciplina` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `carga_horaria` int(11) DEFAULT NULL,
  `ementa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`iddisciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplina`
--

LOCK TABLES `disciplina` WRITE;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` VALUES (1,'Banco de Dados II',60,'Tudo que você queria saber sobre bancos de dados e não tinha para quem perguntar'),(2,'Informática Básica',30,'Nada de interessante'),(3,'Introdução às Ciências Ocultas',30,'Tópicos Iniciais'),(4,'Caligrafia',40,'Bê-a-bá'),(5,'Decifragem de garranchos',40,'Boa sorte na tentativa'),(6,'Computação gráfica',60,'Modelagem 3D'),(7,'Aspectos teóricos da computação',60,'Análise de algoritmos');
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listaespera`
--

DROP TABLE IF EXISTS `listaespera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listaespera` (
  `aluno` int(11) NOT NULL,
  `oferta` int(11) NOT NULL,
  PRIMARY KEY (`aluno`,`oferta`),
  KEY `lista_oferta_idx` (`oferta`),
  CONSTRAINT `lista_aluno` FOREIGN KEY (`aluno`) REFERENCES `aluno` (`idaluno`),
  CONSTRAINT `lista_oferta` FOREIGN KEY (`oferta`) REFERENCES `oferta` (`idoferta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listaespera`
--

LOCK TABLES `listaespera` WRITE;
/*!40000 ALTER TABLE `listaespera` DISABLE KEYS */;
INSERT INTO `listaespera` VALUES (1,1),(2,2),(3,3),(4,4),(5,5);
/*!40000 ALTER TABLE `listaespera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `idmatricula` int(11) NOT NULL AUTO_INCREMENT,
  `aluno` int(11) NOT NULL,
  `oferta` int(11) NOT NULL,
  `A1` float DEFAULT NULL,
  `A2` float DEFAULT NULL,
  `Exame` float DEFAULT NULL,
  `MediaFinal` float DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idmatricula`,`aluno`,`oferta`),
  KEY `aluno_idx` (`aluno`),
  KEY `oferta_idx` (`oferta`),
  CONSTRAINT `aluno` FOREIGN KEY (`aluno`) REFERENCES `aluno` (`idaluno`),
  CONSTRAINT `oferta` FOREIGN KEY (`oferta`) REFERENCES `oferta` (`idoferta`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
INSERT INTO `matricula` VALUES (1,1,1,8,7,NULL,7.5,'Aprovado'),(2,1,2,7,7,NULL,7,'Aprovado'),(3,1,3,6,6,9,7.5,'Aprovado'),(4,2,1,7,7,NULL,7,'Aprovado'),(5,3,1,8,8,NULL,8,'Aprovado'),(6,4,1,8,8,NULL,8,'Aprovado');
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oferta`
--

DROP TABLE IF EXISTS `oferta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oferta` (
  `idoferta` int(11) NOT NULL AUTO_INCREMENT,
  `disciplina` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `professor` int(11) NOT NULL,
  `semestre` varchar(45) NOT NULL,
  `dia` varchar(9) NOT NULL,
  PRIMARY KEY (`idoferta`,`disciplina`,`curso`,`professor`,`semestre`,`dia`),
  KEY `disc_idx` (`disciplina`),
  KEY `prof_idx` (`professor`),
  KEY `cur_idx` (`curso`),
  CONSTRAINT `cur` FOREIGN KEY (`curso`) REFERENCES `curso` (`idcurso`),
  CONSTRAINT `disc` FOREIGN KEY (`disciplina`) REFERENCES `disciplina` (`iddisciplina`),
  CONSTRAINT `prof` FOREIGN KEY (`professor`) REFERENCES `professor` (`idprofessor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oferta`
--

LOCK TABLES `oferta` WRITE;
/*!40000 ALTER TABLE `oferta` DISABLE KEYS */;
INSERT INTO `oferta` VALUES (1,1,1,1,'2015-2','segunda'),(2,1,2,1,'2015-2','terça'),(3,2,2,2,'2015-2','quarta'),(4,3,2,3,'2015-2','quinta'),(5,4,2,2,'2015-2','sexta'),(6,5,3,4,'2015-2','segunda'),(7,6,4,4,'2015-2','terça'),(8,7,1,3,'2015-2','sexta');
/*!40000 ALTER TABLE `oferta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `idprofessor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `cpf` int(11) DEFAULT NULL,
  `titulacao` varchar(45) DEFAULT NULL,
  `graduacao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idprofessor`,`nome`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (1,'Chavier','chavier@xmen.com',9876,'doutor','psicologia'),(2,'Vinicius','vinicius@unitins.com',1234,'mestre','sistemas de informacao'),(3,'Silvano','silvano@unitins.com',987890,'mestre','Ciência da Computação'),(4,'Igor Yepes','igor@unitins.com',989098,'mestre','Ciência da Computação');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-23 17:14:07
