package com.spiders.app.dao;

public class Dao {
	
	
	public Object saveStudent(Object obj){
		
		
		System.out.println(this.getClass().getSimpleName()+" object recived by dao " + obj);
		
		
		System.out.println(this.getClass().getSimpleName() +" save adn return the object " +obj);
		
		
		return obj + "Khan";
	}
	
	

}
