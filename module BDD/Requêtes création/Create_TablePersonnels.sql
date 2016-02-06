#------------------------------------------------------------
# Table: Personnels
#------------------------------------------------------------

CREATE TABLE Personnels(
        personnel_id         int (11) Auto_increment  NOT NULL ,
        nom                  Varchar (32) NOT NULL ,
        prenom               Varchar (32) NOT NULL ,
        num_adeli            Varchar (32) ,
        num_RPPS             Varchar (32) ,
        telephone_mobile     Varchar (12) ,
        telephone_fixe       Varchar (12) ,
        created              Datetime ,
        pole_id              Int NOT NULL ,
        poleResponsable_id        Int NOT NULL ,
        services_id          Int NOT NULL ,
        servicesResponsable_id Int NOT NULL ,
        specialite_id        Int NOT NULL ,
        PRIMARY KEY (personnel_id )
)ENGINE=InnoDB;

ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_pole_id FOREIGN KEY (pole_id) REFERENCES Poles(pole_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_pole_id_Poles FOREIGN KEY (poleResponsable_id) REFERENCES Poles(pole_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_services_id FOREIGN KEY (services_id) REFERENCES Services(services_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_services_id_Services FOREIGN KEY (servicesResponsable_id) REFERENCES Services(services_id);
ALTER TABLE Personnels ADD CONSTRAINT FK_Personnels_specialite_id FOREIGN KEY (specialite_id) REFERENCES Specialites(specialite_id);