-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Client :  sqletud.univ-mlv.fr
-- Généré le :  Sam 27 Février 2016 à 23:33
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

-- --------------------------------------------------------

--
-- Structure de la table `Allergies`
--

CREATE TABLE IF NOT EXISTS `Allergies` (
  `antecedent_id` int(11) NOT NULL,
  `allergie_libelle` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `code_CIM10` varchar(16) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Allergies`
--

INSERT INTO `Allergies` (`antecedent_id`, `allergie_libelle`, `code_CIM10`) VALUES
(21, 'IgE spécifiques Absinthe - w5', 'AG01'),
(22, 'IgE spécifiques Chat', 'AG05'),
(23, 'IgE spécifiques Abeille (venin) ', 'AGO-AB1'),
(24, 'IgE spécifiques nGly m 5, soja -', 'AG-S1'),
(25, 'IgE spécifiques Champignon - f21', 'AG10K');

-- --------------------------------------------------------

--
-- Structure de la table `Antecedents`
--

CREATE TABLE IF NOT EXISTS `Antecedents` (
`antecedent_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Antecedents`
--

INSERT INTO `Antecedents` (`antecedent_id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),
(21),
(22),
(23),
(24),
(25);

-- --------------------------------------------------------

--
-- Structure de la table `Documents`
--

