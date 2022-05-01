package com.xworkz.food.runner;
import java.util.function.Supplier;
import java.util.List;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.stream.Collectors;
import com.xworkz.food.dto.FoodItemDTO;
import com.xworkz.food.dto.FoodType;
import com.xworkz.food.dto.FoodItemDTO;
public class FoodRunner {

	public static void main(String[] args) {
	 FoodItemDTO fdto=new FoodItemDTO(101, "chicken_kabab", 80, FoodType.NON_VEG, "full", "Ashoka hotel");
	 FoodItemDTO fdto1=new FoodItemDTO(102, "dosa", 60,FoodType.VEG ,"small", "usha hotel");
	 FoodItemDTO fdto2=new FoodItemDTO(103, "idli", 30,FoodType.VEG, "quarter","5star hotel");
	 FoodItemDTO fdto3=new FoodItemDTO(104, "chicken manchurian",250, FoodType.NON_VEG, "half", "Nandini hotel");
	 FoodItemDTO fdto4=new FoodItemDTO(105, "Chicken Biryani", 300,FoodType.NON_VEG,"half","manasa hotel");
	 FoodItemDTO fdto5=new FoodItemDTO(120, "Chicken popcorn", 350,FoodType.NON_VEG ,"full","empite hotel");
	 FoodItemDTO fdto6=new FoodItemDTO(123, "chicken FridRice",70, FoodType.NON_VEG, "half","udupi hotel");
	 FoodItemDTO fdto7=new FoodItemDTO(125, "chitranna", 20, FoodType.VEG,"quarter","hotel union");
	 FoodItemDTO fdto8=new FoodItemDTO(127, "mutton masala", 100, FoodType.NON_VEG,"half", "sambruddi hotel");
	 FoodItemDTO fdto9=new FoodItemDTO(109, "rice bath", 60, FoodType.VEG,"full", "guruji hotel");
				List<FoodItemDTO> list=new LinkedList<FoodItemDTO>();
				list.add(fdto);
				list.add(fdto1);
				list.add(fdto2);
				list.add(fdto3);
				list.add(fdto4);
				list.add(fdto5);
				list.add(fdto6);
				list.add(fdto7);
				list.add(fdto8);
				list.add(fdto9);
				
			
				
				System.out.println(" Loop all items and display ");
				list.stream().collect((Collectors.toList()))	 
				.forEach(display->System.out.println(display));
				System.out.println("=========================================");
				
				
				
				
				System.out.println(" Loop and filter items by non veg type and display");
				list.stream().filter(nonveg->nonveg.getFoodType()==FoodType.NON_VEG).collect(Collectors.toList())
				.forEach(type->System.out.println(type));
				System.out.println("===================================");	
				
				
					
				System.out.println("Loop and filter where price is greater than 50 and display ");
				list.stream().filter(price->price.getPrice()>50).collect(Collectors.toList())
				.forEach(amount->System.out.println(amount));
				System.out.println("============================================");
				
					
				
					
				System.out.println(" Loop and filter where price is greater than 50 and get only hotel names");	
				list.stream().filter(price->price.getPrice()>50).map(hotelName->hotelName.getHotelName()).collect(Collectors.toList())
				.forEach(hName->System.out.println(hName));
				System.out.println("===========================================");
				
				
					
				System.out.println("Loop and filter where price is greater than 50 and get only hotel names sorted");	
				list.stream().filter(price->price.getPrice()>50).map(hotelName->hotelName.getHotelName()).sorted().collect(Collectors.toList())
				.forEach(hName->System.out.println(hName));	
				System.out.println("===========================================");
					
				
				
				System.out.println(" Loop and get name sorted");	
				list.stream().map(name->name.getName()).sorted().collect(Collectors.toList())
				.forEach(name->System.out.println(name));
				System.out.println("===========================================");
				
				
				
				
				System.out.println("Loop and get only ids sorted in desc");	
				list.stream().map(id->id.getId()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(rid->System.out.println(rid));
				System.out.println("===========================================");
				
				
				System.out.println(" Loop and get name where hotel name ");	
				list.stream().map((hotelName)->hotelName.getHotelName()).collect(Collectors.toList())
				.forEach(hName ->System.out.println(hName));
				System.out.println("===========================================");
				
				
				
				System.out.println(" Loop and filter items by  veg type and sort desc");	
				list.stream().filter(veg->veg.getFoodType()==FoodType.VEG).map(fveg->fveg.getFoodType()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(veg->System.out.println(veg));
				System.out.println("===========================================");
				
				
				System.out.println("Loop and sort ");	
				list.stream().map(price->price.getPrice()).sorted().collect(Collectors.toList())
				.forEach(rs->System.out.println(rs));
				System.out.println("===========================================");
				
				
				System.out.println("Loop and sort desc");	
				list.stream().map(dprice->dprice.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(drs->System.out.println(drs));
				System.out.println("===========================================");
				
				
				
				System.out.println("Loop and get only name in upper case");	
				list.stream().map(name->name.getName().toUpperCase()).collect(Collectors.toList())
				.forEach(uName->System.out.println(uName));
				System.out.println("===========================================");
					
					
					
				System.out.println("Loop and get only hotel name in upper case");	
				list.stream().map(name->name.getHotelName()).collect(Collectors.toList())
				.forEach(uName->System.out.println(uName));
					
	}

}
