package com.xworkz.politician.dao;

import java.util.LinkedList;

import com.xworkz.politician.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	boolean save(PoliticalPartyDTO politicalpartydto);
	PoliticalPartyDTO deteleByName(String name);
	LinkedList<String> list=new LinkedList<String>();
	
}
