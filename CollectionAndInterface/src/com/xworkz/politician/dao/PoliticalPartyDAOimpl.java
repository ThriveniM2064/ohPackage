package com.xworkz.politician.dao;
import java.util.Comparator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import com.xworkz.politician.dto.PoliticalPartyDTO;

public class PoliticalPartyDAOimpl  implements PoliticalPartyDAO{
    List<PoliticalPartyDTO> politicalpartyDTO=new LinkedList<>();
    List<PoliticalPartyDTO> list=new LinkedList<PoliticalPartyDTO>();
    
	public PoliticalPartyDAOimpl() {
		System.out.println("Generating   ".concat(this.getClass().getSimpleName()));
	}
  
	@Override
	public boolean save(PoliticalPartyDTO politicalpartydto) {
		if((!list.contains(politicalpartydto))) {
			list.add(politicalpartydto);
			if(list.contains(politicalpartydto)) {
				System.out.println("dto is saved".toString());
				return true;
			}
		}
		else {
			System.out.println("cannot add");
			return false;
		}
		return false;
	
	
	}
	
 public void display()
 {
	 System.out.println(politicalpartyDTO);
 }
	@Override
	public PoliticalPartyDTO deteleByName(String name) {
		System.out.println(politicalpartyDTO.size());
		if(name!=null)
		{
			ListIterator<PoliticalPartyDTO> iterator=politicalpartyDTO.listIterator();
			while(iterator.hasNext())
			{
				PoliticalPartyDTO dto=(PoliticalPartyDTO) iterator.next();
				if(dto.getName().equals(name))
				{
					iterator.remove();
					System.out.println(politicalpartyDTO.size());
					System.out.println("deleted name is"+name);
					return dto;
				}
			}
		}
		System.out.println("Name is null");
		return null;
		// TODO Auto-generated method stub
		
	}

	public List<PoliticalPartyDTO> sort(Comparator<PoliticalPartyDTO> comparator) {
		if(comparator!=null) {
			list.sort(comparator);
			return list;
		}
		return null;
	}

	//public void save(PoliticalPartyDTO politicalpartydto2) {
		// TODO Auto-generated method stub
		
	}

	

	

	


