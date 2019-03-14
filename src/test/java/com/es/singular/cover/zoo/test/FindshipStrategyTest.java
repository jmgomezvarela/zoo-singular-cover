package com.es.singular.cover.zoo.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.es.singular.cover.zoo.strategy.FriendShipStrategy;
import com.es.singular.cover.zoo.strategy.FriendShipStrategyContext;
import com.es.singular.cover.zoo.strategy.IFriendship;

public class FindshipStrategyTest {
	
    private IFriendship friendshipStrategy = null; 
	private FriendShipStrategyContext friendShipStrategyContext = null;
    
    @Before
    public void initial() {
    		friendshipStrategy = new FriendShipStrategy();
    		friendShipStrategyContext = new FriendShipStrategyContext(friendshipStrategy);
    }
    
    @Test
    public void testIsAddFriendContextCaseTrue() {
        assertEquals(FriendShipStrategy.isAddFriendshipContext(1,3), true);
    }  
    
    @Test
    public void testIsAddFriendContextCaseFalse() {
        assertEquals(FriendShipStrategy.isAddFriendshipContext(3,4), false);
    }        
}