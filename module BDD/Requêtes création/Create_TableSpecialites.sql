-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:41
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
-- Structure de la table `Specialites`
--

CREATE TABLE IF NOT EXISTS `Specialites` (
`specialite_id` int(11) NOT NULL,
  `specialite_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Specialites`
--
ALTER TABLE `Specialites`
 ADD PRIMARY KEY (`specialite_id`), ADD UNIQUE KEY `specialite_libelle` (`specialite_libelle`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Specialites`
--
ALTER TABLE `Specialites`
MODIFY `specialite_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
