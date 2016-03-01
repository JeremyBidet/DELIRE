package fr.upem.requests;

import java.util.ArrayList;

public class EpisodesEnCours {
	private int epOuvert_id;
	private String date_debut;
	private String date_derniere_visite;
	private String notes;
	private ArrayList<Pathologies> pathoList;
	
	public EpisodesEnCours(int epOuvert_id, String date_debut, String date_derniere_visite, String notes) {
		this.epOuvert_id = epOuvert_id;
		this.date_debut = date_debut;
		this.date_derniere_visite = date_derniere_visite;
		this.notes = notes;
		pathoList = new ArrayList<Pathologies>();
	}
	
	public void addPath(Pathologies p) {
		pathoList.add(p);
	}

	public int getEpOuvert_id() {
		return epOuvert_id;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public String getDate_derniere_visite() {
		return date_derniere_visite;
	}

	public String getNotes() {
		return notes;
	}

	public ArrayList<Pathologies> getPathoList() {
		return pathoList;
	}

	@Override
	public String toString() {
		return epOuvert_id + " " + date_debut + " " + date_derniere_visite + " " + notes + " " + pathoList;
	}
	
}
