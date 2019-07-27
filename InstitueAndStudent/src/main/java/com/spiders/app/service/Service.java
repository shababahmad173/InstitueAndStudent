package com.spiders.app.service;

import com.spiders.app.dao.Dao;

public class Service {

	Dao dao = new Dao();

	public Object saveStudent(Object obj) {

		System.out.println(this.getClass().getSimpleName() + " student recived by service " + obj);

		System.out.println(this.getClass().getSimpleName() + " object passed to dao " + obj);
		Object student = dao.saveStudent(obj);

		
		System.out.println(this.getClass().getSimpleName() + " recieved back from dao " + student);
		System.out.println(this.getClass().getSimpleName() + " returning studen to conttroller " + student);
		
		return student;
	}

}
