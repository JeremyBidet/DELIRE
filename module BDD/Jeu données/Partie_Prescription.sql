-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:29
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
-- Contenu de la table `Partie_Prescription`
--

INSERT INTO `Partie_Prescription` (`prescription_id`, `num_dossier`, `date_debut`, `date_fin`, `personnel_id`, `created`) VALUES
(2, 1, '30-01-2016', '05-02-2016', 13, '2016-02-05 12:00:00'),
(3, 6, '05-09-2015', '11-09-2015', 2, '2015-09-05 00:00:00'),
(4, 1, '30-01-2016', '05-02-2016', 13, '2016-02-05 12:00:00'),
(8, 7, '03-11-2015', '05-02-2016', 11, '2015-11-03 13:13:19'),
(12, 7, '05-02-2014', NULL, 1, '2014-02-03 15:00:00'),
(19, 4, '03-05-2012', NULL, 5, '0000-00-00 00:00:00'),
(22, 5, '02-05-2013', NULL, 10, '2013-05-02 00:00:00'),
(22, 6, '01-11-2014', NULL, 7, '2014-11-01 00:00:00'),
(27, 3, '27-05-2015', NULL, 6, '2015-05-27 00:00:00'),
(30, 3, '09-07-2015', NULL, 5, '2015-07-09 00:00:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
