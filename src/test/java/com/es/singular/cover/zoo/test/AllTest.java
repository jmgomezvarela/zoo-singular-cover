package com.es.singular.cover.zoo.test;
	
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class AllTest {
	@RunWith(Suite.class)
	@Suite.SuiteClasses({ AnimalTest.class, FindshipStrategyTest.class, ZooFactoryTest.class, ZooTest.class })
	public class AllTests {
	}
}
