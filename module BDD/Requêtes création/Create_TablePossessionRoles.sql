#------------------------------------------------------------
# Table: Possession Roles
#------------------------------------------------------------

CREATE TABLE Possession_Roles(
        role_id Int NOT NULL ,
        user_id Int NOT NULL ,
        PRIMARY KEY (role_id ,user_id )
)ENGINE=InnoDB;

ALTER TABLE Possession_Roles ADD CONSTRAINT FK_Possession_Roles_role_id FOREIGN KEY (role_id) REFERENCES Roles(role_id);
ALTER TABLE Possession_Roles ADD CONSTRAINT FK_Possession_Roles_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);