package com.es.singular.cover.zoo.use;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.es.controller.zoo.Zoo;

public class ZooUseMain {
	
	 private static Logger LOGGER = LoggerFactory.getLogger(ZooUseMain.class);

	public static void main(String[] args) {
		LOGGER.info("starting Zoo Main Menu");
	
		Zoo zoo = new Zoo();
		ZooOptions zooOptions = new ZooOptions(zoo);
		zooOptions.showMenu();
	}
}