#------------------------------------------------------------
# Table: Roles
#------------------------------------------------------------

CREATE TABLE Roles(
        role_id      int (11) Auto_increment  NOT NULL ,
        role_libelle Varchar (25) ,
        droit_id     Int ,
        PRIMARY KEY (role_id )
)ENGINE=InnoDB;

ALTER TABLE Roles ADD CONSTRAINT FK_Roles_droit_id FOREIGN KEY (droit_id) REFERENCES Droits(droit_id);