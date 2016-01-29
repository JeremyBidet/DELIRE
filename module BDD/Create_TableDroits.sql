#------------------------------------------------------------
# Table: Droits
#------------------------------------------------------------

CREATE TABLE Droits(
        droit_id                             int (11) Auto_increment  NOT NULL ,
        droit_lecture_identite_patient       Bool ,
        droit_lecture_traitements_patient    Bool ,
        droit_ecriture_traitements_patient   Bool ,
        droit_lecture_antecedents_patient    Bool ,
        droit_ecriture_antecedents_patient   Bool ,
        droit_lecture_episodes_patient       Bool ,
        droit_ecriture_episodes_patient      Bool ,
        droit_lecture_elementSuivis_patient  Bool ,
        droit_ecriture_elementSuivis_patient Bool ,
        PRIMARY KEY (droit_id )
)ENGINE=InnoDB;