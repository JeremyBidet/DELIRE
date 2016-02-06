-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 06 Février 2016 à 00:58
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
-- Contenu de la table `Partie_Antecedents`
--

INSERT INTO `Partie_Antecedents` (`antecedent_id`, `num_dossier`, `date_debut`, `date_fin`, `notes`, `personnel_id`, `created`) VALUES
(2, 1, '22-01-2013', '04-02-2015', 'Glycémie élevé au départ avec risque de mort mais a baisé au fil des années', 13, '2013-01-22 09:00:00'),
(2, 5, '28-11-2012', '18-04-2014', 'Rien à signaler', 6, '2012-11-28 00:00:00'),
(5, 3, '05-03-2011', '05-04-2013', NULL, 1, '2011-03-05 08:13:00'),
(13, 4, '09-10-2015', '20-12-2015', '1/ Ne ressent plus la douleur depuis deux ans après un grave accident de travail.\r\n\r\n2/ A retrouver quelques sensations de douleur mais cela se révèle très faible.', 14, '2015-10-09 07:07:05'),
(15, 7, '24-11-2015', '27-11-2015', 'Problème récurrent de souffle au coeur.', 8, '2015-11-24 17:20:00'),
(16, 6, '01-01-2016', '05-02-2016', 'N''a rien révéler de grave.', 8, '2016-01-01 13:14:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
