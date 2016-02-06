#------------------------------------------------------------
# Table: PossederDroits
#------------------------------------------------------------

CREATE TABLE PossederDroits(
        droit_id Int NOT NULL ,
        user_id  Int NOT NULL ,
        PRIMARY KEY (droit_id ,user_id )
)ENGINE=InnoDB;

ALTER TABLE PossederDroits ADD CONSTRAINT FK_PossederDroits_droit_id FOREIGN KEY (droit_id) REFERENCES Droits(droit_id);
ALTER TABLE PossederDroits ADD CONSTRAINT FK_PossederDroits_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);
