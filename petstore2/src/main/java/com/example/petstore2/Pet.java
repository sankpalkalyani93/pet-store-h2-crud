package com.example.petstore2;

import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
	
	@Id // -> indicate primary keys -> they begin with 1
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "breed")
	private String breed;
	
	@Column(name = "cost")
	private int cost;
	
	public Pet() {}
	public Pet(int id, String name, String breed, int cost) {
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "pet info : [" + getId() + ", " + getName() + ", " + getBreed() + ", " + getCost() + "]";
	}
}