CREATE TABLE IF NOT EXISTS `Documents` (
`doc_id` int(11) NOT NULL,
  `contenu` blob,
  `size_file` float NOT NULL,
  `created` datetime DEFAULT NULL,
  `docType` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Dossiers`
--

CREATE TABLE IF NOT EXISTS `Dossiers` (
`num_dossier` int(11) NOT NULL,
  `libelle` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `created` datetime DEFAULT NULL,
  `patient_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Dossiers`
--

INSERT INTO `Dossiers` (`num_dossier`, `libelle`, `created`, `patient_id`) VALUES
(1, 'NSS2016D0001', '2016-02-03 14:59:00', 1),
(2, 'NSS2016D0002', '2016-02-03 15:00:00', 2),
(3, 'NSS2016D0003', '2016-02-03 15:00:00', 4),
(4, 'NSS2016D0004', '2016-02-03 15:00:00', 5),
(5, 'NSS2016D0005', '2016-02-03 15:00:00', 3),
(6, 'NSS2016D0006', '2016-02-03 15:00:00', 6),
(7, 'NSS2016D0007', '2016-02-04 08:00:00', 7),
(8, 'NSS2016D0008', '2016-02-04 08:00:00', 8);

-- --------------------------------------------------------

--
-- Structure de la table `Droits`
--

CREATE TABLE IF NOT EXISTS `Droits` (
`droit_id` int(11) NOT NULL,
  `role_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `droit_lecture_identite_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_prescriptions_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_prescriptions_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_antecedents_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_antecedents_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_episodes_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_episodes_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_elementSuivis_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_elementSuivis_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_documents_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_documents_patient` tinyint(1) DEFAULT NULL,
  `droit_lecture_dossier_patient` tinyint(1) DEFAULT NULL,
  `droit_ecriture_dossier_patient` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `ElementsSuivis`
--

CREATE TABLE IF NOT EXISTS `ElementsSuivis` (
`ES_id` int(11) NOT NULL,
  `examen_type` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `examen_libelle` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `valeur_1` float NOT NULL,
  `unite_1` varchar(25) COLLATE latin1_general_ci NOT NULL,
  `valeur_2` float DEFAULT NULL,
  `unite_2` varchar(25) COLLATE latin1_general_ci DEFAULT NULL,
  `resultat_test` varchar(25) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `ElementsSuivis`
--

INSERT INTO `ElementsSuivis` (`ES_id`, `examen_type`, `examen_libelle`, `valeur_1`, `unite_1`, `valeur_2`, `unite_2`, `resultat_test`) VALUES
(1, 'Biométrie', 'Diamètre du bassin PRP (femme) ', 13.5, 'cm', NULL, NULL, '13,5 > 12,5 : normal'),
(2, 'Biométrie', 'Tour de taille et tour de hanche (femme)', 70, 'cm', 90, 'cm', '0,77 < 0,8, correct'),
(3, 'Biologie', 'Hémoglobine', 14.1, 'g/dl', NULL, NULL, 'normal, RAS'),
(4, 'Biologie', 'Glycémie', 0.96, 'g/l', NULL, NULL, 'négatif'),
(5, 'Biométrique', 'Tour de taille et tour de hanche (homme) ', 90, 'cm', 110, 'cm', '0,81 < 1 correct');

-- --------------------------------------------------------

--
-- Structure de la table `EpisodesEnCours`
--

CREATE TABLE IF NOT EXISTS `EpisodesEnCours` (
`epOuvert_id` int(11) NOT NULL,
  `episode_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `EpisodesEnCours`
--

INSERT INTO `EpisodesEnCours` (`epOuvert_id`, `episode_libelle`) VALUES
(1, 'PATHO-001'),
(2, 'PATHO-002'),
(3, 'PATHO-003'),
(4, 'PATHO-004'),
(5, 'PATHO-005'),
(6, 'PATHO-006'),
(7, 'PATHO-007'),
(8, 'PATHO-008'),
(9, 'PATHO-009'),
(10, 'PATHO-010'),
(11, 'PATHO-011'),
(12, 'PATHO-012'),
(13, 'PATHO-013'),
(14, 'PATHO-014'),
(15, 'PATHO-015'),
(16, 'PATHO-016'),
(17, 'PATHO-017'),
(18, 'PATHO-018'),
(19, 'PATHO-019'),
(20, 'PATHO-020'),
(21, 'PATHO-021'),
(22, 'PATHO-022'),
(23, 'PATHO-023'),
(24, 'PATHO-024'),
(25, 'PATHO-025'),
(26, 'PATHO-026'),
(27, 'PATHO-027'),
(28, 'PATHO-028'),
(29, 'PATHO-029'),
(30, 'PATHO-030');

-- --------------------------------------------------------

--
-- Structure de la table `Examens`
--

CREATE TABLE IF NOT EXISTS `Examens` (
  `antecedent_id` int(11) NOT NULL,
  `examen_libelle` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `examen_type` varchar(16) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `ListeMeds_Pour_Prescriptions`
--

CREATE TABLE IF NOT EXISTS `ListeMeds_Pour_Prescriptions` (
  `prescription_id` int(11) NOT NULL,
  `med_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `ListeMeds_Pour_Prescriptions`
--

INSERT INTO `ListeMeds_Pour_Prescriptions` (`prescription_id`, `med_id`) VALUES
(9, 1),
(14, 1),
(1, 2),
(14, 2),
(15, 2),
(3, 3),
(5, 3),
(7, 3),
(9, 3),
(17, 3),
(1, 4),
(4, 4),
(5, 4),
(6, 4),
(9, 4),
(10, 4),
(12, 4),
(17, 4),
(5, 5),
(6, 6),
(3, 7),
(6, 7),
(7, 7),
(8, 8),
(1, 9),
(15, 9),
(6, 13),
(10, 13),
(14, 14),
(2, 15),
(7, 15),
(17, 15),
(2, 16),
(16, 16),
(33, 17),
(3, 18),
(4, 18),
(9, 18),
(12, 18),
(4, 19),
(5, 20),
(8, 20),
(8, 21),
(13, 21),
(11, 26),
(11, 27),
(10, 28),
(12, 28),
(14, 29),
(16, 29),
(13, 30),
(16, 31),
(16, 32),
(33, 33);

-- --------------------------------------------------------

--
-- Structure de la table `ListePatho_Pour_Episodes`
--

CREATE TABLE IF NOT EXISTS `ListePatho_Pour_Episodes` (
  `epOuvert_id` int(11) NOT NULL,
  `patho_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `ListePatho_Pour_Episodes`
--

INSERT INTO `ListePatho_Pour_Episodes` (`epOuvert_id`, `patho_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20),
(21, 21),
(22, 22),
(23, 23),
(24, 24),
(25, 25),
(26, 26),
(27, 27),
(28, 28),
(29, 29),
(30, 30);

-- --------------------------------------------------------

--
-- Structure de la table `Medicaments`
--

CREATE TABLE IF NOT EXISTS `Medicaments` (
`med_id` int(11) NOT NULL,
  `CIP` int(11) NOT NULL,
  `libelle` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `libelleDCI` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `Format` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `Dosage` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `Partie_Antecedents`
--

CREATE TABLE IF NOT EXISTS `Partie_Antecedents` (
  `antecedent_id` int(11) NOT NULL,
  `num_dossier` int(11) NOT NULL,
  `date_debut` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `date_fin` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `notes` text COLLATE latin1_general_ci,
  `personnel_id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `Partie_DocumentsPatient`
--

CREATE TABLE IF NOT EXISTS `Partie_DocumentsPatient` (
  `doc_id` int(11) NOT NULL,
  `num_dossier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Partie_ElementsSuivis`
--

CREATE TABLE IF NOT EXISTS `Partie_ElementsSuivis` (
  `ES_id` int(11) NOT NULL,
  `num_dossier` int(11) NOT NULL,
  `personnel_id` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Partie_ElementsSuivis`
--

INSERT INTO `Partie_ElementsSuivis` (`ES_id`, `num_dossier`, `personnel_id`, `created`) VALUES
(1, 3, 11, '2016-02-20 10:09:00'),
(2, 6, 11, '2016-02-20 09:20:00'),
(3, 2, 6, '2016-02-20 13:30:00'),
(4, 1, 6, '2016-02-20 09:00:00'),
(5, 8, 13, '2016-02-20 08:44:00');

-- --------------------------------------------------------

--
-- Structure de la table `Partie_Episodes`
--

CREATE TABLE IF NOT EXISTS `Partie_Episodes` (
  `epOuvert_id` int(11) NOT NULL,
  `num_dossier` int(11) NOT NULL,
  `date_debut` varchar(10) COLLATE latin1_general_ci DEFAULT NULL,
  `date_derniere_visite` varchar(10) COLLATE latin1_general_ci DEFAULT NULL,
  `notes` text COLLATE latin1_general_ci,
  `personnel_id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `Partie_Prescription`
--

CREATE TABLE IF NOT EXISTS `Partie_Prescription` (
  `prescription_id` int(11) NOT NULL,
  `num_dossier` int(11) NOT NULL,
  `date_debut` varchar(10) COLLATE latin1_general_ci DEFAULT NULL,
  `date_fin` varchar(10) COLLATE latin1_general_ci DEFAULT NULL,
  `personnel_id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Partie_Prescription`
--

INSERT INTO `Partie_Prescription` (`prescription_id`, `num_dossier`, `date_debut`, `date_fin`, `personnel_id`, `created`) VALUES
(1, 1, '25-02-2016', '05-03-2016', 13, '2016-02-25 12:00:00'),
(2, 2, '27-02-2016', '10-03-2016', 1, '2016-02-27 12:14:00'),
(3, 2, '05-09-2015', '11-09-2015', 1, '2015-09-05 00:00:00'),
(4, 5, '20-02-2016', '27-02-2016', 13, '2016-02-20 09:20:00'),
(5, 3, '09-04-2015', NULL, 11, '2015-04-09 11:54:00'),
(6, 6, '14-11-2015', '20-11-2015', 16, '2015-11-14 12:52:00'),
(7, 6, '22-02-2016', '05-03-2016', 1, '2016-02-22 10:42:00'),
(8, 7, '03-11-2015', '05-02-2016', 11, '2015-11-03 13:13:19'),
(9, 7, '14-01-2016', '27-01-2016', 1, '2016-01-14 06:00:00'),
(10, 1, '25-08-2013', '3-09-2013', 13, '2013-08-25 17:03:20'),
(11, 1, '04-03-2015', '04-03-2016', 9, '2015-03-04 17:03:20'),
(12, 2, '02-09-2015', '18-09-2015', 13, '2015-09-02 12:56:00'),
(12, 7, '24-02-2016', '04-03-2016', 1, '2016-02-24 15:00:00'),
(13, 3, '13-05-2014', '13-08-2014', 11, '2014-05-13 14:25:00'),
(14, 3, '24-01-2010', '30-01-2010', 1, '2010-01-24 09:12:00'),
(15, 8, '14-03-2013', '19-03-2013', 5, NULL),
(16, 8, '25-02-2016', '01-03-2016', 2, '2016-02-25 17:52:00'),
(17, 8, '17-07-2015', '22-07-2015', 1, '2015-07-17 18:02:05'),
(18, 1, '30-01-2016', '05-02-2016', 13, '2016-02-05 12:00:00'),
(18, 7, '12-01-2016', NULL, 2, '2016-01-12 09:30:00'),
(19, 1, '10-02-2016', NULL, 9, '2016-02-10 19:14:00'),
(19, 7, '07-12-2015', NULL, 9, '2015-12-07 17:33:00'),
(21, 4, '26-02-2016', NULL, 12, '2016-02-26 08:19:00'),
(21, 5, '01-02-2016', NULL, 13, '2016-02-01 06:13:05'),
(22, 5, '02-05-2013', NULL, 10, '2013-05-02 00:00:00'),
(24, 4, '20-01-2016', NULL, 10, '2016-01-20 14:51:00'),
(26, 6, '01-11-2015', NULL, 8, '2015-11-01 00:00:00'),
(27, 4, '20-01-2016', NULL, 10, '2016-01-20 14:51:00'),
(28, 3, '26-02-2016', NULL, 11, '2015-08-27 11:00:00'),
(30, 1, '25-07-2014', NULL, 7, '2014-07-25 10:17:00'),
(30, 6, '01-11-2015', NULL, 8, '2015-11-01 00:00:00'),
(31, 4, '26-02-2016', NULL, 12, '2016-02-26 08:19:00'),
(33, 5, '01-02-2016', '03-03-2016', 13, '2016-02-01 12:51:00');

-- --------------------------------------------------------

--
-- Structure de la table `Pathologies`
--

CREATE TABLE IF NOT EXISTS `Pathologies` (
`patho_id` int(11) NOT NULL,
  `patho_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `codeCIM10` varchar(16) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Pathologies`
--

INSERT INTO `Pathologies` (`patho_id`, `patho_libelle`, `codeCIM10`) VALUES
(1, 'Diabète', 'E10'),
(2, 'Rhinopharyngite', 'J00'),
(3, 'Rhume', 'J00'),
(4, 'Bronchite chronique', 'J41'),
(5, 'Arthrose', 'MAC'),
(6, 'Entérocèle vaginale', 'N81.5'),
(7, 'Bourdonnement, acouphène', 'H03'),
(8, 'Aura migraineuse', 'G43.1'),
(9, 'Toux grasse', 'R05'),
(10, 'Toux sèche', 'R05'),
(11, 'Toxicomanie', 'F19.2'),
(12, 'Traitement chirurgical glaucome', 'H40'),
(13, 'Tumeur de l''ovaire', 'C56'),
(14, 'Tumeur du sein', 'C50'),
(15, 'Ulcère de l''estomac', 'K25'),
(16, 'Urticaire', 'L50.9'),
(17, 'Varicelle', 'B01.9'),
(18, 'Paludisme', 'B50'),
(19, 'Rougeole', 'B05'),
(20, 'Rubéole', 'B06'),
(21, 'Cancer de l''utérus', 'C55'),
(22, 'Cancer de la prostate', 'C61'),
(23, 'Grippe avec symptômes grippaux', 'J09'),
(24, 'Gastro-entérite virale', 'K06'),
(25, 'Angine', 'J02'),
(26, 'Suivi grossesse', 'G50'),
(27, 'Cancer du poumon', 'C05-P'),
(28, 'Sécheresse oculaire', 'S01-OC'),
(29, 'Sécheresse vaginale', 'S18-V'),
(30, 'Pathologie contraceptive', 'PAT05-C');

-- --------------------------------------------------------

--
-- Structure de la table `Patients`
--

CREATE TABLE IF NOT EXISTS `Patients` (
`patient_id` int(11) NOT NULL,
  `num_NSS` varchar(15) COLLATE latin1_general_ci NOT NULL,
  `nom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `prenom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `sexe` char(1) COLLATE latin1_general_ci NOT NULL,
  `date_naissance` varchar(12) COLLATE latin1_general_ci NOT NULL,
  `mutuelle` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `adresse` varchar(128) COLLATE latin1_general_ci DEFAULT NULL,
  `ville` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `code_postal` int(11) DEFAULT NULL,
  `telephone_fixe` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `telephone_mobile` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `pole_id` int(11) NOT NULL,
  `services_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Patients`
--

INSERT INTO `Patients` (`patient_id`, `num_NSS`, `nom`, `prenom`, `sexe`, `date_naissance`, `mutuelle`, `adresse`, `ville`, `code_postal`, `telephone_fixe`, `telephone_mobile`, `pole_id`, `services_id`) VALUES
(1, '189059401907988', 'Durand', 'Jérôme', 'M', '1989-05-14', 'Klésia', '17 avenue du Pavé Neuf', 'Noisy le Grand', 93160, '0143060810', '0635408018', 1, 7),
(2, '192027702004588', 'Poulain', 'Antoine', 'M', '1992-02-04', 'Macif', '17 rue des Chemins Perdus', 'Gournay sur Marne', 93460, '0150564247', '0603088952', 2, 10),
(3, '190117706704588', 'Lim', 'Alex', 'M', '1990-11-28', 'MAAF', '21 rue Winston Churchill', 'Champs sur Marne', 77420, '0140065426', '0780458952', 5, 6),
(4, '277019203305266', 'Nguyen', 'Julie', 'F', '1992-01-17', 'MNF', '21 boulevard Haussman', 'Torcy', 77200, '0123458952', '0654893542', 5, 5),
(5, '263109204102377', 'Dupond', 'Michelle', 'F', '1963-10-06', 'MAE', '26 rue des boulets', 'Paris', 75016, '0152759645', '0654853212', 5, 6),
(6, '291097750103511', 'Lefevre', 'Audrey', 'F', '1991-09-11', 'MATMUT', '26 rue Etienne Dolet', 'Champs sur Marne', 77420, '0142325678', '0652413285', 6, 2),
(7, '292047550107833', 'Oury', 'Cécile ', 'F', '1992-04-27', 'MGEN', '13 rue des perroquets', 'Champigny sur Marne', 94500, '0143528945', '0655889423', 6, 3),
(8, '189077750158644', 'Tan', 'Rodrigue', 'M', '1989-07-23', 'MACIF', '18 rue Saint Antoine', 'Bussy Saint Georges', 77600, '0195756512', '06412256857', 8, 13);

-- --------------------------------------------------------

--
-- Structure de la table `Personnels`
--

CREATE TABLE IF NOT EXISTS `Personnels` (
`personnel_id` int(11) NOT NULL,
  `nom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `prenom` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `num_adeli` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `num_RPPS` varchar(32) COLLATE latin1_general_ci DEFAULT NULL,
  `telephone_mobile` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `telephone_fixe` varchar(12) COLLATE latin1_general_ci DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `pole_id` int(11) NOT NULL,
  `poleResponsable_id` int(11) NOT NULL,
  `services_id` int(11) NOT NULL,
  `servicesResponsable_id` int(11) NOT NULL,
  `specialite_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Personnels`
--

INSERT INTO `Personnels` (`personnel_id`, `nom`, `prenom`, `num_adeli`, `num_RPPS`, `telephone_mobile`, `telephone_fixe`, `created`, `pole_id`, `poleResponsable_id`, `services_id`, `servicesResponsable_id`, `specialite_id`) VALUES
(1, 'MOLINA', 'Jean michel ', '0931054217', '810001119345', '0624589601', '0125869541', '2016-02-03 00:00:00', 7, 7, 12, 12, 8),
(2, 'ORCEL', 'Philippe', '0751557620', '810000473495', '0615268453', '0145268575', '2016-02-03 00:00:00', 3, 3, 13, 13, 1),
(3, 'SIMON', 'Francois', '0931054217', '810001119345 ', '0652489675', '0143267859', '2016-02-03 00:00:00', 4, 4, 14, 14, 17),
(4, 'DESGRANDCHAMPS', 'Francois', '0931054852', '810000478247', '0612523548', '0145852351', '2016-02-03 00:00:00', 5, 5, 6, 0, 15),
(5, 'DE KERVILER', 'Eric', '0931054236', '810001114526', '0620145268', '0145853612', '2016-02-03 00:00:00', 2, 2, 13, 0, 18),
(6, 'HENRY', 'Patrick', '0301013553', '810003190229', '0624584532', '0145893245', '2016-02-03 00:00:00', 1, 1, 6, 0, 8),
(7, 'HERMAN', 'Philippe', '0931051598', '810000504976', '0605495952', '0145864253', '2016-02-03 00:00:00', 6, 6, 1, 1, 16),
(8, 'CHABRIAT', 'Hugues', '1750100042', '810000527779', '0655364896', '0145698753', '2016-02-03 21:00:00', 6, 0, 2, 2, 4),
(9, 'TADAYONI', 'Ramin', '1750115523', '810001473304', '0677564232', '01456875321', '2016-02-03 21:00:00', 6, 0, 3, 3, 14),
(10, 'COHEN SOLAL', 'Alain', '1750117898', '810000337203', '0614587562', '0145785963', '2016-02-03 21:00:00', 1, 0, 4, 4, 3),
(11, 'BENIFLA', 'Jean Louis', '0751558945', '810003696647', '0612457523', '0175963545', '2016-02-03 20:00:00', 5, 0, 5, 5, 5),
(12, 'ALLEZ', 'Matthieu', '0931051951', '810000586759', '0645872146', '0145868565', '2016-02-03 23:00:00', 5, 0, 6, 6, 15),
(13, 'MEGARBANE', 'Bruno', '1750115987', '810001528255', '0612456644', '0133589675', '2016-02-03 23:00:00', 1, 0, 7, 7, 8),
(14, 'PAYEN DE LA GARANDERIE', 'Didier', '1750110345', '810004036207', '0605205574', '0108969542', '2016-02-03 23:00:00', 1, 0, 8, 8, 9),
(15, 'BARRETEAU', 'Hélène', '0301013887', '810000056233', '0645892030', '0152301415', '2016-02-03 23:00:00', 8, 8, 12, 12, 11),
(16, 'LAREDO', 'Jean denis', '1750100087', '810003488599', '0624584463', '0188756242', '2016-02-03 23:44:00', 2, 0, 9, 9, 18),
(17, 'LAPREVOTE', 'Olivier', '0751556642', '810100007136', '0604052952', '0163458563', '2016-02-03 23:45:44', 1, 0, 10, 10, 11),
(18, 'ALIFA', 'Sarah', NULL, NULL, '0648576231', '0145875314', '2016-02-04 00:00:00', 6, 0, 2, 0, 7),
(19, 'BANAS', 'Jennifer', '1770100012', '810003290157', '0605496968', '0178756742', '2016-02-04 00:00:00', 6, 0, 2, 0, 10),
(20, 'BONET', 'Angeline', '1970100071', '81000365045', '0745856210', '0145328950', '2016-02-04 00:00:00', 1, 0, 11, 0, 10);

-- --------------------------------------------------------

--
-- Structure de la table `Poles`
--

CREATE TABLE IF NOT EXISTS `Poles` (
`pole_id` int(11) NOT NULL,
  `libelle_pole` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Poles`
--

INSERT INTO `Poles` (`pole_id`, `libelle_pole`) VALUES
(3, 'Appareil Locomoteur'),
(4, 'Biologie - Pathologie - Physiolo'),
(5, 'DUNEGO'),
(2, 'Imagerie'),
(7, 'IMAGINE'),
(6, 'Neuroscience'),
(8, 'PREBLOC'),
(1, 'Urgence');

-- --------------------------------------------------------

--
-- Structure de la table `PossederDroits`
--

CREATE TABLE IF NOT EXISTS `PossederDroits` (
  `droit_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `PossederDroits`
--

INSERT INTO `PossederDroits` (`droit_id`, `user_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20);

-- --------------------------------------------------------

--
-- Structure de la table `Prescriptions`
--

CREATE TABLE IF NOT EXISTS `Prescriptions` (
`prescription_id` int(11) NOT NULL,
  `libelle_prescription` varchar(64) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Prescriptions`
--

INSERT INTO `Prescriptions` (`prescription_id`, `libelle_prescription`) VALUES
(21, 'Bilan sanguin'),
(18, 'Consultation kinésithérapeutes'),
(19, 'Consultation ophtalmologue'),
(20, 'Consultation ortoptiste'),
(30, 'IRM cérébral'),
(26, 'IRM de la tête'),
(24, 'IRM du thorax'),
(28, 'IRM pelvienne'),
(31, 'IRM Pulmonaire'),
(1, 'Prescription_Liste_Medicaments_001'),
(2, 'Prescription_Liste_Medicaments_002'),
(3, 'Prescription_Liste_Medicaments_003'),
(4, 'Prescription_Liste_Medicaments_004'),
(5, 'Prescription_Liste_Medicaments_005'),
(6, 'Prescription_Liste_Medicaments_006'),
(7, 'Prescription_Liste_Medicaments_007'),
(8, 'Prescription_Liste_Medicaments_008'),
(9, 'Prescription_Liste_Medicaments_009'),
(10, 'Prescription_Liste_Medicaments_010'),
(11, 'Prescription_Liste_Medicaments_011'),
(12, 'Prescription_Liste_Medicaments_012'),
(13, 'Prescription_Liste_Medicaments_013'),
(14, 'Prescription_Liste_Medicaments_014'),
(15, 'Prescription_Liste_Medicaments_015'),
(16, 'Prescription_Liste_Medicaments_016'),
(17, 'Prescription_Liste_Medicaments_017'),
(33, 'Prescription_Liste_Medicaments_018'),
(32, 'Radio de l''abdomen'),
(23, 'Radio des poumons'),
(25, 'Radio du dos'),
(29, 'Radio du membre inférieur'),
(27, 'Radio du thorax'),
(22, 'Test VIH');

-- --------------------------------------------------------

--
-- Structure de la table `Rediger`
--

CREATE TABLE IF NOT EXISTS `Rediger` (
  `date_histo` date DEFAULT NULL,
  `personnel_id` int(11) NOT NULL,
  `doc_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Relation_RolesDossiersUsers`
--

CREATE TABLE IF NOT EXISTS `Relation_RolesDossiersUsers` (
  `num_dossier` int(11) NOT NULL,
  `droit_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Services`
--

CREATE TABLE IF NOT EXISTS `Services` (
`services_id` int(11) NOT NULL,
  `service_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Services`
--

INSERT INTO `Services` (`services_id`, `service_libelle`) VALUES
(8, 'Anesthésie Réanimation'),
(14, 'Biochimie et Biologie Moléculair'),
(4, 'Cardiologie'),
(5, 'Gynecologie-Obstetrique'),
(6, 'Hépato Gastro Entérologie'),
(11, 'Médecine interne'),
(2, 'Neurologie'),
(3, 'Ophtalmologie'),
(1, 'Oto-rhino-laryngologie'),
(12, 'Pharmacie'),
(9, 'Radiologie Ostéo-articulaire'),
(7, 'Réanimation Médicale et Toxicolo'),
(13, 'Rhumatologie'),
(10, 'Toxicologie');

-- --------------------------------------------------------

--
-- Structure de la table `Specialites`
--

CREATE TABLE IF NOT EXISTS `Specialites` (
`specialite_id` int(11) NOT NULL,
  `specialite_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Specialites`
--

INSERT INTO `Specialites` (`specialite_id`, `specialite_libelle`) VALUES
(9, 'Anesthésiste-Réanimateur'),
(17, 'Biologie médicale'),
(3, 'Cardiologue'),
(13, 'Chirurgien'),
(2, 'Chirurgien Urologue'),
(15, 'Gastro-entérologue'),
(5, 'Gynécologue -  Obstétricien'),
(10, 'Infirmier'),
(8, 'Médecin'),
(12, 'Neuro chirurgien'),
(4, 'Neurologue'),
(14, 'Ophtalmologue'),
(16, 'ORL'),
(11, 'Pharmacien'),
(18, 'Radiodiagnostic'),
(1, 'Rhumatologue'),
(7, 'Secrétaire');

-- --------------------------------------------------------

--
-- Structure de la table `Users`
--

CREATE TABLE IF NOT EXISTS `Users` (
`user_id` int(11) NOT NULL,
  `login` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `mot_passe` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `created` datetime DEFAULT NULL,
  `personnel_id` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Contenu de la table `Users`
--

INSERT INTO `Users` (`user_id`, `login`, `mot_passe`, `created`, `personnel_id`) VALUES
(1, 'jmolina', 'f618b1acd267cd661a134b8cc986ee43eda56a79 ', '2016-02-03 00:00:00', 1),
(2, 'porcel', 'e3f6ddc0a9d6c3a96099268549ce3713eeaa47c6', '2016-02-03 00:00:00', 2),
(3, 'fsimon', 'a8704b2753112510a06287051117708500b7680b', '2016-02-03 00:00:00', 3),
(4, 'fdesgrandchamps', '1a03a70227d8a95680a16022f2ae8a14bdc4a8f8', '2016-02-03 00:00:00', 4),
(5, 'edekerviler', '99373be6e4bc1fff8fd64d8e65662c4c7ddd59ee', '2016-02-03 00:00:00', 5),
(6, 'phenry', '9acdcbf38da8780e9fd45183033ca36b8dace056', '2016-02-03 00:00:00', 6),
(7, 'pherman', 'a94d404bc3f75cd6ae47721eb1f3e1ef3ce4a40e', '2016-02-03 00:00:00', 7),
(8, 'hchabriat', '6891ea48977314cf8456b318312b8bbd5ddeb2a6', '2016-02-03 00:00:00', 8),
(9, 'rtadayoni', '75ce65c47b25bc717cbc0be938ddedf88930134c', '2016-02-03 00:00:00', 9),
(10, 'acohensolal', 'af20c23998c5e8c49701141a0c9d92fa3db88f82', '2016-02-03 00:00:00', 10),
(11, 'jbenifla', '7f16544b5633dc092adc14d1c52f52c8ccf8a6dd', '2016-02-03 00:00:00', 11),
(12, 'mallez', '752ac55da65d8c5574c67780588a4dd2c673b028', '2016-02-03 00:00:00', 12),
(13, 'bmegarbane', 'bfaa06607861d62194bff967e93353e9e6776a97', '2016-02-03 00:00:00', 13),
(14, 'dpayendelagaranderie', '34a5acb8f42542d5946b9b32ac6bf41603cf4672', '2016-02-03 00:00:00', 14),
(15, 'hbarreteau', '8118ec9e26eeda7bf48dd2865a10b3c01d3291ee', '2016-02-03 00:00:00', 15),
(16, 'jlaredo', '541a8d880d5887e28abf81fd8048773ae9c00dc4', '2016-02-03 00:00:00', 16),
(17, 'olaprevote', 'fde4f9ea067461b68f939303951723919df08784', '2016-02-03 00:00:00', 17),
(18, 'salifa', 'f8de051370bbf2030d6dfdeb3087b0e539357238', '2016-02-03 00:00:00', 18),
(19, 'jbanas', '46a96d9e628ce25af39c4c42f7691cdd8d856049', '2016-02-03 00:00:00', 19),
(20, 'abonet', 'e34dfde98930dabf89d7649ec48b5c2688456b64', '2016-02-03 00:00:00', 20);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Allergies`
--
ALTER TABLE `Allergies`
 ADD PRIMARY KEY (`antecedent_id`), ADD UNIQUE KEY `allergie_libelle` (`allergie_libelle`);

--
-- Index pour la table `Antecedents`
--
ALTER TABLE `Antecedents`
 ADD PRIMARY KEY (`antecedent_id`);

--
-- Index pour la table `Documents`
--
ALTER TABLE `Documents`
 ADD PRIMARY KEY (`doc_id`);

--
-- Index pour la table `Dossiers`
--
ALTER TABLE `Dossiers`
 ADD PRIMARY KEY (`num_dossier`), ADD UNIQUE KEY `libelle` (`libelle`), ADD KEY `FK_Dossiers_patient_id` (`patient_id`);

--
-- Index pour la table `Droits`
--
ALTER TABLE `Droits`
 ADD PRIMARY KEY (`droit_id`), ADD UNIQUE KEY `role_libelle` (`role_libelle`);

--
-- Index pour la table `ElementsSuivis`
--
ALTER TABLE `ElementsSuivis`
 ADD PRIMARY KEY (`ES_id`);

--
-- Index pour la table `EpisodesEnCours`
--
ALTER TABLE `EpisodesEnCours`
 ADD PRIMARY KEY (`epOuvert_id`), ADD UNIQUE KEY `episode_libelle` (`episode_libelle`);

--
-- Index pour la table `Examens`
--
ALTER TABLE `Examens`
 ADD PRIMARY KEY (`antecedent_id`), ADD UNIQUE KEY `examen_libelle` (`examen_libelle`);

--
-- Index pour la table `ListeMeds_Pour_Prescriptions`
--
ALTER TABLE `ListeMeds_Pour_Prescriptions`
 ADD PRIMARY KEY (`prescription_id`,`med_id`), ADD KEY `FK_ListeMeds_Pour_Prescriptions_med_id` (`med_id`);

--
-- Index pour la table `ListePatho_Pour_Episodes`
--
ALTER TABLE `ListePatho_Pour_Episodes`
 ADD PRIMARY KEY (`epOuvert_id`,`patho_id`), ADD KEY `FK_ListePatho_Pour_Episodes_patho_id` (`patho_id`);

--
-- Index pour la table `Medicaments`
--
ALTER TABLE `Medicaments`
 ADD PRIMARY KEY (`med_id`);

--
-- Index pour la table `Partie_Antecedents`
--
ALTER TABLE `Partie_Antecedents`
 ADD PRIMARY KEY (`antecedent_id`,`num_dossier`), ADD KEY `FK_Partie_Antecedents_num_dossier` (`num_dossier`);

--
-- Index pour la table `Partie_DocumentsPatient`
--
ALTER TABLE `Partie_DocumentsPatient`
 ADD PRIMARY KEY (`doc_id`,`num_dossier`), ADD KEY `FK_Partie_DocumentsPatient_num_dossier` (`num_dossier`);

--
-- Index pour la table `Partie_ElementsSuivis`
--
ALTER TABLE `Partie_ElementsSuivis`
 ADD PRIMARY KEY (`ES_id`,`num_dossier`), ADD KEY `FK_Partie_ElementsSuivis_num_dossier` (`num_dossier`);

--
-- Index pour la table `Partie_Episodes`
--
ALTER TABLE `Partie_Episodes`
 ADD PRIMARY KEY (`epOuvert_id`,`num_dossier`), ADD KEY `FK_Partie_Episodes_num_dossier` (`num_dossier`);

--
-- Index pour la table `Partie_Prescription`
--
ALTER TABLE `Partie_Prescription`
 ADD PRIMARY KEY (`prescription_id`,`num_dossier`), ADD KEY `FK_Partie_Prescription_num_dossier` (`num_dossier`);

--
-- Index pour la table `Pathologies`
--
ALTER TABLE `Pathologies`
 ADD PRIMARY KEY (`patho_id`), ADD UNIQUE KEY `patho_libelle` (`patho_libelle`);

--
-- Index pour la table `Patients`
--
ALTER TABLE `Patients`
 ADD PRIMARY KEY (`patient_id`), ADD UNIQUE KEY `num_NSS` (`num_NSS`), ADD KEY `FK_Patients_pole_id` (`pole_id`), ADD KEY `FK_Patients_services_id` (`services_id`);

--
-- Index pour la table `Personnels`
--
ALTER TABLE `Personnels`
 ADD PRIMARY KEY (`personnel_id`), ADD KEY `FK_Personnels_pole_id` (`pole_id`), ADD KEY `FK_Personnels_pole_id_Poles` (`poleResponsable_id`), ADD KEY `FK_Personnels_services_id` (`services_id`), ADD KEY `FK_Personnels_services_id_Services` (`servicesResponsable_id`), ADD KEY `FK_Personnels_specialite_id` (`specialite_id`);

--
-- Index pour la table `Poles`
--
ALTER TABLE `Poles`
 ADD PRIMARY KEY (`pole_id`), ADD UNIQUE KEY `libelle_pole` (`libelle_pole`);

--
-- Index pour la table `PossederDroits`
--
ALTER TABLE `PossederDroits`
 ADD PRIMARY KEY (`droit_id`,`user_id`), ADD KEY `FK_PossederDroits_user_id` (`user_id`);

--
-- Index pour la table `Prescriptions`
--
ALTER TABLE `Prescriptions`
 ADD PRIMARY KEY (`prescription_id`), ADD UNIQUE KEY `libelle_prescription` (`libelle_prescription`);

--
-- Index pour la table `Rediger`
--
ALTER TABLE `Rediger`
 ADD PRIMARY KEY (`personnel_id`,`doc_id`), ADD KEY `FK_Rediger_doc_id` (`doc_id`);

--
-- Index pour la table `Relation_RolesDossiersUsers`
--
ALTER TABLE `Relation_RolesDossiersUsers`
 ADD PRIMARY KEY (`num_dossier`,`droit_id`,`user_id`), ADD KEY `FK_Relation_RolesDossiersUsers_droit_id` (`droit_id`), ADD KEY `FK_Relation_RolesDossiersUsers_user_id` (`user_id`);

--
-- Index pour la table `Services`
--
ALTER TABLE `Services`
 ADD PRIMARY KEY (`services_id`), ADD UNIQUE KEY `service_libelle` (`service_libelle`);

--
-- Index pour la table `Specialites`
--
ALTER TABLE `Specialites`
 ADD PRIMARY KEY (`specialite_id`), ADD UNIQUE KEY `specialite_libelle` (`specialite_libelle`);

--
-- Index pour la table `Users`
--
ALTER TABLE `Users`
 ADD PRIMARY KEY (`user_id`), ADD UNIQUE KEY `login` (`login`), ADD KEY `FK_Users_personnel_id` (`personnel_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Antecedents`
--
ALTER TABLE `Antecedents`
MODIFY `antecedent_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=26;
--
-- AUTO_INCREMENT pour la table `Documents`
--
ALTER TABLE `Documents`
MODIFY `doc_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `Dossiers`
--
ALTER TABLE `Dossiers`
MODIFY `num_dossier` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `Droits`
--
ALTER TABLE `Droits`
MODIFY `droit_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT pour la table `ElementsSuivis`
--
ALTER TABLE `ElementsSuivis`
MODIFY `ES_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `EpisodesEnCours`
--
ALTER TABLE `EpisodesEnCours`
MODIFY `epOuvert_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT pour la table `Medicaments`
--
ALTER TABLE `Medicaments`
MODIFY `med_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT pour la table `Pathologies`
--
ALTER TABLE `Pathologies`
MODIFY `patho_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT pour la table `Patients`
--
ALTER TABLE `Patients`
MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `Personnels`
--
ALTER TABLE `Personnels`
MODIFY `personnel_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT pour la table `Poles`
--
ALTER TABLE `Poles`
MODIFY `pole_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `Prescriptions`
--
ALTER TABLE `Prescriptions`
MODIFY `prescription_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT pour la table `Services`
--
ALTER TABLE `Services`
MODIFY `services_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT pour la table `Specialites`
--
ALTER TABLE `Specialites`
MODIFY `specialite_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT pour la table `Users`
--
ALTER TABLE `Users`
MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `Allergies`
--
ALTER TABLE `Allergies`
ADD CONSTRAINT `FK_Allergies_antecedent_id` FOREIGN KEY (`antecedent_id`) REFERENCES `Antecedents` (`antecedent_id`);

--
-- Contraintes pour la table `Dossiers`
--
ALTER TABLE `Dossiers`
ADD CONSTRAINT `FK_Dossiers_patient_id` FOREIGN KEY (`patient_id`) REFERENCES `Patients` (`patient_id`);

--
-- Contraintes pour la table `Examens`
--
ALTER TABLE `Examens`
ADD CONSTRAINT `FK_Examens_antecedent_id` FOREIGN KEY (`antecedent_id`) REFERENCES `Antecedents` (`antecedent_id`);

--
-- Contraintes pour la table `ListeMeds_Pour_Prescriptions`
--
ALTER TABLE `ListeMeds_Pour_Prescriptions`
ADD CONSTRAINT `FK_ListeMeds_Pour_Prescriptions_med_id` FOREIGN KEY (`med_id`) REFERENCES `Medicaments` (`med_id`),
ADD CONSTRAINT `FK_ListeMeds_Pour_Prescriptions_prescription_id` FOREIGN KEY (`prescription_id`) REFERENCES `Prescriptions` (`prescription_id`);

--
-- Contraintes pour la table `ListePatho_Pour_Episodes`
--
ALTER TABLE `ListePatho_Pour_Episodes`
ADD CONSTRAINT `FK_ListePatho_Pour_Episodes_epOuvert_id` FOREIGN KEY (`epOuvert_id`) REFERENCES `EpisodesEnCours` (`epOuvert_id`),
ADD CONSTRAINT `FK_ListePatho_Pour_Episodes_patho_id` FOREIGN KEY (`patho_id`) REFERENCES `Pathologies` (`patho_id`);

--
-- Contraintes pour la table `Partie_Antecedents`
--
ALTER TABLE `Partie_Antecedents`
ADD CONSTRAINT `FK_Partie_Antecedents_antecedent_id` FOREIGN KEY (`antecedent_id`) REFERENCES `Antecedents` (`antecedent_id`),
ADD CONSTRAINT `FK_Partie_Antecedents_num_dossier` FOREIGN KEY (`num_dossier`) REFERENCES `Dossiers` (`num_dossier`);

--
-- Contraintes pour la table `Partie_DocumentsPatient`
--
ALTER TABLE `Partie_DocumentsPatient`
ADD CONSTRAINT `FK_Partie_DocumentsPatient_doc_id` FOREIGN KEY (`doc_id`) REFERENCES `Documents` (`doc_id`),
ADD CONSTRAINT `FK_Partie_DocumentsPatient_num_dossier` FOREIGN KEY (`num_dossier`) REFERENCES `Dossiers` (`num_dossier`);

--
-- Contraintes pour la table `Partie_ElementsSuivis`
--
ALTER TABLE `Partie_ElementsSuivis`
ADD CONSTRAINT `FK_Partie_ElementsSuivis_ES_id` FOREIGN KEY (`ES_id`) REFERENCES `ElementsSuivis` (`ES_id`),
ADD CONSTRAINT `FK_Partie_ElementsSuivis_num_dossier` FOREIGN KEY (`num_dossier`) REFERENCES `Dossiers` (`num_dossier`);

--
-- Contraintes pour la table `Partie_Episodes`
--
ALTER TABLE `Partie_Episodes`
ADD CONSTRAINT `FK_Partie_Episodes_epOuvert_id` FOREIGN KEY (`epOuvert_id`) REFERENCES `EpisodesEnCours` (`epOuvert_id`),
ADD CONSTRAINT `FK_Partie_Episodes_num_dossier` FOREIGN KEY (`num_dossier`) REFERENCES `Dossiers` (`num_dossier`);

--
-- Contraintes pour la table `Partie_Prescription`
--
ALTER TABLE `Partie_Prescription`
ADD CONSTRAINT `FK_Partie_Prescription_num_dossier` FOREIGN KEY (`num_dossier`) REFERENCES `Dossiers` (`num_dossier`),
ADD CONSTRAINT `FK_Partie_Prescription_prescription_id` FOREIGN KEY (`prescription_id`) REFERENCES `Prescriptions` (`prescription_id`);

--
-- Contraintes pour la table `Patients`
--
ALTER TABLE `Patients`
ADD CONSTRAINT `FK_Patients_pole_id` FOREIGN KEY (`pole_id`) REFERENCES `Poles` (`pole_id`),
ADD CONSTRAINT `FK_Patients_services_id` FOREIGN KEY (`services_id`) REFERENCES `Services` (`services_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
