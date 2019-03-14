package com.es.singular.cover.zoo.animals;

public final class Parrot extends Bird{
	
	private boolean isSpeaker;	
	
	public Parrot() {		
	}
	
	public Parrot(String name, double LengthOfWings, String  favoriteFood, boolean isSpeaker) {
		this.name = name;
		this.setLengthOfWings(LengthOfWings);
		this.favorityFood = favoriteFood;
		this.setSpeaker(isSpeaker);
	}

	public boolean isSpeaker() {
		return isSpeaker;
	}

	public void setSpeaker(boolean isSpeaker) {
		this.isSpeaker = isSpeaker;
	}
	
	public String getIsSpeakerAsString() {
		return (this.isSpeaker) ? "is speaker":"is not speaker";
	}
	
	@Override
	public String getPropertiesAsString() {
		StringBuilder sf = new StringBuilder(this.name);
		sf.append(" the ").append(this.getClass().getSimpleName()).append("\n").append("favorite food: ").append(this.getFavorityFood())
		.append(", length of wings: ").append(this.getLengthOfWings()).append(", ").append((this.getIsSpeakerAsString()));
		return sf.toString();
	}
}