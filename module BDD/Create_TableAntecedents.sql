
#------------------------------------------------------------
# Table: Antecedents
#------------------------------------------------------------

CREATE TABLE Antecedents(
        antecedent_id      int (11) Auto_increment  NOT NULL ,
        antecedent_libelle Varchar (32) NOT NULL ,
        date_debut         Date NOT NULL ,
        date_fin           Date NOT NULL ,
        notes              Text ,
        personnel_id       Int ,
        created            Datetime ,
        PRIMARY KEY (antecedent_id )
)ENGINE=InnoDB;