package com.es.singular.cover.zoo.strategy;

import java.util.List;
import com.es.singular.cover.zoo.animals.Animal;

public class FriendShipStrategyContext {
	private IFriendship friendshipStrategy;
	
	public FriendShipStrategyContext(IFriendship friendShipStrategy) {
		friendshipStrategy = friendShipStrategy;
	}

	public void setFriendshipStrategy(IFriendship friendshipStrategy) {
		this.friendshipStrategy = friendshipStrategy;
	}
	
	public void executeStrategy(boolean isAddFriend, boolean isRemoveFriend, Animal animal, List<Animal> animals){
		this.friendshipStrategy.executeStrategy(isAddFriend, isRemoveFriend, animal, animals);
	}
}