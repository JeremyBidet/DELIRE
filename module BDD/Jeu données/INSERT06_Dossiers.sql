-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Ven 05 Février 2016 à 20:16
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
-- Contenu de la table `Dossiers`
--

INSERT INTO `Dossiers` (`num_dossier`, `libelle`, `created`, `patient_id`) VALUES
(1, 'NSS2016D0001', '2016-02-03 14:59:00', 1),
(2, 'NSS2016D0002', '2016-02-03 15:00:00', 2),
(3, 'NSS2016D0003', '2016-02-03 15:00:00', 4),
(4, 'NSS2016D0004', '2016-02-03 15:00:00', 5),
(5, 'NSS2016D0005', '2016-02-03 15:00:00', 3),
(6, 'NSS2016D0006', '2016-02-03 15:00:00', 6),
(7, 'NSS2016D0007', '2016-02-04 08:00:00', 7),
(8, 'NSS2016D0008', '2016-02-04 08:00:00', 8);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
