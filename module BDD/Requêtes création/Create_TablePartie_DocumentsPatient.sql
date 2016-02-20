-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:23
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
-- Structure de la table `Partie_DocumentsPatient`
--

CREATE TABLE IF NOT EXISTS `Partie_DocumentsPatient` (
  `doc_id` int(11) NOT NULL,
  `num_dossier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Partie_DocumentsPatient`
--
ALTER TABLE `Partie_DocumentsPatient`
 ADD PRIMARY KEY (`doc_id`,`num_dossier`), ADD KEY `FK_Partie_DocumentsPatient_num_dossier` (`num_dossier`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `Partie_DocumentsPatient`
--
ALTER TABLE `Partie_DocumentsPatient`
ADD CONSTRAINT `FK_Partie_DocumentsPatient_doc_id` FOREIGN KEY (`doc_id`) REFERENCES `Documents` (`doc_id`),
ADD CONSTRAINT `FK_Partie_DocumentsPatient_num_dossier` FOREIGN KEY (`num_dossier`) REFERENCES `Dossiers` (`num_dossier`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
