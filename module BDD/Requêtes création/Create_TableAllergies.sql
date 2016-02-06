#------------------------------------------------------------
# Table: Allergies
#------------------------------------------------------------

CREATE TABLE Allergies(
		antecedent_id    Int NOT NULL ,
        allergie_libelle Varchar (64) NOT NULL ,
        code_CIM10       Varchar (16) NOT NULL ,   
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;

ALTER TABLE Allergies ADD CONSTRAINT FK_Allergies_antecedent_id FOREIGN KEY (antecedent_id) REFERENCES Antecedents(antecedent_id);