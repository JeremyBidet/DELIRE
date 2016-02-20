-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 10:37
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

-- --------------------------------------------------------

--
-- Structure de la table `Allergies`
--

CREATE TABLE IF NOT EXISTS `Allergies` (
  `antecedent_id` int(11) NOT NULL,
  `allergie_libelle` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `code_CIM10` varchar(16) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Allergies`
--
ALTER TABLE `Allergies`
 ADD PRIMARY KEY (`antecedent_id`), ADD UNIQUE KEY `allergie_libelle` (`allergie_libelle`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `Allergies`
--
ALTER TABLE `Allergies`
ADD CONSTRAINT `FK_Allergies_antecedent_id` FOREIGN KEY (`antecedent_id`) REFERENCES `Antecedents` (`antecedent_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
