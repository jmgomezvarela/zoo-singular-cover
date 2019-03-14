package com.es.singular.cover.zoo.use;

import java.util.Optional;
import java.util.Scanner;
import com.es.controller.zoo.Zoo;
import com.es.singular.cover.zoo.exceptions.ZooNoAnimalsException;

public class ZooOptions {

    private final Zoo zoo;
    
    public ZooOptions(Zoo zoo) {
        this.zoo = zoo;
    }

    public void showMenu() {
        Scanner keyPressed = new Scanner(System.in);
        boolean exit = false;
        do {
        		System.lineSeparator();
        	    System.out.println("____________________________________________________");
            System.out.println("Please, press key (1) to List all the animal at Zoo");
            System.out.println("                  (2) simulate one day at the Zoo");
            System.out.println("                  (3) Exit");
            System.out.println("____________________________________________________");
            System.lineSeparator();
            System.out.print("Your Option is: ");
            
            switch (keyPressed.next()) {
                case "1":
				try {
					zoo.showAllAnimals();
				} catch (ZooNoAnimalsException e) {					
					e.getMessageDetailError();
				}
                    break;
                case "2":
                		if(Optional.of(zoo.getAnimals()).isPresent()) {
                			zoo.runOneZooDay();
                		}else{
                			System.out.println("There is not animals in Zoo");
                		}
                		break;
                case "3":
                		exit = true;
                		System.out.println("Exit done, Thanks for visiting the Zoo!");
                		keyPressed.close();
                		break;
                default:
                		System.out.println("No more options");
                		break;
            		}
        		} while (!exit);
    		}

	
}