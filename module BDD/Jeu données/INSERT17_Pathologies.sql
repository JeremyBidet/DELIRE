-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:30
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
-- Contenu de la table `Pathologies`
--

INSERT INTO `Pathologies` (`patho_id`, `patho_libelle`, `codeCIM10`) VALUES
(1, 'Diabète', 'E10'),
(2, 'Rhinopharyngite', 'J00'),
(3, 'Rhume', 'J00'),
(4, 'Bronchite chronique', 'J41'),
(5, 'Arthrose', 'MAC'),
(6, 'Entérocèle vaginale', 'N81.5'),
(7, 'Bourdonnement, acouphène', 'H03'),
(8, 'Aura migraineuse', 'G43.1'),
(9, 'Toux grasse', 'R05'),
(10, 'Toux sèche', 'R05'),
(11, 'Toxicomanie', 'F19.2'),
(12, 'Traitement chirurgical glaucome', 'H40'),
(13, 'Tumeur de l''ovaire', 'C56'),
(14, 'Tumeur du sein', 'C50'),
(15, 'Ulcère de l''estomac', 'K25'),
(16, 'Urticaire', 'L50.9'),
(17, 'Varicelle', 'B01.9'),
(18, 'Paludisme', 'B50'),
(19, 'Rougeole', 'B05'),
(20, 'Rubéole', 'B06'),
(21, 'Cancer de l''utérus', 'C55'),
(22, 'Cancer de la prostate', 'C61'),
(23, 'Grippe avec symptômes grippaux', 'J09'),
(24, 'Gastro-entérite virale', 'K06'),
(25, 'Angine', 'J02');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
