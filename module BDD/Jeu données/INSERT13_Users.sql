-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 20 Février 2016 à 11:42
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
-- Contenu de la table `Users`
--

INSERT INTO `Users` (`user_id`, `login`, `mot_passe`, `created`, `personnel_id`) VALUES
(1, 'jmolina', 'passmolina', '2016-02-03 00:00:00', 1),
(2, 'porcel', 'passorcel', '2016-02-03 00:00:00', 2),
(3, 'fsimon', 'passsimon', '2016-02-03 00:00:00', 3),
(4, 'fdesgrandchamps', 'passdesgrandchamps', '2016-02-03 00:00:00', 4),
(5, 'edekerviler', 'passdekerviler', '2016-02-03 00:00:00', 5),
(6, 'phenry', 'passhenry', '2016-02-03 00:00:00', 6),
(7, 'pherman', 'passherman', '2016-02-03 00:00:00', 7),
(8, 'hchabriat', 'passchabriat', '2016-02-03 00:00:00', 8),
(9, 'rtadayoni', 'passtadayoni', '2016-02-03 00:00:00', 9),
(10, 'acohensolal', 'passcohensolal', '2016-02-03 00:00:00', 10),
(11, 'jbenifla', 'passbenifla', '2016-02-03 00:00:00', 11),
(12, 'mallez', 'passallez', '2016-02-03 00:00:00', 12),
(13, 'bmegarbane', 'passmegarbane', '2016-02-03 00:00:00', 13),
(14, 'dpayendelagaranderie', 'passpayendelagaranderie', '2016-02-03 00:00:00', 14),
(15, 'hbarreteau', 'passbarreteau', '2016-02-03 00:00:00', 15),
(16, 'jlaredo', 'passlaredo', '2016-02-03 00:00:00', 16),
(17, 'olaprevote', 'passlaprevote', '2016-02-03 00:00:00', 17),
(18, 'salifa', 'passalifa', '2016-02-03 00:00:00', 18),
(19, 'jbanas', 'passbanas', '2016-02-03 00:00:00', 19),
(20, 'abonet', 'passbonet', '2016-02-03 00:00:00', 20);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
