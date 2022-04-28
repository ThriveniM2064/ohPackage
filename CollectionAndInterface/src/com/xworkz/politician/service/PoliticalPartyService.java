package com.xworkz.politician.service;

import java.util.List;

import com.xworkz.politician.dto.PoliticalPartyDTO;

public interface PoliticalPartyService {
	PoliticalPartyDTO deleteByName(String name);

	boolean validateandsave(PoliticalPartyDTO politicalpartydto);

	List<PoliticalPartyDTO> sortbyName();

	List<PoliticalPartyDTO> sortbyid();

	List<PoliticalPartyDTO> sortbynameandid();


}
