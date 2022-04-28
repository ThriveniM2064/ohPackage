package com.xworkz.politician.sort;
import java.util.Comparator;
import com.xworkz.politician.dto.PoliticalPartyDTO;
public class SortByName implements Comparator<PoliticalPartyDTO> {

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
