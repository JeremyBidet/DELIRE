#------------------------------------------------------------
# Table: ListeMeds Pour Prescriptions
#------------------------------------------------------------

CREATE TABLE ListeMeds_Pour_Prescriptions(
        prescription_id Int NOT NULL ,
        med_id          Int NOT NULL ,
        PRIMARY KEY (prescription_id ,med_id )
)ENGINE=InnoDB;

ALTER TABLE ListeMeds_Pour_Prescriptions ADD CONSTRAINT FK_ListeMeds_Pour_Prescriptions_prescription_id FOREIGN KEY (prescription_id) REFERENCES Prescriptions(prescription_id);
ALTER TABLE ListeMeds_Pour_Prescriptions ADD CONSTRAINT FK_ListeMeds_Pour_Prescriptions_med_id FOREIGN KEY (med_id) REFERENCES Medicaments(med_id);