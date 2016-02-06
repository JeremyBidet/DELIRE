#------------------------------------------------------------
# Table: Medicaments
#------------------------------------------------------------

CREATE TABLE Medicaments(
        med_id     int (11) Auto_increment  NOT NULL ,
        CIP        Int NOT NULL ,
        libelle    Varchar (32) ,
        libelleDCI Varchar (64) NOT NULL ,
        Format     Varchar (32) NOT NULL ,
        Dosage     Varchar (32) NOT NULL ,
        PRIMARY KEY (med_id )
)ENGINE=InnoDB;