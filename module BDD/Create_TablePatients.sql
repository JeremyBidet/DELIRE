CREATE TABLE Patients(
        num_NSS          Int NOT NULL ,
        nom              Varchar (32) ,
        prenom           Varchar (32) NOT NULL ,
        sexe             Char (1) NOT NULL ,
        date_naissance   Varchar (32) ,
        mutuelle         Varchar (32) ,
        adresse          Text ,
        ville            Varchar (32) ,
        code_postal      Int ,
        telephone_fixe   Varchar (12) ,
        telephone_mobile Varchar (12) ,
        pole_id          Int NOT NULL ,
        services_id      Int NOT NULL ,
        PRIMARY KEY (num_NSS )
)ENGINE=InnoDB;

ALTER TABLE Patients ADD CONSTRAINT FK_Patients_pole_id FOREIGN KEY (pole_id) REFERENCES Poles(pole_id);
ALTER TABLE Patients ADD CONSTRAINT FK_Patients_services_id FOREIGN KEY (services_id) REFERENCES Services(services_id);