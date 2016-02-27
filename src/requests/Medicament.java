package requests;

public class Medicament {
	private int CIP;
	private String libelle;
	private String libelleDCI;
	private String format;
	private String dosage;
	
	public Medicament(int CIP,String libelle, String libelleDCI, String format, String dosage) {
		this.CIP = CIP;
		this.libelle = libelle;
		this.libelleDCI = libelleDCI;
		this.format = format;
		this.dosage = dosage;
	}
	
	@Override
	public String toString() {
		return CIP + " " + libelle + " " + libelleDCI + " " + format + " " + dosage;
	}
}
