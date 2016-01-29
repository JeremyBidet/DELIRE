#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Patients
#------------------------------------------------------------

CREATE TABLE Patients(
        patient_id       int (11) Auto_increment  NOT NULL ,
        num_NSS          Int ,
        nom              Varchar (32) ,
        prenom           Varchar (32) NOT NULL ,
        sexe             Char (1) NOT NULL ,
        date_naissance   Varchar (32) ,
        mutuelle         Varchar (32) ,
        adresse          Text ,
        ville            Varchar (32) ,
        code_postal      Int ,
        telephone_fixe   Varchar (12) ,
        telephone_mobile Varchar (12) ,
        pole_id          Int NOT NULL ,
        services_id      Int NOT NULL ,
        num_dossier      Int NOT NULL ,
        PRIMARY KEY (patient_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personnels
#------------------------------------------------------------

CREATE TABLE Personnels(
        personnel_id         int (11) Auto_increment  NOT NULL ,
        nom                  Varchar (32) NOT NULL ,
        prenom               Varchar (32) NOT NULL ,
        num_adeli            Varchar (32) ,
        num_RPPS             Varchar (32) ,
        telephone_mobile     Varchar (12) ,
        telephone_fixe       Varchar (12) ,
        created              Datetime ,
        user_id              Int NOT NULL ,
        pole_id              Int NOT NULL ,
        pole_id_Poles        Int NOT NULL ,
        services_id          Int NOT NULL ,
        services_id_Services Int NOT NULL ,
        specialite_id        Int NOT NULL ,
        PRIMARY KEY (personnel_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Users
#------------------------------------------------------------

CREATE TABLE Users(
        user_id      int (11) Auto_increment  NOT NULL ,
        login        Varchar (32) NOT NULL ,
        mot_passe    Varchar (32) NOT NULL ,
        created      Datetime ,
        personnel_id Int NOT NULL ,
        PRIMARY KEY (user_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Poles
#------------------------------------------------------------

CREATE TABLE Poles(
        pole_id      int (11) Auto_increment  NOT NULL ,
        libelle_pole Varchar (32) NOT NULL ,
        personnelResponsable_id  Int NOT NULL ,
        PRIMARY KEY (pole_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Services
#------------------------------------------------------------

CREATE TABLE Services(
        services_id     int (11) Auto_increment  NOT NULL ,
        service_libelle Varchar (32) NOT NULL ,
        personnelResponsable_id    Int NOT NULL ,
        PRIMARY KEY (services_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Specialites
#------------------------------------------------------------

CREATE TABLE Specialites(
        specialite_id      int (11) Auto_increment  NOT NULL ,
        specialite_libelle Varchar (32) NOT NULL ,
        PRIMARY KEY (specialite_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Medicaments
#------------------------------------------------------------

CREATE TABLE Medicaments(
        med_id     int (11) Auto_increment  NOT NULL ,
        CIP        Int NOT NULL ,
        libelle    Varchar (32) ,
        libelleDCI Varchar (64) NOT NULL ,
        Format     Varchar (32) ,
        Dosage     Varchar (32) NOT NULL ,
        PRIMARY KEY (med_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Pathologies
#------------------------------------------------------------

CREATE TABLE Pathologies(
        patho_id      int (11) Auto_increment  NOT NULL ,
        patho_libelle Varchar (32) NOT NULL ,
        codeCIM10     Varchar (16) NOT NULL ,
        PRIMARY KEY (patho_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Allergies
#------------------------------------------------------------

CREATE TABLE Allergies(
        allergie_libelle Varchar (32) NOT NULL ,
        code_CIM10       Varchar (16) NOT NULL ,
        antecedent_id    Int NOT NULL ,
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Documents
#------------------------------------------------------------

CREATE TABLE Documents(
        doc_id     int (11) Auto_increment  NOT NULL ,
        contenu    Blob ,
        size_file  Float NOT NULL ,
        created    Datetime ,
        docType_id Int ,
        PRIMARY KEY (doc_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: EpisodesEnCours
#------------------------------------------------------------

CREATE TABLE EpisodesEnCours(
        epOuvert_id          int (11) Auto_increment  NOT NULL ,
        episode_libelle      Varchar (32) NOT NULL ,
        date_debut           Date NOT NULL ,
        date_derniere_visite Date NOT NULL ,
        notes                Text ,
        personnel_id         Int ,
        created              Datetime ,
        PRIMARY KEY (epOuvert_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: DocType
#------------------------------------------------------------

CREATE TABLE DocType(
        docType_id int (11) Auto_increment  NOT NULL ,
        type       Int NOT NULL ,
        label      Varchar (32) NOT NULL ,
        PRIMARY KEY (docType_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Antecedents
#------------------------------------------------------------

CREATE TABLE Antecedents(
        antecedent_id      int (11) Auto_increment  NOT NULL ,
        antecedent_libelle Varchar (32) NOT NULL ,
        date_debut         Date NOT NULL ,
        date_fin           Date NOT NULL ,
        notes              Text ,
        personnel_id       Int ,
        created            Datetime ,
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: ElementsSuivis
#------------------------------------------------------------

CREATE TABLE ElementsSuivis(
        ES_id          int (11) Auto_increment  NOT NULL ,
        date_debut     Date NOT NULL ,
        examen_type    Varchar (32) NOT NULL ,
        examen_libelle Varchar (64) ,
        personnel_id   Int ,
        PRIMARY KEY (ES_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Prescriptions
#------------------------------------------------------------

CREATE TABLE Prescriptions(
        prescription_id int (11) Auto_increment  NOT NULL ,
        libelle         Varchar (64) NOT NULL ,
        dosage          Varchar (64) ,
        date_debut      Date NOT NULL ,
        date_fin        Date NOT NULL ,
        personnel_id    Int ,
        created         Datetime ,
        PRIMARY KEY (prescription_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Examens
#------------------------------------------------------------

CREATE TABLE Examens(
        examen_libelle Varchar (32) NOT NULL ,
        examen_type    Varchar (16) ,
        antecedent_id  Int NOT NULL ,
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Droits
#------------------------------------------------------------

CREATE TABLE Droits(
        droit_id                             int (11) Auto_increment  NOT NULL ,
        droit_lecture_identite_patient       Bool ,
        droit_lecture_traitements_patient    Bool ,
        droit_ecriture_traitements_patient   Bool ,
        droit_lecture_antecedents_patient    Bool ,
        droit_ecriture_antecedents_patient   Bool ,
        droit_lecture_episodes_patient       Bool ,
        droit_ecriture_episodes_patient      Bool ,
        droit_lecture_elementSuivis_patient  Bool ,
        droit_ecriture_elementSuivis_patient Bool ,
        PRIMARY KEY (droit_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Roles
#------------------------------------------------------------

CREATE TABLE Roles(
        role_id      int (11) Auto_increment  NOT NULL ,
        role_libelle Varchar (25) ,
        droit_id     Int ,
        PRIMARY KEY (role_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Dossiers
#------------------------------------------------------------

CREATE TABLE Dossiers(
        num_dossier int (11) Auto_increment  NOT NULL ,
        libelle     Varchar (32) NOT NULL ,
        created     Datetime ,
        patient_id  Int ,
        PRIMARY KEY (num_dossier )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Partie ElementsSuivis
#------------------------------------------------------------

CREATE TABLE Partie_ElementsSuivis(
        ES_id       Int NOT NULL ,
        num_dossier Int NOT NULL ,
        PRIMARY KEY (ES_id ,num_dossier )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Partie Prescription
#------------------------------------------------------------

CREATE TABLE Partie_Prescription(
        prescription_id Int NOT NULL ,
        num_dossier     Int NOT NULL ,
        PRIMARY KEY (prescription_id ,num_dossier )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Partie Episodes
#------------------------------------------------------------

CREATE TABLE Partie_Episodes(
        epOuvert_id Int NOT NULL ,
        num_dossier Int NOT NULL ,
        PRIMARY KEY (epOuvert_id ,num_dossier )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Partie Antecedents
#------------------------------------------------------------

CREATE TABLE Partie_Antecedents(
        antecedent_id Int NOT NULL ,
        num_dossier   Int NOT NULL ,
        PRIMARY KEY (antecedent_id ,num_dossier )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Rediger
#------------------------------------------------------------

CREATE TABLE Rediger(
        date_histo   Date ,
        personnel_id Int NOT NULL ,
        doc_id       Int NOT NULL ,
        PRIMARY KEY (personnel_id ,doc_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: ListeMeds Pour Prescriptions
#------------------------------------------------------------

CREATE TABLE ListeMeds_Pour_Prescriptions(
        prescription_id Int NOT NULL ,
        med_id          Int NOT NULL ,
        PRIMARY KEY (prescription_id ,med_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: ListePatho Pour Episodes
#------------------------------------------------------------

CREATE TABLE ListePatho_Pour_Episodes(
        epOuvert_id Int NOT NULL ,
        patho_id    Int NOT NULL ,
        PRIMARY KEY (epOuvert_id ,patho_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Possession Roles
#------------------------------------------------------------

CREATE TABLE Possession_Roles(
        role_id Int NOT NULL ,
        user_id Int NOT NULL ,
        PRIMARY KEY (role_id ,user_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Partie DocumentsPatient
#------------------------------------------------------------

CREATE TABLE Partie_DocumentsPatient(
        num_dossier Int NOT NULL ,
        doc_id      Int NOT NULL ,
        PRIMARY KEY (num_dossier ,doc_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Relation RolesDossiers
#------------------------------------------------------------

CREATE TABLE Relation_RolesDossiers(
        role_id     Int NOT NULL ,
        num_dossier Int NOT NULL ,
        PRIMARY KEY (role_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Patients ADD CONSTRAINT FK_Patients_pole_id FOREIGN KEY (pole_id) REFERENCES Poles(pole_id);
ALTER TABLE Patients ADD CONSTRAINT FK_Patients_services_id FOREIGN KEY (services_id) REFERENCES Services(services_id);
ALTER TABLE Patients ADD CONSTRAINT FK_Patients_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_pole_id FOREIGN KEY (pole_id) REFERENCES Poles(pole_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_services_id FOREIGN KEY (services_id) REFERENCES Services(services_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_specialite_id FOREIGN KEY (specialite_id) REFERENCES Specialites(specialite_id);
ALTER TABLE Users ADD CONSTRAINT FK_Users_personnel_id FOREIGN KEY (personnel_id) REFERENCES Personnels(personnel_id);
ALTER TABLE Poles ADD CONSTRAINT FK_Poles_personnelResponsable_id FOREIGN KEY (personnelResponsable_id ) REFERENCES Personnels(personnel_id);
ALTER TABLE Services ADD CONSTRAINT FK_Services_personnelResponsable_id FOREIGN KEY (personnelResponsable_id ) REFERENCES Personnels(personnel_id);
ALTER TABLE Allergies ADD CONSTRAINT FK_Allergies_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);
ALTER TABLE Documents ADD CONSTRAINT FK_Documents_docType_id FOREIGN KEY (docType_id) REFERENCES DocType(docType_id);
ALTER TABLE Examens ADD CONSTRAINT FK_Examens_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);
ALTER TABLE Roles ADD CONSTRAINT FK_Roles_droit_id FOREIGN KEY (droit_id) REFERENCES Droits(droit_id);
ALTER TABLE Dossiers ADD CONSTRAINT FK_Dossiers_patient_id FOREIGN KEY (patient_id) REFERENCES Patients(patient_id);
ALTER TABLE Partie_ElementsSuivis ADD CONSTRAINT FK_Partie_ElementsSuivis_ES_id FOREIGN KEY (ES_id) REFERENCES ElementsSuivis(ES_id);
ALTER TABLE Partie_ElementsSuivis ADD CONSTRAINT FK_Partie_ElementsSuivis_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Partie_Prescription ADD CONSTRAINT FK_Partie_Prescription_prescription_id FOREIGN KEY (prescription_id) REFERENCES Prescriptions(prescription_id);
ALTER TABLE Partie_Prescription ADD CONSTRAINT FK_Partie_Prescription_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Partie_Episodes ADD CONSTRAINT FK_Partie_Episodes_epOuvert_id FOREIGN KEY (epOuvert_id) REFERENCES EpisodesEnCours(epOuvert_id);
ALTER TABLE Partie_Episodes ADD CONSTRAINT FK_Partie_Episodes_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Partie_Antecedents ADD CONSTRAINT FK_Partie_Antecedents_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);
ALTER TABLE Partie_Antecedents ADD CONSTRAINT FK_Partie_Antecedents_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Rediger ADD CONSTRAINT FK_Rediger_personnel_id FOREIGN KEY (personnel_id) REFERENCES Personnels(personnel_id);
ALTER TABLE Rediger ADD CONSTRAINT FK_Rediger_doc_id FOREIGN KEY (doc_id) REFERENCES Documents(doc_id);
ALTER TABLE ListeMeds_Pour_Prescriptions ADD CONSTRAINT FK_ListeMeds_Pour_Prescriptions_prescription_id FOREIGN KEY (prescription_id) REFERENCES Prescriptions(prescription_id);
ALTER TABLE ListeMeds_Pour_Prescriptions ADD CONSTRAINT FK_ListeMeds_Pour_Prescriptions_med_id FOREIGN KEY (med_id) REFERENCES Medicaments(med_id);
ALTER TABLE ListePatho_Pour_Episodes ADD CONSTRAINT FK_ListePatho_Pour_Episodes_epOuvert_id FOREIGN KEY (epOuvert_id) REFERENCES EpisodesEnCours(epOuvert_id);
ALTER TABLE ListePatho_Pour_Episodes ADD CONSTRAINT FK_ListePatho_Pour_Episodes_patho_id FOREIGN KEY (patho_id) REFERENCES Pathologies(patho_id);
ALTER TABLE Possession_Roles ADD CONSTRAINT FK_Possession_Roles_role_id FOREIGN KEY (role_id) REFERENCES Roles(role_id);
ALTER TABLE Possession_Roles ADD CONSTRAINT FK_Possession_Roles_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);
ALTER TABLE Partie_DocumentsPatient ADD CONSTRAINT FK_Partie_DocumentsPatient_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Partie_DocumentsPatient ADD CONSTRAINT FK_Partie_DocumentsPatient_doc_id FOREIGN KEY (doc_id) REFERENCES Documents(doc_id);
ALTER TABLE Relation_RolesDossiers ADD CONSTRAINT FK_Relation_RolesDossiers_role_id FOREIGN KEY (role_id) REFERENCES Roles(role_id);
ALTER TABLE Relation_RolesDossiers ADD CONSTRAINT FK_Relation_RolesDossiers_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
