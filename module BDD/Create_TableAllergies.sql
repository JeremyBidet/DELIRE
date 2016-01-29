#------------------------------------------------------------
# Table: Allergies
#------------------------------------------------------------

CREATE TABLE Allergies(
        allergie_id      int (11) Auto_increment  NOT NULL ,
        allergie_libelle Varchar (32) NOT NULL ,
        code_CIM10       Varchar (16) NOT NULL ,
        PRIMARY KEY (allergie_id )
)ENGINE=InnoDB;