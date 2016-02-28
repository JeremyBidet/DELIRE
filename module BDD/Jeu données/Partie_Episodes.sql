-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Dim 28 Février 2016 à 01:27
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
-- Contenu de la table `Partie_Episodes`
--

INSERT INTO `Partie_Episodes` (`epOuvert_id`, `num_dossier`, `date_debut`, `date_derniere_visite`, `notes`, `personnel_id`, `created`) VALUES
(1, 5, '01-02-2016', '27-02-2016', 'Diabète type 1', 13, '2016-02-01 15:52:20'),
(2, 1, '25-02-2016', '02-03-2016', 'Gorge bien prise et douleurs aigüe', 13, '2016-02-25 05:00:00'),
(2, 8, '25-02-2016', '29-02-2016', NULL, 2, '2016-02-25 14:51:00'),
(3, 7, '24-02-2016', '02-03-2016', NULL, 1, '2016-02-24 08:52:20'),
(5, 2, '05-02-2016', '07-02-2016', 'C''est grave !', 13, '2016-02-09 00:00:00'),
(6, 3, '14-12-2015', '14-01-2016', 'Vagin pousser vers l''avant.\r\nCauses : descente de structure intestinale', 11, '2015-12-14 16:45:20'),
(8, 5, '20-02-2016', '27-02-2016', 'Migraine et forte fièvre post opération', 13, '2016-02-20 12:02:20'),
(15, 4, '02-01-2016', '26-02-2016', 'Bilan sanguin pour confirmer le diagnostic : ulcère estomac', 12, '2016-01-02 09:23:00'),
(24, 2, '27-02-2016', '05-03-2016', NULL, 1, '2016-02-27 08:19:00'),
(24, 6, '22-02-2016', '22-02-2016', NULL, 1, '2016-02-22 12:02:06'),
(25, 8, '29-02-2016', '29-02-2016', 'Vérification de l''état du patient, la rhino, c''est transformé en angine.', 2, '2016-02-29 15:16:35'),
(26, 3, '26-01-2016', '26-02-2016', 'Vérification du diamètre du bassin permettant un accouchement dans de bonnes conditions', 11, '2016-02-26 11:52:00'),
(27, 4, '04-12-2015', '26-02-2016', 'Difficulté à respirer, fumeur passif.\r\nAntécédent de problème similaire dans la famille.', 12, '2015-12-04 15:16:00'),
(28, 1, '04-03-2015', '14-11-2015', 'Migraine ophtalmique et fatigue des yeux dû à cette sécheresse. Préconise un bilan visuel.', 9, '2015-03-04 17:03:20');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
