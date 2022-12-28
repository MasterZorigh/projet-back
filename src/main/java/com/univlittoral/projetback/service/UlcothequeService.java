package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.UlcothequeEntity;
import com.univlittoral.projetback.repository.UlcothequeRepository;


/**
 * 
 * @author Valentin MANTEZ
 *
 */

@Service

public class UlcothequeService {
	
	@Autowired
	private UlcothequeRepository repo;	
	
	public List<UlcothequeEntity> findAll(){
		return repo.findAll();
	}
	
	public UlcothequeEntity findOne(final Long id) {
		return repo.findById(id).orElse(null);
	}
	
	
	public void deleteOne(final Long id) {
		repo.deleteById(id);
	}
	
	public void saveOne(UlcothequeEntity ulcotheque) {
		repo.save(ulcotheque);
	}
	
	public void updateOne(UlcothequeEntity ulcotheque) {
		repo.save(ulcotheque);
	}
	
}
