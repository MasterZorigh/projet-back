package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.dto.LivreDTO.GenreEnum;
import com.univlittoral.projetback.dto.UlcothequeRequestSaveDTO;
import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.entity.UlcothequeEntity;

public class UlcothequeMapper {
	public static LivreDTO map1(UlcothequeEntity source, AuteurEntity carac) {
		LivreDTO result = new LivreDTO();
	    AuteurDTO auteur = new AuteurDTO();
	    
	    result.setId(source.getId());
		result.setNom(source.getNom());
		result.setEditeur(source.getEditeur());
		result.setPages(source.getPages());
		result.setParution(source.getParution());
		result.setParutionLi(source.getParutionLi());
		result.setGenre(GenreEnum.valueOf(source.getGenre()));
		result.setAuteur(auteur);
		
		auteur.setIdAuteur(carac.getIdAuteur());
		auteur.setNomAuteur(carac.getNomAuteur());
		auteur.setPrenomAuteur(carac.getPrenomAuteur());
		auteur.setDateNaissanceAuteur(carac.getDateNaissanceAuteur());	
		
		return result;
		
	}
	
	public static List<LivreDTO>convertEntityToDTO(List<UlcothequeEntity> ulcothequeEntities){
		List<LivreDTO>result =  new ArrayList<LivreDTO>();
		
		for(final UlcothequeEntity entity:ulcothequeEntities) {
			result.add(UlcothequeMapper.map1(entity));
		}
		
		return result;
	}
	
	public static UlcothequeEntity map2(UlcothequeRequestSaveDTO source) {
		UlcothequeEntity result = new UlcothequeEntity();
		result.setId(source.getId());
		result.setLivre(source.getLivre());
		result.setAuteur(source.getAuteur());
		result.setGenre(source.getGenre().toString());
		result.setEditeur(source.getEditeur());
		result.setPages(source.getPages());
		result.setParution(source.getParution());
		
		return result;
		
	}
}
