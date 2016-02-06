#------------------------------------------------------------
# Table: Partie Prescription
#------------------------------------------------------------

CREATE TABLE Partie_Prescription(
        prescription_id Int NOT NULL ,
        num_dossier     Int NOT NULL ,
        date_debut      Varchar (10) ,
        date_fin        Varchar (10) ,
        personnel_id    Int NOT NULL ,
        created         Datetime ,
        PRIMARY KEY (prescription_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Partie_Prescription ADD CONSTRAINT FK_Partie_Prescription_prescription_id FOREIGN KEY (prescription_id) REFERENCES Prescriptions(prescription_id);
ALTER TABLE Partie_Prescription ADD CONSTRAINT FK_Partie_Prescription_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);