-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Ven 05 Février 2016 à 10:12
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

INSERT INTO `Examens` (`examen_libelle`, `examen_type`, `antecedent_id`) VALUES
('Hémoglobine', 'Biologie', 0),
('Glycémie', 'Biologie', 1),
('Ac anti-progesterone', 'Biologie', 2),
('Ac anti-plaquettes', 'Biologie', 3),
('Cholestérol HDL', 'Biologie', 4),
('Tour de taille / Tour de hanche', 'Biometrie', 5),
('Pouls', 'Biometrie', 6),
('Perimetre du poignet', 'Biometrie', 7),
('Diamètre aorte abdominale', 'Biometrie', 8),
('Périmètre du bassin', 'Biometrie', 9),
('Examens des seins', 'Clinique', 10),
('Test appui monopodal', 'Clinique', 11),
('Sensibilité à la douleur', 'Clinique', 12),
('Palpation des pouls', 'Clinique', 13),
('Recherche de souffles vasculaires', 'Clinique', 14),
('Echographie cardiaque', 'Paraclinique', 15),
('Echographie pelvienne', 'Paraclinique', 16),
('Scanner cérébral', 'Paraclinique', 17),
('Scanner thoraco-abdomino-pelvien', 'Paraclinique', 18),
('Echodoppler de l''aorte abdominale', 'Paraclinique', 19);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
