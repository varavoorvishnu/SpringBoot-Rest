package com.relevancelab.SpringBootJPA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Animals")
public  class Animal {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	int animal_id;
	
	@Column
	String animal_name;
	
	@Column
	String animal_type;
	
	

	public int getAnimal_id() {
		return animal_id;
	}

	public void setAnimal_id(int animal_id) {
		this.animal_id = animal_id;
	}

	public String getAnimal_name() {
		return animal_name;
	}

	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}

	public String getAnimal_type() {
		return animal_type;
	}

	public void setAnimal_type(String animal_type) {
		this.animal_type = animal_type;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.animal_name.length();
	}
	
	@Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal user = (Animal) o;

        return user.animal_name.equals(animal_name) &&
                user.animal_type.equals(animal_type);
    }
}
