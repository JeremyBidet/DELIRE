-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Ven 05 Février 2016 à 20:14
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
-- Contenu de la table `Allergies`
--

INSERT INTO `Allergies` (`antecedent_id`, `allergie_libelle`, `code_CIM10`) VALUES
(21, 'IgE spécifiques Absinthe - w5', 'AG01'),
(22, 'IgE spécifiques Chat', 'AG05'),
(23, 'IgE spécifiques Abeille (venin) ', 'AGO-AB1'),
(24, 'IgE spécifiques nGly m 5, soja -', 'AG-S1'),
(25, 'IgE spécifiques Champignon - f21', 'AG10K');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
