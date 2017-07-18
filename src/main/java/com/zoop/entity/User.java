package com.zoop.entity;

import javax.persistence.Entity;

@Entity
public class User {

	private String id;
	
	private String name;
	
	public User(){
		super();
	}
	
	public User(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return id+","+name;
	}
	
}
