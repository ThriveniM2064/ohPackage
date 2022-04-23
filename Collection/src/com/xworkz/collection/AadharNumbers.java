package com.xworkz.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AadharNumbers {
	public static void main(String[] args) {
		Collection< Long> collection = new ArrayList<Long>();
		collection.add( 269676616249l);
		collection.add(265648576516l);
		collection.add(213564864654l);
		collection.add(767626263514l);
		collection.add(812465867947l);
		collection.add(232356567474l);
		collection.add(565685856565l);
		collection.add(457575465645l);
		collection.add(747475775576l);
	    collection.add(959596969898l);
		int size = collection.size();
		System.out.println(size);

		boolean contains = collection.contains(collection);
		System.out.println(contains);

		Iterator<Long> iterator = collection.iterator();
		while (iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
	}

		}

		
		
	