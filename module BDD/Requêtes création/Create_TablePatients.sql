-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:34
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
-- Structure de la table `Patients`
--

CREATE TABLE IF NOT EXISTS `Patients` (
`patient_id` int(11) NOT NULL,
  `num_NSS` varchar(15) COLLATE latin1_general_ci NOT NULL,
  `nom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `prenom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `sexe` char(1) COLLATE latin1_general_ci NOT NULL,
  `date_naissance` varchar(12) COLLATE latin1_general_ci NOT NULL,
  `mutuelle` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `adresse` varchar(128) COLLATE latin1_general_ci DEFAULT NULL,
  `ville` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `code_postal` int(11) DEFAULT NULL,
  `telephone_fixe` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `telephone_mobile` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `pole_id` int(11) NOT NULL,
  `services_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Patients`
--
ALTER TABLE `Patients`
 ADD PRIMARY KEY (`patient_id`), ADD UNIQUE KEY `num_NSS` (`num_NSS`), ADD KEY `FK_Patients_pole_id` (`pole_id`), ADD KEY `FK_Patients_services_id` (`services_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Patients`
--
ALTER TABLE `Patients`
MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `Patients`
--
ALTER TABLE `Patients`
ADD CONSTRAINT `FK_Patients_pole_id` FOREIGN KEY (`pole_id`) REFERENCES `Poles` (`pole_id`),
ADD CONSTRAINT `FK_Patients_services_id` FOREIGN KEY (`services_id`) REFERENCES `Services` (`services_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
