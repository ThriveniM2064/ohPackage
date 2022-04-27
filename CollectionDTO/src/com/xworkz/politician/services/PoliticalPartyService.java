package com.xworkz.politician.services;

import com.xworkz.politicianparty.dto.PoliticalPartyDTO;

public interface PoliticalPartyService {

	void deleteByName(String name);

	void validateandsave(PoliticalPartyDTO dto);

}
