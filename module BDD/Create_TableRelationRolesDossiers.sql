#------------------------------------------------------------
# Table: Relation RolesDossiers
#------------------------------------------------------------

CREATE TABLE Relation_RolesDossiers(
        role_id     Int NOT NULL ,
        num_dossier Int NOT NULL ,
        PRIMARY KEY (role_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Relation_RolesDossiers ADD CONSTRAINT FK_Relation_RolesDossiers_role_id FOREIGN KEY (role_id) REFERENCES Roles(role_id);
ALTER TABLE Relation_RolesDossiers ADD CONSTRAINT FK_Relation_RolesDossiers_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);