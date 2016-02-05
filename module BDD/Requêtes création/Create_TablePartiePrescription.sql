#------------------------------------------------------------
# Table: Partie Prescription
#------------------------------------------------------------

CREATE TABLE Partie_Prescription(
        date_debut      Date ,
        date_fin        Date ,
        personnel_id    Int ,
        created         Datetime ,
        prescription_id Int NOT NULL ,
        num_dossier     Int NOT NULL ,
        PRIMARY KEY (prescription_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Partie_Prescription ADD CONSTRAINT FK_Partie_Prescription_prescription_id FOREIGN KEY (prescription_id) REFERENCES Prescriptions(prescription_id);
ALTER TABLE Partie_Prescription ADD CONSTRAINT FK_Partie_Prescription_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);