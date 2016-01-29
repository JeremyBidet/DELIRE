#------------------------------------------------------------
# Table: DocType
#------------------------------------------------------------

CREATE TABLE DocType(
        docType_id int (11) Auto_increment  NOT NULL ,
        type       Int NOT NULL ,
        label      Varchar (32) NOT NULL ,
        PRIMARY KEY (docType_id )
)ENGINE=InnoDB;