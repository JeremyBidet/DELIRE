-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:19
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
-- Structure de la table `ListeMeds_Pour_Prescriptions`
--

CREATE TABLE IF NOT EXISTS `ListeMeds_Pour_Prescriptions` (
  `prescription_id` int(11) NOT NULL,
  `med_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `ListeMeds_Pour_Prescriptions`
--
ALTER TABLE `ListeMeds_Pour_Prescriptions`
 ADD PRIMARY KEY (`prescription_id`,`med_id`), ADD KEY `FK_ListeMeds_Pour_Prescriptions_med_id` (`med_id`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `ListeMeds_Pour_Prescriptions`
--
ALTER TABLE `ListeMeds_Pour_Prescriptions`
ADD CONSTRAINT `FK_ListeMeds_Pour_Prescriptions_med_id` FOREIGN KEY (`med_id`) REFERENCES `Medicaments` (`med_id`),
ADD CONSTRAINT `FK_ListeMeds_Pour_Prescriptions_prescription_id` FOREIGN KEY (`prescription_id`) REFERENCES `Prescriptions` (`prescription_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
