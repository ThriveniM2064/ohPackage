package com.xworkz.politician.runner;

import com.xworkz.politician.service.PoliticalPartyService;
import com.xworkz.politician.service.PoliticalPartyServiceImpl;
import com.xworkz.politician.dao.PoliticalPartyDAO;
import com.xworkz.politician.dao.PoliticalPartyDAOimpl;
import com.xworkz.politician.dto.PoliticalPartyDTO;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PoliticalPartyDAOimpl politicalpartydaos=new PoliticalPartyDAOimpl();
	      PoliticalPartyService policalserviceimpl=new PoliticalPartyServiceImpl(politicalpartydaos);
	      PoliticalPartyDTO politicalpartydto1=new PoliticalPartyDTO(10,"yadiyurappa","narendramodi","BJP",12);
	      PoliticalPartyDTO politicalpartydto2=new PoliticalPartyDTO(104,"reddy","narendramodi","JDS",22);
	      PoliticalPartyDTO politicalpartydto3=new PoliticalPartyDTO(3,"shankarmurthy","narendramodi","Congress",32);
	    PoliticalPartyDTO politicalpartydto4=new PoliticalPartyDTO(106,"rajesh","narendramodi","BJP",10);
		policalserviceimpl.validateandsave(politicalpartydto4);
		policalserviceimpl.validateandsave(politicalpartydto1);
		policalserviceimpl.validateandsave(politicalpartydto3);
		politicalpartydaos.deteleByName("reddy");
	}

}
