package com.xworkz.politicianparty.dao;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.xworkz.politicianparty.dao.*;
import com.xworkz.politicianparty.dto.PoliticalPartyDTO;
public  class PoliticalPartyDAOimplem implements PaliticalPartyDAO {
    List<PoliticalPartyDTO> ppo=new LinkedList<PoliticalPartyDTO>();
	protected int politicalIndex=0;

	@Override
	public boolean save(PoliticalPartyDTO politicalpartydto) {
	System.out.println(" Adding political party details");
	ppo.add(politicalIndex,politicalpartydto);
	System.out.println(ppo.get(politicalIndex));
	politicalIndex++;
	return true;
	}
	
	
	

	@Override
	public void deteleByName(String name) {
      
			for(int i=0;i<list.size();i++) {
			System.out.println("Running delete  name method in PoliticalDAOImplementor "+name);

			if(name!=null)
				{
					if(list.get(i).getName().equals(name));
					System.out.println(list.get(i));
					list.remove(i);
				}
				else
				{
				Iterator <PoliticalPartyDTO>  iterater=list.listIterator();
				while(iterater.hasNext())
				{
					System.out.println(" name is not match");
					System.out.println(list.get(i));
					PoliticalPartyDTO dto=(PoliticalPartyDTO)iterater.next();
					if(dto.getName().equals(name))
					{
						iterater.remove();
						System.out.println(list.size());
						return;
					}

				}
				}
			}
	}


		public void addingDTOelementsTOcollection(String  dto)
		{
			list.add(dto);
		}
		public void iterater()
		{
			System.out.println("Iterater");

			Iterator<String> h=list.iterator();

			while(h.hasNext())
			{
				System.out.println(h.next());
			}
		}




		@Override
		public void deleteByName(String name) {
			// TODO Auto-generated method stub
			
		}
}