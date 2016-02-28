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

-- --------------------------------------------------------

--
-- Structure de la table `Antecedents`
--

CREATE TABLE IF NOT EXISTS `Antecedents` (
`antecedent_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `EpisodesEnCours`
--

CREATE TABLE IF NOT EXISTS `EpisodesEnCours` (
`epOuvert_id` int(11) NOT NULL,
  `episode_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Examens`
--

CREATE TABLE IF NOT EXISTS `Examens` (
  `antecedent_id` int(11) NOT NULL,
  `examen_libelle` varchar(64) COLLATE latin1_general_ci NOT NULL,
  `examen_type` varchar(16) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `ListeMeds_Pour_Prescriptions`
--

CREATE TABLE IF NOT EXISTS `ListeMeds_Pour_Prescriptions` (
  `prescription_id` int(11) NOT NULL,
  `med_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `ListePatho_Pour_Episodes`
--

CREATE TABLE IF NOT EXISTS `ListePatho_Pour_Episodes` (
  `epOuvert_id` int(11) NOT NULL,
  `patho_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `Pathologies`
--

CREATE TABLE IF NOT EXISTS `Pathologies` (
`patho_id` int(11) NOT NULL,
  `patho_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `codeCIM10` varchar(16) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `Poles`
--

CREATE TABLE IF NOT EXISTS `Poles` (
`pole_id` int(11) NOT NULL,
  `libelle_pole` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `PossederDroits`
--

CREATE TABLE IF NOT EXISTS `PossederDroits` (
  `droit_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Prescriptions`
--

CREATE TABLE IF NOT EXISTS `Prescriptions` (
`prescription_id` int(11) NOT NULL,
  `libelle_prescription` varchar(64) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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

-- --------------------------------------------------------

--
-- Structure de la table `Specialites`
--

CREATE TABLE IF NOT EXISTS `Specialites` (
`specialite_id` int(11) NOT NULL,
  `specialite_libelle` varchar(32) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

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
