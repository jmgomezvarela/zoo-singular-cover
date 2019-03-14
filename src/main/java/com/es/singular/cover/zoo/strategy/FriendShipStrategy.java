package com.es.singular.cover.zoo.strategy;

import java.text.MessageFormat;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.es.singular.cover.zoo.animals.Animal;

public class FriendShipStrategy implements IFriendship {
	private static Logger LOGGER = LoggerFactory.getLogger(FriendShipStrategy.class);

	//Always add a friend, if the context is the correct, at least, the animal can not has more friends to add
	public static boolean isAddFriendshipContext(int friendsQuantity, int totalZooAnimals) {
		boolean isAddFriendContext = true;
		if(friendsQuantity == totalZooAnimals -1) {
			return false;
		}
		return isAddFriendContext;
	}
			
	@Override
	public void executeStablishFriendShipStrategy(Animal animal, Animal animalNewFriend) {    
	    animal.establishFriendship(animalNewFriend);    
		LOGGER.info(MessageFormat.format("{0} the {1} stablished a friend with {2}, the {3}.",animal.getName(), animal.getClass().getSimpleName(), animalNewFriend.getName(),animalNewFriend.getClass().getSimpleName()));
	}

	@Override
	public void executeLoseFriendshipStrategy(Animal animal) {		
		Animal animalToBreackFriendship = animal.doGetRandomFrindToBreak(animal.getFriendshipsList());
		animal.getFriendshipsList().remove(animalToBreackFriendship);
		animalToBreackFriendship.getFriendshipsList().remove(animal);
		LOGGER.info(MessageFormat.format("{0} the {1} breaked the friendship with {2}, the {3}.", animal.getName(), animal.getClass().getSimpleName(), animalToBreackFriendship.getName(),animalToBreackFriendship.getClass().getSimpleName()));
	}

	@Override
	public void executeStrategy(boolean isAddFriend, boolean isRemoveFriend, Animal animal, List<Animal> animals) {		
		if(isRemoveFriend){
			executeLoseFriendshipStrategy(animal);
		}
		if(isAddFriend) {			
			executeStablishFriendShipStrategy(animal, animal.doGetZooRandomAnimal(animal, animals));
		}
	}
}