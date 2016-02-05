#------------------------------------------------------------
# Table: Partie Antecedents
#------------------------------------------------------------

CREATE TABLE Partie_Antecedents(
        date_debut    Date ,
        date_fin      Date ,
        note          Text ,
        personnel_id  Int ,
        created       Datetime ,
        antecedent_id Int NOT NULL ,
        num_dossier   Int NOT NULL ,
        PRIMARY KEY (antecedent_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Partie_Antecedents ADD CONSTRAINT FK_Partie_Antecedents_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);
ALTER TABLE Partie_Antecedents ADD CONSTRAINT FK_Partie_Antecedents_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);