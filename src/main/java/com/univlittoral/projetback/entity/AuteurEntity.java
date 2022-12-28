package com.univlittoral.projetback.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auteurs")

public class AuteurEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id")
	private Long idAuteur;
	
	@Column(name="nom")
	private String nomAuteur;
	
	@Column(name="prenom")
	private String prenomAuteur;
	
	@Column(name="dateNaissance")
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
