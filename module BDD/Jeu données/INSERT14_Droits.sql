-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 13:39
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

--
-- Contenu de la table `Droits`
--

INSERT INTO `Droits` (`droit_id`, `role_libelle`, `droit_lecture_identite_patient`, `droit_lecture_prescriptions_patient`, `droit_ecriture_prescriptions_patient`, `droit_lecture_antecedents_patient`, `droit_ecriture_antecedents_patient`, `droit_lecture_episodes_patient`, `droit_ecriture_episodes_patient`, `droit_lecture_elementSuivis_patient`, `droit_ecriture_elementSuivis_patient`, `droit_lecture_documents_patient`, `droit_ecriture_documents_patient`, `droit_lecture_dossier_patient`, `droit_ecriture_dossier_patient`) VALUES
(1, 'lecture_identite_patient', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 'lecture_prescriptions_patient', 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(3, 'ecriture_prescriptions_patient', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, 'lecture_antecedents_patient', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 'ecriture_antecedents_patient', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
(6, 'lecture_episodes_patient', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
(7, 'ecriture_episodes_patient', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
(8, 'lecture_elementSuivis_patient', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
(9, 'ecriture_elementSuivis_patient', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
(10, 'toutes_lectures', 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0),
(11, 'toutes_ecritures', 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1),
(12, '_lecture_identite_patient', 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(13, '_lecture_prescriptions_patient', 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(14, '_ecriture_prescriptions_patient', 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(15, '_lecture_antecedents_patient', 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(16, '_ecriture_antecedents_patient', 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1),
(17, '_lecture_episodes_patient', 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1),
(18, '_ecriture_episodes_patient', 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1),
(19, '_lecture_elementSuivis_patient', 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1),
(20, '_ecriture_elementSuivis_patient', 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1),
(21, 'lecture_documents_patient', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
(22, 'ecriture_documents_patient', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
(23, 'lecture_dossier_patient', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
(24, 'ecriture_dossier_patient', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
(25, '_lecture_documents_patient', 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1),
(26, '_ecriture_documents_patient', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1),
(27, '_lecture_dossier_patient', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1),
(28, '_ecriture_dossier_patient', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
