#------------------------------------------------------------
# Table: Partie DocumentsPatient
#------------------------------------------------------------

CREATE TABLE Partie_DocumentsPatient(
        num_dossier Int NOT NULL ,
        doc_id      Int NOT NULL ,
        PRIMARY KEY (num_dossier ,doc_id )
)ENGINE=InnoDB;

ALTER TABLE Partie_DocumentsPatient ADD CONSTRAINT FK_Partie_DocumentsPatient_num_dossier FOREIGN KEY (num_dossier) REFERENCES Dossiers(num_dossier);
ALTER TABLE Partie_DocumentsPatient ADD CONSTRAINT FK_Partie_DocumentsPatient_doc_id FOREIGN KEY (doc_id) REFERENCES Documents(doc_id);