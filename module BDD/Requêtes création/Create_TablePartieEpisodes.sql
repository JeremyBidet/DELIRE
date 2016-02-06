#------------------------------------------------------------
# Table: Partie Episodes
#------------------------------------------------------------

CREATE TABLE Partie_Episodes(
        epOuvert_id          Int NOT NULL ,
        num_dossier          Int NOT NULL ,
        date_debut           Varchar (10) ,
        date_derniere_visite Varchar (10) ,
        notes                Text ,
        personnel_id         Int NOT NULL ,
        created              Datetime ,
        PRIMARY KEY (epOuvert_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Partie_Episodes ADD CONSTRAINT FK_Partie_Episodes_epOuvert_id FOREIGN KEY (epOuvert_id) REFERENCES EpisodesEnCours(epOuvert_id);
ALTER TABLE Partie_Episodes ADD CONSTRAINT FK_Partie_Episodes_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);