#------------------------------------------------------------
# Table: Examens
#------------------------------------------------------------

CREATE TABLE Examens(
        examen_libelle Varchar (32) NOT NULL ,
        examen_type    Varchar (16) ,
        antecedent_id  Int NOT NULL ,
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;

ALTER TABLE Examens ADD CONSTRAINT FK_Examens_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);