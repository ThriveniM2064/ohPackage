package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IPLTeam {
public static void main(String[] args)
		{
			Map<String,String> CEONameMap=new HashMap<>();
			CEONameMap.put("Rohith sharma","MI");
			CEONameMap.put("Virat Kohli","RCB");
			CEONameMap.put("Gutham gambir","DC");
			CEONameMap.put("David Warner","SHR");
			CEONameMap.put("Dinesh Karthik","KKR");
			CEONameMap.put("AShwin","KXB");
			CEONameMap.put("Rathan tata","TCS");
			CEONameMap.put("Dhoni","CSK");
			CEONameMap.put("Sanju Samson","DD");
			CEONameMap.put("Mitchell","RPS");
			CEONameMap.put("Abhishek","RR");
			CEONameMap.put("Shreyas","HYD");
			CEONameMap.put("Donald","Bob mcDonald");
			CEONameMap.put("Hardik Pandya","GT");
			CEONameMap.put("Rahul","KL");
			CEONameMap.put("Jadeja","CSK");
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






