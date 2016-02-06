#------------------------------------------------------------
# Table: Services
#------------------------------------------------------------

CREATE TABLE Services(
        services_id     int (11) Auto_increment  NOT NULL ,
        service_libelle Varchar (32) NOT NULL ,
        PRIMARY KEY (services_id )
)ENGINE=InnoDB;
