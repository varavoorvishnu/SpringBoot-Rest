package com.rl.restexample.models;


public class Animal {

	String animalName;
	String animalType;
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.animalName.length();
	}
	
	@Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal user = (Animal) o;

        return user.animalName.equals(animalName) &&
                user.animalType.equals(animalType);
    }
}
