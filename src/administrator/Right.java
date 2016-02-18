package administrator;

public enum Right {
	
	DROIT_LECTURE_IDENTITE_PATIENT(1,"droit_lecture_identite_patient"),
	DROIT_LECTURE_PRESCRIPTIONS_PATIENT(2, "droit_lecture_prescriptions_patient"),
	DROIT_ECIRTURE_PRESCRIPTIONS_PATIENT(3, "droit_ecriture_prescriptions_patient"),
	DROIT_LECTURE_ANTECEDENTS_PATIENT(4, "droit_lecture_antecedents_patient"),
	DROIT_ECRITURE_ANTECEDENTS_PATIENT(5, "droit_ecriture_antecedents_patient"),
	DROIT_LECTURE_EPISODES_PATIENT(6, "droit_lecture_episodes_patient"),
	DROIT_ECRITURE_EPISODES_PATIENT(7, "droit_ecriture_episodes_patient"),
	DROIT_LECTURE_ELEMENTSUIVIS_PATIENT(8, "droit_lecture_elementSuivis_patient"),
	DROIT_ECRITURE_ELEMENTSUIVIS_PATIENT(9, "droit_ecriture_elementSuivis_patient");
	
	
	private int rigthNo;
	private String label;
	Right(int rightNo, String label){
		this.rigthNo = rightNo;
		this.label = label;
	}
	
	/**
	 * Return the number of the Right.
	 * @return the number of the Right.
	 */
	public int getRightNo(){
		return rigthNo;
	}
	
	/**
	 * Return the label of the Right.
	 * @return the label of the Right.
	 */
	public String getLabel(){
		return label;
	}
}
