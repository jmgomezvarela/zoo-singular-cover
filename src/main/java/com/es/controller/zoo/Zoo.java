package com.es.controller.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.es.singular.cover.zoo.animals.Animal;
import com.es.singular.cover.zoo.animals.Chiken;
import com.es.singular.cover.zoo.animals.Dog;
import com.es.singular.cover.zoo.animals.DogType;
import com.es.singular.cover.zoo.animals.Parrot;
import com.es.singular.cover.zoo.exceptions.ZooFactoryException;
import com.es.singular.cover.zoo.exceptions.ZooNoAnimalsException;
import com.es.singular.cover.zoo.factory.AnimalType;
import com.es.singular.cover.zoo.factory.ZooFactory;
import com.es.singular.cover.zoo.strategy.FriendShipStrategy;
import com.es.singular.cover.zoo.strategy.FriendShipStrategyContext;
import com.es.singular.cover.zoo.strategy.IFriendship;

public class Zoo {

	private List<Animal> animalList;

	public Zoo() {
		Dog dogRocky = (Dog) ZooFactory.createAnimal(AnimalType.DOG);
		dogRocky.setName("Rocky");
		dogRocky.setFavorityFood("meat");
		dogRocky.setDogType(DogType.HUNTER);

		Dog dogPeewee = (Dog) ZooFactory.createAnimal(AnimalType.DOG);
		dogPeewee.setName("Peewee");
		dogPeewee.setFavorityFood("bones");
		dogPeewee.setDogType(DogType.WORKING);

		Chiken chickenDana = (Chiken) ZooFactory.createAnimal(AnimalType.CHICKEN);
		chickenDana.setName("Dana");
		chickenDana.setFavorityFood("corn");
		chickenDana.setBroiler(true);
		chickenDana.setLengthOfWings(0.81);

		Chiken chickenMia = (Chiken) ZooFactory.createAnimal(AnimalType.CHICKEN);
		chickenMia.setName("Mia");
		chickenMia.setFavorityFood("corn");
		chickenMia.setBroiler(false);
		chickenMia.setLengthOfWings(0.75);
		
		Parrot parrotPeter = (Parrot) ZooFactory.createAnimal(AnimalType.PARROT);
		parrotPeter.setName("Peter");
		parrotPeter.setFavorityFood("worms");
		parrotPeter.setLengthOfWings(0.49);

		this.animalList = new ArrayList<>();
		animalList.add(dogRocky);
		animalList.add(dogPeewee);
		animalList.add(chickenDana);
		animalList.add(chickenMia);
		animalList.add(parrotPeter);
	}

	public Zoo(List<Animal> animalList) {
		this.animalList = animalList;
	}

	public void showAllAnimals() throws ZooNoAnimalsException {
		if (animalList.isEmpty()) {
			throw new ZooNoAnimalsException();
		}
		for (Animal animal : animalList) {
			System.out.println("_________________________");
			System.out.println(animal.getPropertiesAsString());

			if (animal.getFriendshipsList() == null || animal.getFriendshipsList().isEmpty()) {
				System.out.print("(No friends to show)");
			} else {
				showFriends(animal);
			}
			System.out.println();
		}
	}

	public void runOneZooDay() {
		IFriendship friendShipStrategy = new FriendShipStrategy();
		FriendShipStrategyContext friendStrategyContext = new FriendShipStrategyContext(friendShipStrategy);				
		for (Animal animal : animalList) {
			boolean isAddFriendContext = (animal.getFriendshipsList()) == null ? true : (FriendShipStrategy.isAddFriendshipContext(animal.getFriendshipsList().size(), animalList.size()));
			boolean isRemoveFriendContext = (!animal.getFriendshipsList().isEmpty());			
			friendStrategyContext.executeStrategy(isAddFriendContext, isRemoveFriendContext, animal, animalList);
		}
	}

	private void showFriends(Animal animal) {
		StringBuffer buff = new StringBuffer("Friends: ");		
		for (Animal friend : animal.getFriendshipsList()) {
			buff.append(friend.getName()).append("     ");		
		}
		System.out.println(buff.toString());
	}

	public List<Animal> getAnimals() {
		return animalList;
	}
}