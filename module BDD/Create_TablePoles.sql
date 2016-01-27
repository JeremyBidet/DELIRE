#------------------------------------------------------------
# Table: Poles
#------------------------------------------------------------

CREATE TABLE Poles(
        pole_id      int (11) Auto_increment  NOT NULL ,
        libelle_pole Varchar (32) NOT NULL ,
        personnel_id Int NOT NULL ,
        PRIMARY KEY (pole_id )
)ENGINE=InnoDB;

ALTER TABLE Poles ADD CONSTRAINT FK_Poles_personnel_id FOREIGN KEY (personnel_id) REFERENCES Personnels(personnel_id);