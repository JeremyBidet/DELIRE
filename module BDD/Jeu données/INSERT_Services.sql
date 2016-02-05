-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Jeu 04 Février 2016 à 09:45
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
-- Vider la table avant d'insérer `Services`
--

TRUNCATE TABLE `Services`;
--
-- Contenu de la table `Services`
--
SET FOREIGN_KEY_CHECKS=0;

INSERT INTO `Services` (`services_id`, `service_libelle`, `personnelResponsable_id`) VALUES
(1, 'Oto-rhino-laryngologie', 7),
(2, 'Neurologie', 8),
(3, 'Ophtalmologie', 9),
(4, 'Cardiologie', 10),
(5, 'Gynecologie-Obstetrique', 11),
(6, 'Hépato Gastro Entérologie', 12),
(7, 'Réanimation Médicale et Toxicolo', 13),
(8, 'Anesthésie Réanimation', 14),
(9, 'Radiologie Ostéo-articulaire', 16),
(10, 'Toxicologie', 17),
(11, 'Médecine interne', 1),
(12, 'Pharmacie', 15),
(13, 'Rhumatologie', 2),
(14, 'Biochimie et Biologie Moléculaire', 3);

SET FOREIGN_KEY_CHECKS=1;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
