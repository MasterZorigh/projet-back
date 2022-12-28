package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.dto.UlcothequeRequestSaveDTO;
import com.univlittoral.projetback.entity.UlcothequeEntity;
import com.univlittoral.projetback.mapper.UlcothequeMapper;
import com.univlittoral.projetback.service.UlcothequeService;

/**
 * @author Valentin MANTEZ
 *
 */

@RestController
@RequestMapping(value="rest/bd")
@Transactional
public class TestBD {
	@Autowired
	private UlcothequeService service;
	
	@GetMapping(value="/test")
	public String getMethodtest() {
		return "Partie back du projet 'Ulco'thèque' du module JEE - UE110";	
	}
	
	@GetMapping(value="/home")
	public List<LivreDTO> findAll(){
		return UlcothequeMapper.convertEntityToDTO(service.findAll());
	} 
	
//	@GetMapping(value="/auteur")
	
//	@GetMapping(value="/auteur/{id}")
	

	@GetMapping(value="/livres/{id}")
	public LivreDTO findOne(@PathVariable Long id) {
		return UlcothequeMapper.map1(service.findOne(id));
	}
	
//	@GetMapping(value="/livres?genre={param}")
	
	
	
	@PostMapping(value="/livres")
	public void saveOne(@RequestBody UlcothequeRequestSaveDTO livre) {
		service.saveOne(UlcothequeMapper.map2(livre));
	}	
	
	@PutMapping(value="/livres/{id}")
	public void updateOne(@PathVariable Long id, @RequestBody UlcothequeRequestSaveDTO livre) {
		UlcothequeEntity livreToSave = UlcothequeMapper.map2(livre);
        livreToSave.setId(id);
        service.updateOne(livreToSave);
	}
	
	@DeleteMapping(value="/livres/{id}")
	public void deleteOne(@PathVariable Long id) {
		service.deleteOne(id);
	}
	
	
}
