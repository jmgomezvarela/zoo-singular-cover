package com.es.singular.cover.zoo.factory;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.es.singular.cover.zoo.animals.Animal;
import com.es.singular.cover.zoo.animals.Chiken;
import com.es.singular.cover.zoo.animals.Dog;
import com.es.singular.cover.zoo.animals.Parrot;
import com.es.singular.cover.zoo.exceptions.ZooFactoryException;

public final class ZooFactory {
	private static Logger LOGGER = LoggerFactory.getLogger(ZooFactory.class);
	
	public static Animal createAnimal(AnimalType animalType) {
		Animal animal = null;
		if (AnimalType.DOG.equals(animalType)) {
			Dog dog = new Dog();
			dog.setFriendshipsList(new ArrayList<Animal>());
			return dog;
        }
        if (AnimalType.CHICKEN.equals(animalType)) {
        		Chiken chiken = new Chiken();
			chiken.setFriendshipsList(new ArrayList<Animal>());
        		return chiken;
        }
        if (AnimalType.PARROT.equals(animalType)) {
        		Parrot parrot = new Parrot();
			parrot.setFriendshipsList(new ArrayList<Animal>());
        		return parrot;
        } 
        if(animalType == null){
			 try {
					throw new ZooFactoryException();
				} catch (ZooFactoryException e) {
					LOGGER.error(e.getMessageDetailError());	
				}
		}
        return animal;
	}
}