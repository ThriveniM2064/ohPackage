package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CEO{
	public static void main(String[] args)
	{
		Map<String,String> CEONameMap=new HashMap<>();
		CEONameMap.put("Tim Cook","apple");
		CEONameMap.put("Joe Tocchi","EMC");
		CEONameMap.put("Larry Page","Google");
		CEONameMap.put("richard","U S bank");
		CEONameMap.put("VMvare","Poul Marits");
		CEONameMap.put("Loyde","goldmansnach");
		CEONameMap.put("Rathan tata","TCS");
		CEONameMap.put("LarryIreson","Oracle");
		CEONameMap.put("polar","USarmy");
		CEONameMap.put("bere","jai ram");
		CEONameMap.put("serbia","sushank");
		CEONameMap.put("amazon","Frank Blank");
		CEONameMap.put("Donald","Bob mcDonald");
		CEONameMap.put("srihang","Robert");
		CEONameMap.put("sprint","Dan Hasse");
		CEONameMap.put("Accenture","Pierre nanterme");
		Set<String> keys=CEONameMap.keySet();
		keys.forEach(r->System.out.println(r));
		Collection<String> values=CEONameMap.values();
	    values.forEach(e->System.out.println(e));

		Set<Entry<String,String>> entryset1=CEONameMap.entrySet();
		for (Entry<String, String> entry : entryset1) {
			
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println("key:"+key+" "+"value:"+value);
		}
	}
	}



