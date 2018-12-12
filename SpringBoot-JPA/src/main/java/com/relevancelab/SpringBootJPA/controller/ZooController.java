package com.relevancelab.SpringBootJPA.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.relevancelab.SpringBootJPA.models.Animal;
import com.relevancelab.SpringBootJPA.services.ZooService;

@RestController
@RequestMapping("/Animals")
public class ZooController {

	@Autowired
	ZooService zooService;

	@GetMapping
	public Collection<Animal> getAllAnimals(){
		
		return zooService.getAllAnimals();
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<Animal> addNewAnimal(@RequestBody Animal animal){
		
		return zooService.addNewAnimal(animal);
	
	}
	
	@DeleteMapping("/{animal_id}")
	public String removeAnimal(@PathVariable("animal_id") int animal_id){
		return zooService.removeAnimal(animal_id);
	}
	@PutMapping("/{animal_id}")
	public ResponseEntity<?> updateAnimal(@PathVariable("animal_id") int animal_id,@RequestBody Animal animal	){
		return zooService.updateAnimal(animal_id,animal);
	}

}
