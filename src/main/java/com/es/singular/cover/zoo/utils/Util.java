package com.es.singular.cover.zoo.utils;

import java.util.List;
import java.util.Random;
import com.es.singular.cover.zoo.animals.Animal;

public class Util {
	private Random randomGenerator;
	static Util util;

	private Util() {
	}

	public synchronized static Util getUtil() {
		if (util == null) {
			util = new Util();
		}
		return util;
	}
	
	public Animal pickRandomAnimalFromList(List<Animal> animalList) {
		randomGenerator = new Random();
		int index = randomGenerator.nextInt(animalList.size());
		return animalList.get(index);	
	}
}