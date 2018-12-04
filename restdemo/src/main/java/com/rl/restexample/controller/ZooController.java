package com.rl.restexample.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rl.restexample.models.Animal;
import com.rl.restexample.services.ZooService;

@RestController
public class ZooController {

	@Autowired
	ZooService zooService;

	@GetMapping("/Animals")
	public Collection<Animal> getAllAnimals(){
		
		return zooService.getAllAnimals();
	}
	
	@PostMapping("/Animals")
	public String addNewAnimal(Animal animal){
		
		return zooService.addNewAnimal(animal);
	}
	
	@DeleteMapping("/Animals/{animalName}")
	public String removeAnimal(@PathVariable("animalName") String animalName){
		
		return zooService.removeAnimal(animalName);
	}
	@PutMapping("/Animals/{animalName}")
	public String updateAnimal(@PathVariable("animalName") String animalName, Animal animal	){
		
		return zooService.updateAnimal(animalName,animal);
	}

}
