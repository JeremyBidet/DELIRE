#------------------------------------------------------------
# Table: Examens
#------------------------------------------------------------

CREATE TABLE Examens(
        exam_id        int (11) Auto_increment  NOT NULL ,
        examen_libelle Varchar (32) NOT NULL ,
        examen_type    Varchar (16) ,
        PRIMARY KEY (exam_id )
)ENGINE=InnoDB;