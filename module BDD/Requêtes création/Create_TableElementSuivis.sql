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

-- --------------------------------------------------------

--
-- Structure de la table `ElementsSuivis`
--

CREATE TABLE IF NOT EXISTS `ElementsSuivis` (
`ES_id` int(11) NOT NULL,
  `examen_type` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `examen_libelle` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `valeur_1` float NOT NULL,
  `unite_1` varchar(25) COLLATE latin1_general_ci NOT NULL,
  `valeur_2` float DEFAULT NULL,
  `unite_2` varchar(25) COLLATE latin1_general_ci DEFAULT NULL,
  `resultat_test` varchar(25) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `ElementsSuivis`
--
ALTER TABLE `ElementsSuivis`
 ADD PRIMARY KEY (`ES_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `ElementsSuivis`
--
ALTER TABLE `ElementsSuivis`
MODIFY `ES_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
