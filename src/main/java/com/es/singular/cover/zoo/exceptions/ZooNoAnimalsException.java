package com.es.singular.cover.zoo.exceptions;

public class ZooNoAnimalsException extends Exception{
  	private static final long serialVersionUID = 1L;

	public ZooNoAnimalsException(){};
    
    public String getMessageDetailError(){
        return "The Zoo has not animals";
    }
}