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
-- Contenu de la table `Medicaments`
--

INSERT INTO `Medicaments` (`med_id`, `CIP`, `libelle`, `libelleDCI`, `Format`, `Dosage`) VALUES
(1, 33450, 'NARCAN 0,4MG/1ML AMP 10', 'Naloxone', 'Injectable', '0,4 mg/1 ml'),
(2, 35756, 'RHINOFLUIMUCIL PULV NAS 5ML', 'Acétylcystéine + tuaminoheptane + benzalkonium', 'Voie nasale', '5 ml'),
(3, 20578, 'SPASFON CPR 30', 'Phloroglucinol + triméthylphloroglucinol', 'Comprimé', ''),
(4, 15345, 'SPEDIFEN 400MG CPR 12', 'Ibuprofène', 'Comprimé', '400 mg'),
(5, 89452, 'DIAMILLA GE 75MCG CPR 1X28', 'Désogestrel', 'Comprimé', '0,075 mg'),
(6, 12304, 'ACICLOVIR 5% SANDOZ CONS CR TUB ', 'Aciclovir Crème 5 %', 'Crème', '5%'),
(7, 94530, 'TIORFAN 100MG GELULE 20', 'Racécadotril', 'Gélule', '100 mg'),
(8, 45368, 'TROPHIGIL GELULE VAGINALE 14', 'Estriol', 'Gélule', ''),
(9, 23458, 'TOPLEXIL 0,33MG/ML SOL S/S 150ML', 'Oxomémazine', 'Sirop', '0,33 mg/ml'),
(10, 25146, 'ATROPINE 0,5MG/ML AGUET AMP B 10', 'Atropine sulfate', 'Ampoule', '0,5mg/ml'),
(11, 27453, 'CYMBALTA 30MG GELULE 28', 'Duloxétine', 'Gelule', '30 mg'),
(12, 33450, 'VENTOLINE 2,5MG/2,5ML INH DOSE 6', 'Salbutamol', 'Aérosol', '0,5 %'),
(13, 78545, 'KETUM 2,5% GEL TUB 60G', 'Kétoprofène', 'Gel à usage local', '2,5 %'),
(14, 78325, 'ATARAX SIROP 200 ml', 'Hydroxyzine dichlorhydrate', 'Sirop', '10 mg/5 ml'),
(15, 74582, 'SMECTA 3G ORANGE VANILLE SACHET ', 'Diosmectite', 'Poudre pour suspension buvable', '3 g'),
(16, 15780, 'AMOXICILLINE 500MG MYLAN PDR 60M', 'Amoxicilline', 'Comprimé', '500 mg'),
(17, 33910, 'GLUCOPHAGE 500MG CPR 30', 'Metformine chlorhydrate', 'Comprimé', '500 mg'),
(18, 39856, 'DOLIPRANE CPR 1000 mg', 'Paracétamol', 'Comprimé', '1000 mg'),
(19, 34009, 'RAMIPRIL SANDOZ 1,25 mg CPR', 'Ramipril', 'Comprimé', '1,25 mg'),
(20, 21474, 'OESTRODOSE 0,06 % gel p appl cut', '17-bêta-estradiol', 'Gel', '0,06%'),
(21, 92673, 'DESOGESTREL BIOGARAN 75 µg cp pe', 'Désogestrel', 'Comprimé pelliculé', '75 µg'),
(22, 93138, 'STERDEX pom ophtalm', 'Oxytétracycline et Dexaméthasone', 'Pommade ophtalmique', '1,335 mg +0,267 mg'),
(23, 93246, 'VOLTARENE LP 100 mg CPR', 'Diclofénac sodique', 'Comprimé enrobé', '100 mg'),
(25, 93586, 'ALMOGRAN 12,5 mg CPR', 'Almotriptan d-l hydrogénomalate', 'Comprimé pelliculé', '12,5 mg'),
(26, 93403, 'ARTELAC 1,6 mg/0,5 ml collyre', 'Hypromellose', 'Collyre', '1,6 mg/0,5 ml'),
(27, 93379, 'CELLUVISC 4 mg/0,4 ml collyre', 'Carmellose sodique', 'Collyre', '4 mg/0,4 ml'),
(28, 93587, 'TRAMADOL ARROW 50 mg CPR', 'Tramadol chlorhydrate', 'Comprimé', '50 mg'),
(29, 30476, 'HELICIDINE 10 % sirop', 'Hélicidine', 'Sirop', '10 %'),
(30, 56348, 'CYPROTERONE BIOGARAN 50 mg CPR', 'Cyprotérone acétate', 'Comprimé', '50 mg'),
(31, 32061, 'PIVALONE 1 % susp nasal', 'Tixocortol pivalate', 'Suspension nasale', '1 %'),
(32, 45031, 'COLLUNOVAR 0,11 % sol', 'Chlorhexidine gluconate', 'Solution pulvérisation bucale', '0,11 %'),
(33, 54952, 'NOVOMIX 30 PENFILL 100 U/ml susp', 'Insuline asparte', 'Suspension injectable', '100 U/ml');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
