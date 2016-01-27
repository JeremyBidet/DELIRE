#------------------------------------------------------------
# Table: Specialite
#------------------------------------------------------------

CREATE TABLE Specialite(
        specialite_id      int (11) Auto_increment  NOT NULL ,
        specialite_libelle Varchar (32) NOT NULL ,
        PRIMARY KEY (specialite_id )
)ENGINE=InnoDB;