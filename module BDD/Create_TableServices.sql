
#------------------------------------------------------------
# Table: Services
#------------------------------------------------------------

CREATE TABLE Services(
        services_id     int (11) Auto_increment  NOT NULL ,
        service_libelle Varchar (32) NOT NULL ,
        personnel_id    Int NOT NULL ,
        PRIMARY KEY (services_id )
)ENGINE=InnoDB;

ALTER TABLE Services ADD CONSTRAINT FK_Services_personnelResponsable_id FOREIGN KEY (personnelResponsable_id) REFERENCES Personnels(personnel_id);