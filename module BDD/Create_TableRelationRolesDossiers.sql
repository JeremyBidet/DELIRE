#------------------------------------------------------------
# Table: Relation RolesDossiers
#------------------------------------------------------------

CREATE TABLE Relation_RolesDossiers(
        num_dossier Int NOT NULL ,
        droit_id    Int NOT NULL ,
        PRIMARY KEY (num_dossier ,droit_id )
)ENGINE=InnoDB;

ALTER TABLE Relation_RolesDossiers ADD CONSTRAINT FK_Relation_RolesDossiers_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Relation_RolesDossiers ADD CONSTRAINT FK_Relation_RolesDossiers_droit_id FOREIGN KEY (droit_id) REFERENCES Droits(droit_id);
