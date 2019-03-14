package com.es.singular.cover.zoo.strategy;

import java.util.List;
import com.es.singular.cover.zoo.animals.Animal;

public interface IFriendship {
	public void executeStablishFriendShipStrategy(Animal animal, Animal animalNewFriend);
	public void executeLoseFriendshipStrategy(Animal animal);
	public void executeStrategy(boolean addFriend, boolean removeFriend, Animal animal, List<Animal> animals);
}