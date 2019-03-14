package com.es.singular.cover.zoo.animals;

public final class Chiken extends Bird{
	
	private boolean isBroiler;	
	
	public Chiken() {		
	}

	public boolean isBroiler() {
		return isBroiler;
	}

	public void setBroiler(boolean isBroiler) {
		this.isBroiler = isBroiler;
	}
	
	public String getIsBoilerAsString() {
		return (this.isBroiler) ? "is boiler":"is not boiler";
	}
	
	@Override
	public String getPropertiesAsString() {
		StringBuilder sf = new StringBuilder(this.name);
		sf.append(" the ").append(this.getClass().getSimpleName()).append("\n").append("favorite food: ").append(this.getFavorityFood())
		.append(", length of wings: ").append(this.getLengthOfWings()).append(", ").append(this.getIsBoilerAsString());
		return sf.toString();
	}
}