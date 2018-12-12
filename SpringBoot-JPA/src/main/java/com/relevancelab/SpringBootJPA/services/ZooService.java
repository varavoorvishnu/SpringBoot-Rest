package com.relevancelab.SpringBootJPA.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.relevancelab.SpringBootJPA.models.Animal;
import com.relevancelab.SpringBootJPA.repository.ZooRepository;
import com.relevancelab.SpringBootJPA.repository.iZooRepository;

@Service
public class ZooService {
	
	@Autowired
	ZooRepository zooRepository;
	
	public Collection<Animal> getAllAnimals(){
		
		return zooRepository.getAllAnimals();
	}

	public ResponseEntity<Animal> addNewAnimal(Animal animal) {
		
		return zooRepository.addNewAnimal(animal);
	}

	public String removeAnimal(int animal_id) {
		return zooRepository.removeAnimal(animal_id);
	}

	public ResponseEntity<Animal> updateAnimal(int id,Animal animal) {
		
		return zooRepository.updateAnimal(id,animal);
	}


}
