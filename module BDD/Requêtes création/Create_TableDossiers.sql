-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 10:44
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
-- Structure de la table `Dossiers`
--

CREATE TABLE IF NOT EXISTS `Dossiers` (
`num_dossier` int(11) NOT NULL,
  `libelle` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `created` datetime DEFAULT NULL,
  `patient_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Dossiers`
--
ALTER TABLE `Dossiers`
 ADD PRIMARY KEY (`num_dossier`), ADD UNIQUE KEY `libelle` (`libelle`), ADD KEY `FK_Dossiers_patient_id` (`patient_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Dossiers`
--
ALTER TABLE `Dossiers`
MODIFY `num_dossier` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `Dossiers`
--
ALTER TABLE `Dossiers`
ADD CONSTRAINT `FK_Dossiers_patient_id` FOREIGN KEY (`patient_id`) REFERENCES `Patients` (`patient_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
