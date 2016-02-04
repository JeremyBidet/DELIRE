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