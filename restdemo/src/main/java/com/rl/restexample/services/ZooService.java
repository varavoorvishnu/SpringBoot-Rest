package com.rl.restexample.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rl.restexample.models.Animal;
import com.rl.restexample.repository.ZooRepository;

@Component
public class ZooService {
	
	@Autowired
	ZooRepository zooRepository;
	
	public Collection<Animal> getAllAnimals(){
		
		return zooRepository.getAllAnimals();
	}

	public String addNewAnimal(Animal animal) {
		
		return zooRepository.addNewAnimal(animal);
	}

	public String removeAnimal(String animalName) {
		return zooRepository.removeAnimal(animalName);
	}

	public String updateAnimal(String animalName,Animal animal) {
		
		return zooRepository.updateAnimal(animalName,animal);
	}

}
