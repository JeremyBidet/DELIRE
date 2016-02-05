#------------------------------------------------------------
# Table: Prescriptions
#------------------------------------------------------------

CREATE TABLE Prescriptions(
        prescription_id      int (11) Auto_increment  NOT NULL ,
        libelle_prescription Varchar (64) NOT NULL ,
        dosage               Varchar (64) ,
        PRIMARY KEY (prescription_id )
)ENGINE=InnoDB;