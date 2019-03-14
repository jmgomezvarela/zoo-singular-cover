package com.es.singular.cover.zoo.animals;

import java.util.ArrayList;
import java.util.List;
import com.es.singular.cover.zoo.animals.interfaces.IPrintable;
import com.es.singular.cover.zoo.utils.Util;

public abstract class Animal implements IPrintable{
	protected String name;
	protected String favorityFood;
	public List<Animal> friendshipsList;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavorityFood() {
		return favorityFood;
	}

	public void setFavorityFood(String favorityFood) {
		this.favorityFood = favorityFood;
	}

	public List<Animal> getFriendshipsList() {
		return friendshipsList;
	}

	public void setFriendshipsList(ArrayList<Animal> arrayList) {
		this.friendshipsList = arrayList;
	}

	public boolean establishFriendship(Animal newFriend) {
		if (equals(newFriend))
			return false;
		else {
			newFriend.friendshipsList.add(this);
			return this.friendshipsList.add(newFriend);
		}
	}

	public boolean loseFriendship(Animal oldFriend) {
		oldFriend.friendshipsList.remove(this);
		return this.friendshipsList.remove(oldFriend);
	}
	
	// Pick an animal randomly to make friendShip, one in zoo but is not a friend yet.
	public Animal doGetZooRandomAnimal(Animal animal, List<Animal> animals) {
		List<Animal> animalCopyList = new ArrayList<>();
		animalCopyList.addAll(animals);
		animalCopyList.removeIf(p -> p.equals(animal));
		animalCopyList.removeAll(animal.getFriendshipsList());
		return Util.getUtil().pickRandomAnimalFromList(animalCopyList);
	}

	// Pick an animal randomly to break friendShip, one in friends list.
	public Animal doGetRandomFrindToBreak(List<Animal> animalFriendList) {
		return Util.getUtil().pickRandomAnimalFromList(animalFriendList);
	}
}