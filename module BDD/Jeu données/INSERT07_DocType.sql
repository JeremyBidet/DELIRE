-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Ven 05 Février 2016 à 20:15
-- Version du serveur :  5.5.40-0+wheezy1-log
-- Version de PHP :  5.6.14-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `jchattou_db`
--

--
-- Contenu de la table `DocType`
--

INSERT INTO `DocType` (`docType_id`, `type`, `label`) VALUES
(1, 10, 'Biologie prescription'),
(2, 10, 'Prescription médicaments'),
(3, 10, 'Prescription divers'),
(4, 10, 'Prescription imagerie'),
(5, 10, 'Prescription Kinésithérapie'),
(6, 10, 'Prescription soin infirmier'),
(7, 20, 'Certificat'),
(8, 20, 'Cerfa'),
(9, 30, 'Lettre'),
(10, 30, 'D.M.S');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
