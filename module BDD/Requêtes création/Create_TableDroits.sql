<<<<<<< HEAD
-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 10:45
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
-- Structure de la table `Droits`
--

CREATE TABLE IF NOT EXISTS `Droits` (
`droit_id` int(11) NOT NULL,
  `role_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `droit_lecture_identite_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_prescriptions_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_prescriptions_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_antecedents_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_antecedents_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_episodes_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_episodes_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_elementSuivis_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_elementSuivis_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_documents_patient` tinyint(4) NOT NULL,
  `droit_ecriture_patien_patient` tinyint(4) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Droits`
--
ALTER TABLE `Droits`
 ADD PRIMARY KEY (`droit_id`), ADD UNIQUE KEY `role_libelle` (`role_libelle`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Droits`
--
ALTER TABLE `Droits`
MODIFY `droit_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
=======
#------------------------------------------------------------
# Table: Droits
#------------------------------------------------------------

CREATE TABLE Droits(
        droit_id                             int (11) Auto_increment  NOT NULL ,
        role_libelle                         Varchar (32) NOT NULL ,
        droit_lecture_identite_patient       Bool ,
        droit_lecture_prescriptions_patient  Bool ,
        droit_ecriture_prescriptions_patient Bool ,
        droit_lecture_antecedents_patient    Bool ,
        droit_ecriture_antecedents_patient   Bool ,
        droit_lecture_episodes_patient       Bool ,
        droit_ecriture_episodes_patient      Bool ,
        droit_lecture_elementSuivis_patient  Bool ,
        droit_ecriture_elementSuivis_patient Bool ,
        droit_ecriture_dossier_patient		 Bool ,
        droit_lecture_dossiers_patient		 Bool ,
        droit_ecriture_document_patient		 Bool ,
        droit_lecture_document_patient		 Bool ,
        PRIMARY KEY (droit_id )
)ENGINE=InnoDB;

ALTER TABLE Droits ADD CONSTRAINT FK_Droits_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);
>>>>>>> origin/working
