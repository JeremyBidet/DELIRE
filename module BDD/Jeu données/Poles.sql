-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Jeu 04 Février 2016 à 09:44
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
-- Vider la table avant d'insérer `Poles`
--

TRUNCATE TABLE `Poles`;
--
-- Contenu de la table `Poles`
--
SET FOREIGN_KEY_CHECKS=0;

INSERT INTO `Poles` (`pole_id`, `libelle_pole`, `personnelResponsable_id`) VALUES
(1, 'Urgence', 6),
(2, 'Imagerie', 5),
(3, 'Appareil Locomoteur', 2),
(4, 'Biologie - Pathologie - Physiolo', 3),
(5, 'DUNEGO', 4),
(6, 'Neuroscience', 7),
(7, 'IMAGINE', 1),
(8, 'PREBLOC', 15);

SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
