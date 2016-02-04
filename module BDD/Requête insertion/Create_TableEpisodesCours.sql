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