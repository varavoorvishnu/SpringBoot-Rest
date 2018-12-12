package com.relevancelab.SpringBootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relevancelab.SpringBootJPA.models.Animal;
import com.relevancelab.SpringBootJPA.services.ZooService;

@RestController
@RequestMapping("/Animals")
public class ZooController {

	@Autowired
	ZooService zooService;

	/*@GetMapping
	public Collection<Animal> getAllAnimals(){
		
		return zooService.getAllAnimals();
	}*/
	
	
	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public String addNewAnimal(@RequestBody Animal animal){
		
		return zooService.addNewAnimal(animal);
	}
	/*
	@DeleteMapping("/{animal_id}")
	public String removeAnimal(@PathVariable("animal_id") String animal_id){
		
		return zooService.removeAnimal(animal_id);
	}
	@PutMapping("/{animal_id}")
	public ResponseEntity<Animal> updateAnimal(@PathVariable("animal_id") String animal_id, Animal animal	){
		
		return zooService.updateAnimal(animal_id,animal);
	}
*/
}
