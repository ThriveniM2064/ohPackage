package com.xworkz.politician.runner;

import com.xworkz.politician.services.PoliticalPartyService;
import com.xworkz.politicianparty.dao.PaliticalPartyDAO;
import com.xworkz.politicianparty.dao.PoliticalPartyDAOimplem;
import com.xworkz.politicianparty.dto.PoliticalPartyDTO;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PaliticalPartyDAO politicalpartydaos=new PoliticalPartyDAOimplem();
	      PoliticalPartyService policalservice=new PoliticalPartyService(politicalpartydaos);
	      PoliticalPartyDTO politicalpartydto1=new PoliticalPartyDTO(102,"yadiyurappa","narendramodi","BJP",12);
	      PoliticalPartyDTO politicalpartydto2=new PoliticalPartyDTO(104,"reddy","narendramodi","JDS",22);
	      PoliticalPartyDTO politicalpartydto3=new PoliticalPartyDTO(109,"shankarmurthy","narendramodi","Congress",32);
	    PoliticalPartyDTO politicalpartydto4=new PoliticalPartyDTO(106,"rajesh","narendramodi","BJP",10);
		PoliticalPartyService.(politicalpartydto4);
		PoliticalPartyService.validateAndsave(politicalpartydto1);
		PoliticalPartyService.validateAndsave(politicalpartydto3);
		politicalpartydaos.deteleByName("reddy");
	}

}
