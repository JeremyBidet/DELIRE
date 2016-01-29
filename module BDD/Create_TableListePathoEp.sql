#------------------------------------------------------------
# Table: ListePatho Pour Episodes
#------------------------------------------------------------

CREATE TABLE ListePatho_Pour_Episodes(
        epOuvert_id Int NOT NULL ,
        patho_id    Int NOT NULL ,
        PRIMARY KEY (epOuvert_id ,patho_id )
)ENGINE=InnoDB;

ALTER TABLE ListePatho_Pour_Episodes ADD CONSTRAINT FK_ListePatho_Pour_Episodes_epOuvert_id FOREIGN KEY (epOuvert_id) REFERENCES EpisodesEnCours(epOuvert_id);
ALTER TABLE ListePatho_Pour_Episodes ADD CONSTRAINT FK_ListePatho_Pour_Episodes_patho_id FOREIGN KEY (patho_id) REFERENCES Pathologies(patho_id);