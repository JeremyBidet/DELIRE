package fr.upem.requests;

public class Pathologies {
	private String patho_libelle;
	private String codeCIM10;
	
	public Pathologies(String patho_libelle, String codeCIM10) {
		this.patho_libelle = patho_libelle;
		this.codeCIM10 = codeCIM10;
	}

	public String getPatho_libelle() {
		return patho_libelle;
	}

	public String getCodeCIM10() {
		return codeCIM10;
	}

	@Override
	public String toString() {
		return patho_libelle + " " + codeCIM10;
	}	
}
