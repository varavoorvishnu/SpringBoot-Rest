package com.relevancelab.SpringBootJPA.repository;

import org.springframework.data.repository.CrudRepository;

import com.relevancelab.SpringBootJPA.models.Animal;

public interface iZooRepository extends CrudRepository<Animal, String> {

}
