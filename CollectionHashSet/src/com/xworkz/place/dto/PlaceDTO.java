package com.xworkz.place.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable{
	private int id;
	private String name;
	private String city;
	private String state;
	private String country;
	public PlaceDTO() {
		System.out.println("default constructor");
	}
	public PlaceDTO(int id, String name, String city, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hash code");
		System.out.println("Place name" +name);
		int superHashCode=20;
		System.out.println(superHashCode);
		return superHashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method");
		if (this == obj)
			return true;
		if (!(obj instanceof PlaceDTO))
			return false;
		PlaceDTO other = (PlaceDTO) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PlaceDTO [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
