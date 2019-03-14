package com.es.singular.cover.zoo.exceptions;

public class ZooFactoryException extends Exception{
  	private static final long serialVersionUID = 1L;

	public ZooFactoryException(){};
    
    public String getMessageDetailError(){
        return "Animal type must be sended to ZooFactory, null value was detected";
    }
}