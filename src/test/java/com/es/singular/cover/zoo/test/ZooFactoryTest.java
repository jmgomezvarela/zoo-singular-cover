package com.es.singular.cover.zoo.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import com.es.singular.cover.zoo.animals.Animal;
import com.es.singular.cover.zoo.animals.Chiken;
import com.es.singular.cover.zoo.animals.Dog;
import com.es.singular.cover.zoo.animals.Parrot;
import com.es.singular.cover.zoo.factory.AnimalType;
import com.es.singular.cover.zoo.factory.ZooFactory;

public class ZooFactoryTest {

    private Animal animal;

    @Before
    public void initial() {
        animal = null;
    }
    
    @Test
    public void testDogCreation() {
    	animal = ZooFactory.createAnimal(AnimalType.DOG);
        assertTrue(animal instanceof Dog);
    }

    @Test
    public void testChikenCreation() {
    	animal = ZooFactory.createAnimal(AnimalType.CHICKEN);
        assertTrue(animal instanceof Chiken);
    }

    @Test
    public void testParrotCreation() {
    	animal = ZooFactory.createAnimal(AnimalType.PARROT);
        assertTrue(animal instanceof Parrot);
    }

    @Test
    public void testZooFactoryWithNullParameter() {    	    	    	    
        animal = ZooFactory.createAnimal(null);
        assertNull(animal);
    }
}