#------------------------------------------------------------
# Table: Examens
#------------------------------------------------------------

CREATE TABLE Examens(
		antecedent_id  Int NOT NULL ,
        examen_libelle Varchar (64) NOT NULL ,
        examen_type    Varchar (16) ,
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;

ALTER TABLE Examens ADD CONSTRAINT FK_Examens_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);