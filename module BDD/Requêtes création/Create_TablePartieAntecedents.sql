#------------------------------------------------------------
# Table: Partie Antecedents
#------------------------------------------------------------

CREATE TABLE Partie_Antecedents(
        antecedent_id Int NOT NULL ,
        num_dossier   Int NOT NULL ,
        date_debut    Varchar (10) NOT NULL ,
        date_fin      Varchar (10) NOT NULL ,
        notes         Text ,
        personnel_id  Int NOT NULL ,
        created       Datetime ,
        PRIMARY KEY (antecedent_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Partie_Antecedents ADD CONSTRAINT FK_Partie_Antecedents_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);
ALTER TABLE Partie_Antecedents ADD CONSTRAINT FK_Partie_Antecedents_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);