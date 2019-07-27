package com.spiders.app.controller;

import com.spiders.app.service.Service;

public class Controller {
	
	Service service = new Service();
	
	public void saveStudent(Object obj){
		System.out.println(this.getClass().getSimpleName() +  " student recieved in controller " +obj);
		
		System.out.println(this.getClass().getSimpleName()+" student passed to service "+obj );
		
		Object student = service.saveStudent(obj);
		
		System.out.println(this.getClass().getSimpleName()+" student recied from serice  " +student );
		
		
		
		
		
		
	}
	

}
