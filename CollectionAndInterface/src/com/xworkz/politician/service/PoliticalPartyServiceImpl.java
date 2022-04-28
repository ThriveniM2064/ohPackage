package com.xworkz.politician.service;
import com.xworkz.politician.dao.PoliticalPartyDAOimpl;
import com.xworkz.politician.dto.PoliticalPartyDTO;
import java.util.Comparator;
import java.util.List;

import com.xworkz.politician.sort.SortById;
import com.xworkz.politician.sort.SortByName;
import com.xworkz.politician.sort.SortByNameAndId;
public class PoliticalPartyServiceImpl implements PoliticalPartyService{
      PoliticalPartyDAOimpl politicalPartyDAO;
      
	public PoliticalPartyServiceImpl(PoliticalPartyDAOimpl politicalPartyDAO) {
		if(politicalPartyDAO!=null)
		{
		System.out.println("generator  ".concat(this.getClass().getSimpleName()));
		this.politicalPartyDAO = politicalPartyDAO;
	}
	}
	

	@Override
	public  boolean validateandsave(PoliticalPartyDTO politicalpartydto) {
		if(politicalpartydto!=null)
    	{
    		if(politicalpartydto.getId()>=0 &&(politicalpartydto.getName().length()>3 && politicalpartydto.getName().length()<50 )&& 
    				politicalpartydto.getNoOfMps()>=0 && (politicalpartydto.getNationalParty().length()>3 &&
    						politicalpartydto.getNationalParty().length()<50) )
    		{
    			politicalPartyDAO.save(politicalpartydto);
    			return true;
    		}
    	}
		return false;
    }
		
	@Override
	public PoliticalPartyDTO deleteByName(String name) {
		if(name!=null)
		{
			PoliticalPartyDTO dto=politicalPartyDAO.deteleByName(name);
			System.out.println("deleted name is"+name);
			return dto;
		}
		return null;
	}
	
	

	@Override
	public List<PoliticalPartyDTO> sortbyid() {
		Comparator<PoliticalPartyDTO> sortid=new SortById();
		return politicalPartyDAO.sort(sortid);
	}
	


	@Override
	public List<PoliticalPartyDTO> sortbyName() {
		Comparator<PoliticalPartyDTO> sortname=new SortByName();
		return politicalPartyDAO.sort(sortname);
	}


	@Override
	public List<PoliticalPartyDTO> sortbynameandid() {
		Comparator<PoliticalPartyDTO> sortnameandid=new SortByNameAndId();
		return politicalPartyDAO.sort(sortnameandid);
}
}
