package com.relevancelab.SpringBootJPA.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.relevancelab.SpringBootJPA.models.Animal;

@Repository
public class ZooRepository {
	@Autowired
	iZooRepository izooRepository;
	
	@PersistenceContext
    private EntityManager manager;
     

	Collection<Animal> animalList = new ArrayList<Animal>();

	public Collection<Animal> getAllAnimals() {
		animalList = (Collection<Animal>)izooRepository.findAll();
		return animalList;
		
	}

	
	public String addNewAnimal(Animal animal) {
		izooRepository.save(animal);
		return "Animal Added. Animal Name :"+animal.getAnimal_name()+ "Animal Type :"+animal.getAnimal_type();
	}

	
	public String removeAnimal(String animal_id) {
		izooRepository.deleteById(animal_id);
	return "Animal removed :"+animal_id;
	}
	
	@Transactional
	public ResponseEntity<Animal> updateAnimal(String animal_id,Animal animal) {
		Optional<Animal> OptionalAnimal=izooRepository.findById(animal_id);
		if(OptionalAnimal.isPresent()) {
			Animal oldanimal = OptionalAnimal.get();
			oldanimal.setAnimal_name(animal.getAnimal_name());
			oldanimal.setAnimal_type(animal.getAnimal_type());
			return new ResponseEntity<>(izooRepository.save(oldanimal),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
	}
	

	
	
}
