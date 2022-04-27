package com.xworkz.politicianparty.dao;
import java.util.LinkedList;

import com.xworkz.politicianparty.dto.PoliticalPartyDTO;
public interface PaliticalPartyDAO {
	boolean save(PoliticalPartyDTO politicalpartydto);
	void deteleByName(String name);
	LinkedList<String> list=new LinkedList<String>();
	void deleteByName(String name);
}
