package com.xworkz.politicianparty.dao;

import com.xworkz.politicianparty.dto.PoliticalPartyDTO;
public interface PaliticalPartyDAO {
	boolean save(PoliticalPartyDTO politicalpartydto);

	PoliticalPartyDTO deleteByName(String name);
}
