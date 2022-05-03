package com.xworkz.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {
public static void main(String[] args)
{
	Map<String,Integer> CountryNameMap=new HashMap<>();
	CountryNameMap.put("India",15216);
	CountryNameMap.put("pakisthan",15217);
	CountryNameMap.put("Indonesia",15218);
	CountryNameMap.put("japan",15219);
	CountryNameMap.put("malasia",15244);
	CountryNameMap.put("mexico",15296);
	CountryNameMap.put("italy",15215);
	CountryNameMap.put("moldova",15212);
	CountryNameMap.put("poland",15277);
	CountryNameMap.put("spain",15254);
	CountryNameMap.put("serbia",15212);
	CountryNameMap.put("america",15276);
	CountryNameMap.put("new yark",15436);
	CountryNameMap.put("sri lanka",15206);
	CountryNameMap.put("south korea",15916);
	CountryNameMap.put("norway",15233);
	Set<String> keys=CountryNameMap.keySet();
	keys.forEach(r->System.out.println(r));
	Collection<Integer> values=CountryNameMap.values();
    values.forEach(e->System.out.println(e));

	Set<Entry<String,Integer>> entryset1=CountryNameMap.entrySet();
	for (Entry<String, Integer> entry : entryset1) {
		
		String key=entry.getKey();
		Integer value=entry.getValue();
		System.out.println("key:"+key+" "+"value:"+value);
	}
}
}
