#------------------------------------------------------------
# Table: Pathologies
#------------------------------------------------------------

CREATE TABLE Pathologies(
        patho_id      int (11) Auto_increment  NOT NULL ,
        patho_libelle Varchar (32) NOT NULL ,
        codeCIM10     Varchar (16) NOT NULL ,
        PRIMARY KEY (patho_id )
)ENGINE=InnoDB;