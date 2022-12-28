package com.univlittoral.projetback.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // => Pour que votre application Spring boot sache que cette classe est une entité
@Table(name="livres") 
public class UlcothequeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id")
	private Long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="editeur")
	private String editeur;
	
	@Column(name="nbPages")
	private int pages;
	
	@Column(name="dateParution")
	private Calendar parution;
	
	@Column(name="lieuParution")
	private String parutionLi;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="auteur")
	private String auteur;

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
}
