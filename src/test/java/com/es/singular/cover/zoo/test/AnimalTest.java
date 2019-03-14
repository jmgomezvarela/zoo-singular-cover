package com.es.singular.cover.zoo.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import com.es.singular.cover.zoo.animals.Chiken;
import com.es.singular.cover.zoo.animals.Dog;
import com.es.singular.cover.zoo.animals.DogType;
import com.es.singular.cover.zoo.factory.AnimalType;
import com.es.singular.cover.zoo.factory.ZooFactory;

public class AnimalTest {
	private Dog dog = null;
	private Chiken chicken = null;
	
    @Before
    public void initial() {
    		
    		dog = (Dog) ZooFactory.createAnimal(AnimalType.DOG);
    	
    		dog.setName("Rocky");
    		dog.setFavorityFood("meat");
    		dog.setDogType(DogType.HUNTER);
    }
 
    @Test()
    public void testStablishFriendshipTrue() {
    		preconditionsPickFriend();
    		assertTrue(dog.establishFriendship(chicken));
    }
    
    @Test()
    public void testStablishFriendshipFalse() {
    		assertFalse(dog.establishFriendship(dog));
    }
    
    public void preconditionsPickFriend() {
    		this.chicken = (Chiken) ZooFactory.createAnimal(AnimalType.CHICKEN);
    		this.chicken.setName("Dana");
    		this.chicken.setFavorityFood("corn");
    		this.chicken.setBroiler(true);
    		this.chicken.setLengthOfWings(0.81);
    }
}