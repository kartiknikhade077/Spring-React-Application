package com.smart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String city;
	private int age;
	public int getId() {
		return Id;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int id, String name, String city, int age) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}



	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
