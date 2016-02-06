#------------------------------------------------------------
# Table: Droits
#------------------------------------------------------------

CREATE TABLE Droits(
        droit_id                             int (11) Auto_increment  NOT NULL ,
        role_libelle                         Varchar (32) NOT NULL ,
        droit_lecture_identite_patient       Bool ,
        droit_lecture_prescriptions_patient  Bool ,
        droit_ecriture_prescriptions_patient Bool ,
        droit_lecture_antecedents_patient    Bool ,
        droit_ecriture_antecedents_patient   Bool ,
        droit_lecture_episodes_patient       Bool ,
        droit_ecriture_episodes_patient      Bool ,
        droit_lecture_elementSuivis_patient  Bool ,
        droit_ecriture_elementSuivis_patient Bool ,
        PRIMARY KEY (droit_id )
)ENGINE=InnoDB;

ALTER TABLE Droits ADD CONSTRAINT FK_Droits_user_id FOREIGN KEY (user_id) REFERENCES Users(user_id);