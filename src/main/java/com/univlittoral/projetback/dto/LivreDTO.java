package com.univlittoral.projetback.dto;

import java.util.Calendar;

public class LivreDTO {
	private Long id;
	private String nom;
	private String editeur;
	private int pages;
	private Calendar parution;
	private String parutionLi;
	public GenreEnum genre;
	private AuteurDTO Auteur;

	public enum GenreEnum{
		ROMAN, MANGA, BD, POESIE, NOUVELLE
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Calendar getParution() {
		return parution;
	}

	public void setParution(Calendar parution) {
		this.parution = parution;
	}

	public String getParutionLi() {
		return parutionLi;
	}

	public void setParutionLi(String parutionLi) {
		this.parutionLi = parutionLi;
	}

	public GenreEnum getGenre() {
		return genre;
	}

	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}

	public AuteurDTO getAuteur() {
		return Auteur;
	}

	public void setAuteur(AuteurDTO auteur) {
		Auteur = auteur;
	}

	
}
