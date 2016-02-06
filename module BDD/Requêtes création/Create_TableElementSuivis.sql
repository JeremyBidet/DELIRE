#------------------------------------------------------------
# Table: ElementsSuivis
#------------------------------------------------------------

CREATE TABLE ElementsSuivis(
        ES_id          int (11) Auto_increment  NOT NULL ,
        examen_type    Varchar (32) NOT NULL ,
        examen_libelle Varchar (64) NOT NULL ,
        valeur_1       Float NOT NULL ,
        unite_1        Varchar (25) NOT NULL ,
        valeur_2       Float NOT NULL ,
        unite_2        Varchar (25) NOT NULL ,
        resultat_test  Varchar (25) ,
        PRIMARY KEY (ES_id )
)ENGINE=InnoDB;