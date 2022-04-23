package com.xworkz.collection.dto;

public class WashingMachineDTO {
	private int id;
	private String brand;
	private int capacity;
	private String color;
	private double price;
	private String modelNo;
	private Type Type;
	public WashingMachineDTO()
	{
		System.out.println("this is default constructor");
	} 
	public WashingMachineDTO(int id, String brand, int capacity, String color, double price, String modelNo,Type type) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.color = color;
		this.price = price;
		this.modelNo = modelNo;
		Type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	

}
