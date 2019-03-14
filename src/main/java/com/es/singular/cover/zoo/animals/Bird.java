package com.es.singular.cover.zoo.animals;

public abstract class Bird extends Animal{
	private double LengthOfWings;
	
	public double getLengthOfWings() {
		return LengthOfWings;
	}

	public void setLengthOfWings(double lengthOfWings) {
		LengthOfWings = lengthOfWings;
	}
}