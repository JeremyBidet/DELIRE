-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:26
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
-- Contenu de la table `Examens`
--

INSERT INTO `Examens` (`antecedent_id`, `examen_libelle`, `examen_type`) VALUES
(1, 'Hémoglobine', 'Biologie'),
(2, 'Glycémie', 'Biologie'),
(3, 'Ac anti-progesterone', 'Biologie'),
(4, 'Ac anti-plaquettes', 'Biologie'),
(5, 'Cholestérol HDL', 'Biologie'),
(6, 'Tour de taille / Tour de hanche', 'Biometrie'),
(7, 'Pouls', 'Biometrie'),
(8, 'Perimetre du poignet', 'Biometrie'),
(9, 'Diamètre aorte abdominale', 'Biometrie'),
(10, 'Diamètre du bassin PRP', 'Biometrie'),
(11, 'Examens des seins', 'Clinique'),
(12, 'Test appui monopodal', 'Clinique'),
(13, 'Sensibilité à la douleur', 'Clinique'),
(14, 'Palpation des pouls', 'Clinique'),
(15, 'Recherche de souffles vasculaires', 'Clinique'),
(16, 'Echographie cardiaque', 'Paraclinique'),
(17, 'Echographie pelvienne', 'Paraclinique'),
(18, 'Scanner cérébral', 'Paraclinique'),
(19, 'Scanner thoraco-abdomino-pelvien', 'Paraclinique'),
(20, 'Echodoppler de l''aorte', 'Paraclinique');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
