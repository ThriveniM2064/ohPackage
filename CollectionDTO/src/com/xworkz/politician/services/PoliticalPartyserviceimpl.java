package com.xworkz.politician.services;

import com.xworkz.politicianparty.dao.PaliticalPartyDAO;
import com.xworkz.politicianparty.dao.PoliticalPartyDAOimplem;
import com.xworkz.politicianparty.dto.PoliticalPartyDTO;

public class PoliticalPartyserviceimpl implements PoliticalPartyService{
	private PaliticalPartyDAO dao;

	public PoliticalPartyserviceimpl(PaliticalPartyDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	   public  boolean validateandsave(PoliticalPartyDTO dto)
	    {
	    	if(dto!=null)
	    	{
	    		if(dto.getId()>=0 &&(dto.getName().length()>3 && dto.getName().length()<50 )&& 
	    				dto.getNoOfMps()>=0 && (dto.getNationalParty().length()>3 &&
	    						dto.getNationalParty().length()<50) )
	    		{
	    			dao.save(dto);
	    			return true;
	    		}
	    	}
			return false;
	    }

	@Override
	public void deleteByName(String name) {

		if(name!=null)
		{
			dao.deleteByName(name);
		}
	}
	}
