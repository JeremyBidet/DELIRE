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

ALTER TABLE Dossiers ADD CONSTRAINT FK_Dossiers_patient_id FOREIGN KEY (patient_id) REFERENCES Patients(patient_id);