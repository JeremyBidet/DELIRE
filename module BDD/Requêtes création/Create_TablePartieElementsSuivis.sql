#------------------------------------------------------------
# Table: Partie ElementsSuivis
#------------------------------------------------------------

CREATE TABLE Partie_ElementsSuivis(
		ES_id        Int NOT NULL ,
        num_dossier  Int NOT NULL ,
        personnel_id Int ,
        created      Datetime ,
        PRIMARY KEY (ES_id ,num_dossier )
)ENGINE=InnoDB;

ALTER TABLE Partie_ElementsSuivis ADD CONSTRAINT FK_Partie_ElementsSuivis_ES_id FOREIGN KEY (ES_id) REFERENCES ElementsSuivis(ES_id);
ALTER TABLE Partie_ElementsSuivis ADD CONSTRAINT FK_Partie_ElementsSuivis_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);