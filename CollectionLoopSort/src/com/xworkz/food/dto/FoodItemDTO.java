package com.xworkz.food.dto;

import java.io.Serializable;

public class FoodItemDTO implements Serializable {
	    private int id;
		private String name;
		private double price;
		private FoodType foodType;
		private String quanity;
		private String hotelName;
		
		
		public FoodItemDTO(int id, String name, double price, FoodType foodType, String quanity, String hotelName) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.foodType = foodType;
			this.quanity = quanity;
			this.hotelName = hotelName;
		}


		@Override
		public String toString() {
			return "FoodDTO [id=" + id + ", name=" + name + ", price=" + price + ", foodType=" + foodType + ", quanity="
					+ quanity + ", hotelName=" + hotelName + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
			result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((quanity == null) ? 0 : quanity.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof FoodItemDTO))
				return false;
			FoodItemDTO other = (FoodItemDTO) obj;
			if (foodType != other.foodType)
				return false;
			if (hotelName != other.hotelName)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (quanity != other.quanity)
				return false;
			return true;
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


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public FoodType getFoodType() {
			return foodType;
		}


		public void setFoodType(FoodType foodType) {
			this.foodType = foodType;
		}


		public String getQuanity() {
			return quanity;
		}


		public void setQuanity(String quanity) {
			this.quanity = quanity;
		}


		public String getHotelName() {
			return hotelName;
		}


		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		
		
		
		
		
		

	}
	

