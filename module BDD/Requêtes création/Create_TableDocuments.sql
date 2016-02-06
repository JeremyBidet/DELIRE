#------------------------------------------------------------
# Table: Documents
#------------------------------------------------------------

CREATE TABLE Documents(
        doc_id     int (11) Auto_increment  NOT NULL ,
        contenu    Blob ,
        size_file  Float NOT NULL ,
        created    Datetime ,
        docType_id Int ,
        PRIMARY KEY (doc_id )
)ENGINE=InnoDB;

ALTER TABLE Documents ADD CONSTRAINT FK_Documents_docType_id FOREIGN KEY (docType_id) REFERENCES DocType(docType_id);