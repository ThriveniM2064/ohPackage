package IPLTeamsDAO;
import IPLTeamDTO.iplTeamDTO;
public abstract class iplTeamDAO {
	
private int iplTeamCount;
protected iplTeamsDTO[] ipldto=new iplTeamsDTO[14];
protected int index=0;

public void save(iplTeamsDTO dto)
{
	System.out.println("created save dto");
	if(dto!=null&&index<this.ipldto.length)
	{
		this.ipldto[index]=dto;
		index++;
		System.out.println("iplTeamDTO created"+dto);
	}
}
public iplTeamDTO[]getipldto()
{
return ipldto;	
}


public iplTeamDTO findByNameAndSponsor(String Name, String Sponser) {
		if (Name == null  || Sponser==null) {
			System.err.println("ipl league passed");
			return null;
		}
		for (int index = 0; index < this.ipldto.length; index++) {
			if (this.ipldto[index] != null && this.ipldto[index].getName().equals(Name)  && this.ipldto[index].getSponser().equals(Sponser)) {
				System.out.println("The ipl team found  " + index);
				return this.ipldto[index];
			}
		}
		System.err.println("The ipl team formed");
		return null;
	}

//	IplTeamDTO findByNameAndSponsorAndCaptain(String name,String sponsor,String captain)

	public iplTeamDTO findByNameAndSponsorAndCaptain(String Name,String Sponser,String captain) {
		
		if (Name==null  || Sponser==null || captain==null) {
			System.err.println("null");
			return null;
			}
		for(int index=0;index<this.ipldto.length;index++) {
			if(this.ipldto[index]!=null && this.ipldto[index].getName().equals(Name) &&
					this.ipldto[index].getSponser().equals(Sponser) && this.ipldto[index].getCaptain().equals(captain)) {
				System.out.println("found "+index);
				return this.ipldto[index];		
				}
		}
		System.err.println("the ipl info");
		
		
		return null;
	}
}
