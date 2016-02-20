-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:35
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
-- Structure de la table `Personnels`
--

CREATE TABLE IF NOT EXISTS `Personnels` (
`personnel_id` int(11) NOT NULL,
  `nom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `prenom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `num_adeli` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `num_RPPS` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `telephone_mobile` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `telephone_fixe` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `pole_id` int(11) NOT NULL,
  `poleResponsable_id` int(11) NOT NULL,
  `services_id` int(11) NOT NULL,
  `servicesResponsable_id` int(11) NOT NULL,
  `specialite_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Personnels`
--
ALTER TABLE `Personnels`
 ADD PRIMARY KEY (`personnel_id`), ADD KEY `FK_Personnels_pole_id` (`pole_id`), ADD KEY `FK_Personnels_pole_id_Poles` (`poleResponsable_id`), ADD KEY `FK_Personnels_services_id` (`services_id`), ADD KEY `FK_Personnels_services_id_Services` (`servicesResponsable_id`), ADD KEY `FK_Personnels_specialite_id` (`specialite_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Personnels`
--
ALTER TABLE `Personnels`
MODIFY `personnel_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
