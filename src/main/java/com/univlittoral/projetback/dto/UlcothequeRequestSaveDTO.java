package com.univlittoral.projetback.dto;
import java.util.Calendar;

import com.univlittoral.projetback.dto.LivreDTO.GenreEnum;

public class UlcothequeRequestSaveDTO {
	private Long id;
	private String nom;
	private String editeur;
	private int pages;
	private Calendar parution;
	private String parutionLi;
	public GenreEnum genre;

	private Long idAuteur;
	private String nomAuteur;
	private String prenomAuteur;
	private Calendar dateNaissanceAuteur;


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
