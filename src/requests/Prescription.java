package requests;

import java.util.ArrayList;

public class Prescription {
	private int id;
	private String libelle;
	private String date_deb;
	private String date_fin;
	ArrayList<Medicament> medList;
	
	public Prescription(int id, String libelle, String date_deb, String date_fin) {
		this.id = id;
		this.libelle = libelle;
		this.date_deb = date_deb;
		this.date_fin = date_fin;
	}
}
