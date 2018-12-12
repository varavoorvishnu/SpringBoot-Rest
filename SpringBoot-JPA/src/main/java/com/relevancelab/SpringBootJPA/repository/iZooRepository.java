package com.relevancelab.SpringBootJPA.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relevancelab.SpringBootJPA.models.Animal;

public interface iZooRepository extends JpaRepository<Animal, Serializable> {

}
