package com.xworkz.politician.service;
import com.xworkz.politician.dao.PoliticalPartyDAOimpl;
import com.xworkz.politician.dto.PoliticalPartyDTO;

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
		if(politicalpartydto.getId()<=0)
		{
			System.out.println("id is not correct");
			return false;
		}
		if(politicalpartydto.getName()==null&&politicalpartydto.getName().length()<3
			&& politicalpartydto.getName().length()>50
			&& !politicalpartydto.getName().matches("[a-zA-Z]*"))
		{
			System.out.println("name is not correct");
			return false;
		}
		if(politicalpartydto.getPresidentName()==null&&politicalpartydto.getPresidentName().length()<5
				&& politicalpartydto.getPresidentName().length()>50
				&& politicalpartydto.getPresidentName().matches("[a-zA-Z]*"))
		{
			System.out.println("president name is not correct");
			return false;
		}
		if(politicalpartydto.getNoOfMps()<=0)
		{
			System.out.println("number of mps is null");
			return false;
		}
		else
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
			return dto;
		}
		return null;
	}

}
