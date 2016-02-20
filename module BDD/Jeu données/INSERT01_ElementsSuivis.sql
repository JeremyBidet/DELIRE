-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:16
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
-- Contenu de la table `ElementsSuivis`
--

INSERT INTO `ElementsSuivis` (`ES_id`, `examen_type`, `examen_libelle`, `valeur_1`, `unite_1`, `valeur_2`, `unite_2`, `resultat_test`) VALUES
(1, 'Biométrie', 'Diamètre du bassin PRP (femme) ', 13.5, 'cm', NULL, NULL, '13,5 > 12,5 : normal'),
(2, 'Biométrie', 'Tour de taille et tour de hanche (femme)', 70, 'cm', 90, 'cm', '0,77 < 0,8, correct'),
(3, 'Biologie', 'Hémoglobine', 14.1, 'g/dl', NULL, NULL, 'normal, RAS'),
(4, 'Biologie', 'Glycémie', 0.96, 'g/l', NULL, NULL, 'négatif'),
(5, 'Biométrique', 'Tour de taille et tour de hanche (homme) ', 90, 'cm', 110, 'cm', '0,81 < 1 correct');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
