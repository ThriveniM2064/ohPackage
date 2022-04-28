package com.xworkz.politician.services;

import java.util.List;

import com.xworkz.politicianparty.dto.PoliticalPartyDTO;

public interface PoliticalPartyService {

	void deleteByName(String name);

	boolean validateandsave(PoliticalPartyDTO dto);
	List<PoliticalPartyDTO> sortByname();
	List<PoliticalPartyDTO> sortByid();
	List<PoliticalPartyDTO> sortBynameandid();
	

}
