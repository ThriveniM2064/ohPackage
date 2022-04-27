package com.xworkz.politician.service;

import com.xworkz.politician.dto.PoliticalPartyDTO;

public interface PoliticalPartyService {
	PoliticalPartyDTO deleteByName(String name);

	boolean validateandsave(PoliticalPartyDTO politicalpartydto);


}
