-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Jeu 04 Février 2016 à 09:44
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
-- Vider la table avant d'insérer `Patients`
--

TRUNCATE TABLE `Patients`;
--
-- Contenu de la table `Patients`
--
SET FOREIGN_KEY_CHECKS=0;

INSERT INTO `Patients` (`patient_id`, `num_NSS`, `nom`, `prenom`, `sexe`, `date_naissance`, `mutuelle`, `adresse`, `ville`, `code_postal`, `telephone_fixe`, `telephone_mobile`, `pole_id`, `services_id`, `num_dossier`) VALUES
(1, '189059401907988', 'Durand', 'Jérôme', 'M', '1989-05-14', 'Klésia', '17 avenue du Pavé Neuf', 'Noisy le Grand', 93160, '0143060810', '0635408018', 1, 7, 1),
(2, '192027702004588', 'Poulain', 'Antoine', 'M', '1992-02-04', 'Macif', '17 rue des Chemins Perdus', 'Gournay sur Marne', 93460, '0150564247', '0603088952', 2, 10, 2),
(3, '190117706704588', 'Lim', 'Alex', 'M', '1990-11-28', 'MAAF', '21 rue Winston Churchill', 'Champs sur Marne', 77420, '0140065426', '0780458952', 5, 6, 5),
(4, '277019203305266', 'Nguyen', 'Julie', 'F', '1992-01-17', 'MNF', '21 boulevard Haussman', 'Torcy', 77200, '0123458952', '0654893542', 5, 5, 3),
(5, '263109204102377', 'Dupond', 'Michelle', 'F', '1963-10-06', 'MAE', '26 rue des boulets', 'Paris', 75016, '0152759645', '0654853212', 5, 6, 4),
(6, '291097750103511', 'Lefevre', 'Audrey', 'F', '1991-09-11', 'MATMUT', '26 rue Etienne Dolet', 'Champs sur Marne', 77420, '0142325678', '0652413285', 6, 2, 6),
(7, '292047550107833', 'Oury', 'Cécile ', 'F', '1992-04-27', 'MGEN', '13 rue des perroquets', 'Champigny sur Marne', 94500, '0143528945', '0655889423', 6, 3, NULL),
(8, '189077750158644', 'Tan', 'Rodrigue', 'M', '1989-07-23', 'MACIF', '18 rue Saint Antoine', 'Bussy Saint Georges', 77600, '0195756512', '06412256857', 8, 13, NULL);

SET FOREIGN_KEY_CHECKS=1;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
