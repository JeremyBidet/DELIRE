package fr.upem.requests;

import java.io.Serializable;
import java.util.ArrayList;

public class Prescription implements Serializable, Comparable<Prescription> {
	private int id;
	private String libelle;
	private String date_deb;
	private String date_fin;
	private ArrayList<Medicament> medList;
	
	public Prescription(int id, String libelle, String date_deb, String date_fin) {
		this.id = id;
		this.libelle = libelle;
		this.date_deb = date_deb;
		this.date_fin = date_fin;
		medList = new ArrayList<Medicament>();
	}
	
	public void addMed(Medicament m) {
		medList.add(m);
	}

	public int getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getDate_deb() {
		return date_deb;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public ArrayList<Medicament> getMedList() {
		return medList;
	}

	@Override
	public String toString() {
		return id + " " + libelle + " " + date_deb + " " + date_fin + " " + medList;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof Prescription
				&& ((Prescription) o).id == this.id;
	}

	@Override
	public int compareTo(Prescription o) {
		return this.id == o.id ? 0 : this.id == o.id ? -1 : 1;
	}
}
