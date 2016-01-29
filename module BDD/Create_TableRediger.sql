#------------------------------------------------------------
# Table: Rediger
#------------------------------------------------------------

CREATE TABLE Rediger(
        date_histo   Date ,
        personnel_id Int NOT NULL ,
        doc_id       Int NOT NULL ,
        PRIMARY KEY (personnel_id ,doc_id )
)ENGINE=InnoDB;

ALTER TABLE Rediger ADD CONSTRAINT FK_Rediger_personnel_id FOREIGN KEY (personnel_id) REFERENCES Personnels(personnel_id);
ALTER TABLE Rediger ADD CONSTRAINT FK_Rediger_doc_id FOREIGN KEY (doc_id) REFERENCES Documents(doc_id);