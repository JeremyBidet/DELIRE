#------------------------------------------------------------
# Table: Relation RolesDossiersUsers
#------------------------------------------------------------

CREATE TABLE Relation_RolesDossiersUsers(
        num_dossier Int NOT NULL ,
        droit_id    Int NOT NULL ,
        user_id     Int NOT NULL ,
        PRIMARY KEY (num_dossier ,droit_id ,user_id )
)ENGINE=InnoDB;

ALTER TABLE Relation_RolesDossiersUsers ADD CONSTRAINT FK_Relation_RolesDossiersUsers_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Relation_RolesDossiersUsers ADD CONSTRAINT FK_Relation_RolesDossiersUsers_droit_id FOREIGN KEY (droit_id) REFERENCES Droits(droit_id);
ALTER TABLE Relation_RolesDossiersUsers ADD CONSTRAINT FK_Relation_RolesDossiersUsers_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);