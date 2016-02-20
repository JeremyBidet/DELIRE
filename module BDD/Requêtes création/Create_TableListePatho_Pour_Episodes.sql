-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:20
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
-- Structure de la table `ListePatho_Pour_Episodes`
--

CREATE TABLE IF NOT EXISTS `ListePatho_Pour_Episodes` (
  `epOuvert_id` int(11) NOT NULL,
  `patho_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `ListePatho_Pour_Episodes`
--
ALTER TABLE `ListePatho_Pour_Episodes`
 ADD PRIMARY KEY (`epOuvert_id`,`patho_id`), ADD KEY `FK_ListePatho_Pour_Episodes_patho_id` (`patho_id`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `ListePatho_Pour_Episodes`
--
ALTER TABLE `ListePatho_Pour_Episodes`
ADD CONSTRAINT `FK_ListePatho_Pour_Episodes_epOuvert_id` FOREIGN KEY (`epOuvert_id`) REFERENCES `EpisodesEnCours` (`epOuvert_id`),
ADD CONSTRAINT `FK_ListePatho_Pour_Episodes_patho_id` FOREIGN KEY (`patho_id`) REFERENCES `Pathologies` (`patho_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
