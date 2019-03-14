package com.es.singular.cover.zoo.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.es.controller.zoo.Zoo;
import com.es.singular.cover.zoo.animals.Chiken;
import com.es.singular.cover.zoo.animals.Dog;
import com.es.singular.cover.zoo.animals.DogType;
import com.es.singular.cover.zoo.animals.Parrot;
import com.es.singular.cover.zoo.exceptions.ZooNoAnimalsException;
import com.es.singular.cover.zoo.factory.AnimalType;
import com.es.singular.cover.zoo.factory.ZooFactory;

public class ZooTest {
	private Dog dog = null;
	private Chiken chiken = null;
	private Parrot parrot = null;
	private Zoo zoo = new Zoo();
	
    @Before
    public void initial() {
    		
    		dog = (Dog) ZooFactory.createAnimal(AnimalType.DOG);
    		chiken = (Chiken) ZooFactory.createAnimal(AnimalType.CHICKEN);
    		parrot = (Parrot) ZooFactory.createAnimal(AnimalType.PARROT);
    	
    		dog.setName("Rocky");
    		dog.setFavorityFood("meat");
    		dog.setDogType(DogType.HUNTER);

   
    		chiken.setName("Dana");
    		chiken.setFavorityFood("corn");
    		chiken.setBroiler(true);
    		chiken.setLengthOfWings(0.81);
    		
    		parrot = (Parrot) ZooFactory.createAnimal(AnimalType.PARROT);
    		parrot.setName("Peter");
    		parrot.setFavorityFood("worms");
    		parrot.setLengthOfWings(0.49);
    }
 
    @Test()
    public void testNoAnimalTypeCreateAnimal() {
    		assertEquals(parrot = (Parrot) ZooFactory.createAnimal(null),null);
    }
    
    //ShowAllAnimals test case 1: No animals in the Zoo.
    @Test(expected = ZooNoAnimalsException.class)
    public void testTolalCalculationForBikesWithoutDiscountSameClient() throws ZooNoAnimalsException { 
    		preconditionsZooNoAnimals();
    		zoo.showAllAnimals();
    }  
    
    //...
    
    public void preconditionsZooNoAnimals() {
    		zoo.getAnimals().clear();
    }
}