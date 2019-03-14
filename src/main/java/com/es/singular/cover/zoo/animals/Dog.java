package com.es.singular.cover.zoo.animals;

public final class Dog extends Animal{
	
	private DogType dogType;
	
	public Dog(){	
	} 
	
	public DogType getDogType() {
		return dogType;
	}

	public void setDogType(DogType dogType) {
		this.dogType = dogType;
	}

	@Override
	public String getPropertiesAsString() {
		StringBuilder sf = new StringBuilder(this.name);
		sf.append(" the ").append(this.getClass().getSimpleName()).append("\n").append("favorite food: ").append(this.getFavorityFood())
		.append(", dog type: ").append(this.dogType.toString().toLowerCase());
		return sf.toString();
	}
}