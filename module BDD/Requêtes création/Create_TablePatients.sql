
#------------------------------------------------------------
# Table: Patients
#------------------------------------------------------------

CREATE TABLE Patients(
        patient_id       int (11) Auto_increment  NOT NULL ,
        num_NSS          Int ,
        nom              Varchar (15) ,
        prenom           Varchar (32) NOT NULL ,
        sexe             Char (1) NOT NULL ,
        date_naissance   Date ,
        mutuelle         Varchar (32) ,
        adresse          Varchar (128) ,
        ville            Varchar (32) ,
        code_postal      Int ,
        telephone_fixe   Varchar (12) ,
        telephone_mobile Varchar (12) ,
        pole_id          Int NOT NULL ,
        services_id      Int NOT NULL ,
        num_dossier      Int NOT NULL ,
        PRIMARY KEY (patient_id )
)ENGINE=InnoDB;

ALTER TABLE Patients ADD CONSTRAINT FK_Patients_pole_id FOREIGN KEY (pole_id) REFERENCES Poles(pole_id);
ALTER TABLE Patients ADD CONSTRAINT FK_Patients_services_id FOREIGN KEY (services_id) REFERENCES Services(services_id);
ALTER TABLE Patients ADD CONSTRAINT FK_Patients_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);