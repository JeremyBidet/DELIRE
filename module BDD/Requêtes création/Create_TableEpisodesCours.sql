#------------------------------------------------------------
# Table: EpisodesEnCours
#------------------------------------------------------------

CREATE TABLE EpisodesEnCours(
        epOuvert_id     int (11) Auto_increment  NOT NULL ,
        episode_libelle Varchar (32) NOT NULL ,
        PRIMARY KEY (epOuvert_id )
)ENGINE=InnoDB;