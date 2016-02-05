-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Ven 05 Février 2016 à 16:59
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
-- Contenu de la table `Medicaments`
--

INSERT INTO `Medicaments` (`med_id`, `CIP`, `libelle`, `libelleDCI`, `Format`, `Dosage`) VALUES
(1, 0, 'NARCAN 0,4MG/1ML AMP 10', 'Naloxone', 'Injectable', '0,4 mG/1 mL'),
(2, 0, 'RHINOFLUIMUCIL PULV NAS 5ML', 'Acétylcystéine + tuaminoheptane + benzalkonium', 'Voie nasale', '5 mL'),
(3, 0, 'SPASFON CPR 30', 'Phloroglucinol + triméthylphloroglucinol', 'Comprimé', ''),
(4, 0, 'SPEDIFEN 400MG CPR 12', 'Ibuprofène', 'Comprimé', '400 mG'),
(5, 0, 'DIAMILLA GE 75MCG CPR 1X28', 'Désogestrel', 'Comprimé', '0,075 mG'),
(6, 0, 'ACICLOVIR 5% SANDOZ CONS CR TUB ', 'Aciclovir Crème 5 %', 'Crème', '5%'),
(7, 0, 'TIORFAN 100MG GELULE 20', 'Racécadotril', 'Gélule', '100 mG'),
(8, 0, 'TROPHIGIL GELULE VAGINALE 14', 'Estriol', 'Gélule', ''),
(9, 0, 'TOPLEXIL 0,33MG/ML SOL S/S 150ML', 'Oxomémazine', 'Sirop', '0,33 mG/mL'),
(10, 0, 'ATROPINE 0,5MG/ML AGUET AMP B 10', 'Atropine sulfate', 'Ampoule', '0,5Mg/Ml'),
(11, 0, 'CYMBALTA 30MG GELULE 28', 'Duloxétine', 'Gelule', '30 mG'),
(12, 0, 'VENTOLINE 2,5MG/2,5ML INH DOSE 6', 'Salbutamol', 'Aérosol', '0,5 %'),
(13, 0, 'KETUM 2,5% GEL TUB 60G', 'Kétoprofène', 'Gel à usage local', '2,5 %'),
(14, 0, 'ATARAX SP 200ML 1', 'Hydroxyzine', 'Sirop', '10 mG/5 mL'),
(15, 0, 'SMECTA 3G ORANGE VANILLE SACHET ', 'Diosmectite', 'Poudre pour suspension buvable', '3 g'),
(16, 0, 'AMOXICILLINE 500MG MYLAN PDR 60M', 'Amoxicilline', 'Comprimé', '500 mG'),
(17, 0, 'GLUCOPHAGE 500MG CPR 30', 'Metformine chlorhydrate', 'Comprimé', '500 mG');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
