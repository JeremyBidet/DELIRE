#------------------------------------------------------------
# Table: Traitements
#------------------------------------------------------------

CREATE TABLE Traitements(
        traitement_id int (11) Auto_increment  NOT NULL ,
        libelle       Varchar (64) NOT NULL ,
        dosage        Varchar (64) ,
        date_debut    Date NOT NULL ,
        date_fin      Date NOT NULL ,
        personnel_id  Int ,
        created       Datetime ,
        PRIMARY KEY (traitement_id )
)ENGINE=InnoDB;