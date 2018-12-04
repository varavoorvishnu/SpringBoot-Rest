package com.rl.restexample.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.rl.restexample.models.Animal;

@Component
public class ZooRepository {

	Collection<Animal> animalList = new ArrayList<Animal>();

	public Collection<Animal> getAllAnimals() {
		return animalList;
		
	}

	
	public String addNewAnimal(Animal animal) {
		getAllAnimals().add(animal);
		return "Animal Added. Animal Name :"+animal.getAnimalName()+ "Animal Type :"+animal.getAnimalType();
	}


	public String removeAnimal(String animalName) {

		getAllAnimals().forEach(obj -> System.out.println(obj.getAnimalName()));
		getAllAnimals().removeIf(obj -> obj.getAnimalName().equals(animalName));
		return "Animal removed :"+animalName;
	}
	
	
	public String updateAnimal(String animalName,Animal animal) {

		getAllAnimals().forEach(obj -> System.out.println(obj.getAnimalName()));
		getAllAnimals().removeIf(obj -> obj.getAnimalName().equals(animalName));
		Animal newanimal = new Animal();
		newanimal.setAnimalName(animalName);
		newanimal.setAnimalType(animal.getAnimalType());
		getAllAnimals().add(animal);
		return "Animal updated :"+animalName;
		

	}
	

	
	
}
