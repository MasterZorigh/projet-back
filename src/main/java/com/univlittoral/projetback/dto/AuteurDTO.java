package com.univlittoral.projetback.dto;

import java.util.Calendar;

public class AuteurDTO {
	private Long idAuteur;
	private String nomAuteur;
	private String prenomAuteur;
	private Calendar dateNaissanceAuteur;
	
	public Long getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(Long idAuteur) {
		this.idAuteur = idAuteur;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public String getPrenomAuteur() {
		return prenomAuteur;
	}
	public void setPrenomAuteur(String prenomAuteur) {
		this.prenomAuteur = prenomAuteur;
	}
	public Calendar getDateNaissanceAuteur() {
		return dateNaissanceAuteur;
	}
	public void setDateNaissanceAuteur(Calendar dateNaissanceAuteur) {
		this.dateNaissanceAuteur = dateNaissanceAuteur;
	}
	
}
