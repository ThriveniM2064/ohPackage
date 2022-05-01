package com.xworkz.place.dto;

import java.util.LinkedHashSet;
import java.util.Set;

public class PlaceRunner {
	public static void main(String[] args) { 
		
        PlaceDTO placedto=new PlaceDTO(11, "Aramane","Mysore" ,"Karnataka", "India");
        PlaceDTO placedto1=new PlaceDTO(12, "Eka shilabetta","tumkur" ,"Karnataka", "India");
        PlaceDTO placedto2=new PlaceDTO(13, "Tajmahal","Agra" ,"Dheli", "India");
        PlaceDTO placedto3=new PlaceDTO(14, "Siddaganga betta","Tumkur" ,"Karnataka", "India");
        PlaceDTO placedto4=new PlaceDTO(15, "Adi chunchanagiri","Mandya" ,"Karnataka", "India");
        PlaceDTO placedto5=new PlaceDTO(16, "waterfalls","Shivamoga" ,"Karnataka", "India");
        PlaceDTO placedto6=new PlaceDTO(17, "Malpe beach","Mangalore" ,"Karnataka", "India");
        PlaceDTO placedto7=new PlaceDTO(18, "Mullayanagiri","Mangalore" ,"Karnataka", "India");
        PlaceDTO placedto8=new PlaceDTO(19, "kote","chitradurga" ,"Karnataka", "India");
        PlaceDTO placedto9=new PlaceDTO(10, "Nandi hills","Doddaballapura" ,"Karnataka", "India");
        
        
        Set<PlaceDTO> place=new LinkedHashSet<>();
        place.add(placedto);
        place.add(placedto1);
        place.add(placedto2);
        place.add(placedto3);
        place.add(placedto4);
        place.add(placedto5);
        place.add(placedto6);
        place.add(placedto7);
        place.add(placedto8);
        place.add(placedto9);
        System.out.println("Total places----"+placedto);
	}

}
