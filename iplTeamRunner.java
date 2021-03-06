package IPLTeams;
import IPLTeamDTO.iplTeamDAOImplementation;
import IPLTeamDTO.dto.iplTeams;

public class iplTeamRunner {
	public static void main(String [] args) {
		
		
		iplTeamDTO ipldto1=new iplTeamDTO();
		ipldto1.setName("RCB");
		ipldto1.setId(5434);
		ipldto1.setCaptain("virat kohli");
		ipldto1.setSponser("muthoot fincorp");
		ipldto1.setNoOfLostMatch(1);
		ipldto1.setNoOfWins(2);
		
		iplTeamDTO ipldto2=new iplTeamDTO();
		ipldto2.setName("CSK");
		ipldto2.setId(4142);
		ipldto2.setCaptain("Ravindra Jadeja");
		ipldto2.setSponser("Amazon");
		ipldto2.setNoOfLostMatch(3);
		ipldto2.setNoOfWins(0);
		
		
		iplTeamDTO ipldto3=new iplTeamDTO();
		ipldto3.setName("Delhi Capitals");
		ipldto3.setId(4524);
		ipldto3.setCaptain("rishab Pant");
		ipldto3.setSponser("JSW");
		ipldto3.setNoOfLostMatch(1);
		ipldto3.setNoOfWins(1);
		
		iplTeamDTO ipldto4=new iplTeamDTO();
		ipldto4.setName("KKR");
		ipldto4.setId(4527);
		ipldto4.setCaptain("Shreyas Ayer");
		ipldto4.setSponser("WINZO");
		ipldto4.setNoOfLostMatch(1);
		ipldto4.setNoOfWins(2);
		
		
		iplTeamDTO ipldto5=new iplTeamDTO();
		ipldto5.setName("GT");
		ipldto5.setId(4536);
		ipldto5.setCaptain("Hardik Pandya");
		ipldto5.setSponser("Zomato");
		ipldto5.setNoOfLostMatch(0);
		ipldto5.setNoOfWins(2);
		
		iplTeamDTO ipldto6=new iplTeamDTO();
		ipldto6.setName("LSG");
		ipldto6.setId(4527);
		ipldto6.setCaptain("K.L.Rahul");
		ipldto6.setSponser("My 11 Circle");
		ipldto6.setNoOfLostMatch(1);
		ipldto6.setNoOfWins(2);
		
		
		iplTeamDTO ipldto7=new iplTeamDTO();
		ipldto7.setName("PBKS");
		ipldto7.setId(4212);
		ipldto7.setCaptain("Mayank Agarwal");
		ipldto7.setSponser("EbixCash");
		ipldto7.setNoOfLostMatch(1);
		ipldto7.setNoOfWins(2);
		
		
		iplTeamDTO ipldto8=new iplTeamDTO();
		ipldto8.setName("Mumbai Indians");
		ipldto8.setId(4526);
		ipldto8.setCaptain("Rohit Sharma");
		ipldto8.setSponser("Slice");
		ipldto8.setNoOfLostMatch(2);
		ipldto8.setNoOfWins(0);
		
		
		iplTeamDTO ipldto9=new iplTeamDTO();
		ipldto9.setName("Deccan Chargers");
		ipldto9.setId(4562);
		ipldto9.setCaptain("VVS Laxman");
		ipldto9.setSponser("puma");
		ipldto9.setNoOfLostMatch(5);
		ipldto9.setNoOfWins(4);
		
		
		
		iplTeamDTO ipldto10=new iplTeamDTO();
		ipldto10.setName("SRH");
		ipldto10.setId(4537);
		ipldto10.setCaptain("Kane williumson");
		ipldto10.setSponser("CARS");
		ipldto10.setNoOfLostMatch(2);
		ipldto10.setNoOfWins(0);
		
		
		
		iplTeamDTO ipldto11=new iplTeamDTO();
		ipldto11.setName("GL");
		ipldto11.setId(4512);
		ipldto11.setCaptain("Suresh Raina");
		ipldto11.setSponser("Swiggy");
		ipldto11.setNoOfLostMatch(4);
		ipldto11.setNoOfWins(8);
		
		
		
		iplTeamDTO ipldto12=new iplTeamDTO();
		ipldto12.setName("RPS");
		ipldto12.setId(4578);
		ipldto12.setCaptain("Steven Smith");
		ipldto12.setSponser("MOTO");
		ipldto12.setNoOfLostMatch(8);
		ipldto12.setNoOfWins(6);
		
		
		
		iplTeamDTO ipldto13=new iplTeamDTO();
		ipldto13.setName("Kochi Tuskers kerala");
		ipldto13.setId(4527);
		ipldto13.setCaptain("Mahela Jayavardane");
		ipldto13.setSponser("Anchor");
		ipldto13.setNoOfLostMatch(10);
		ipldto13.setNoOfWins(4);
		
		
		
		iplTeamDTO ipldto14=new iplTeamDTO();
		ipldto14.setName("RR");
		ipldto14.setId(45287);
		ipldto14.setCaptain("Sanju Samson");
		ipldto14.setSponser("Happilo");
		ipldto14.setNoOfLostMatch(1);
		ipldto14.setNoOfWins(2);
		
		iplTeamDAOImplementation dao=new iplTeamDAOImplementation();
		
		iplTeamDAOImplementation castedDAO=(iplTeamDAOImplementation)dao;
		
				castedDAO.save(ipldto1);
				castedDAO.save(ipldto2);
				castedDAO.save(ipldto3);
				castedDAO.save(ipldto4);
				castedDAO.save(ipldto5);
				castedDAO.save(ipldto6);
				castedDAO.save(ipldto7);
				castedDAO.save(ipldto8);
				castedDAO.save(ipldto9);
				castedDAO.save(ipldto10);
				castedDAO.save(ipldto11);
				castedDAO.save(ipldto12);
				castedDAO.save(ipldto13);
				castedDAO.save(ipldto14);
				castedDAO.IplTeamDTOfindByName("RCB");
				castedDAO.IplTeamDTOfindByName("Du Plessis");
				castedDAO.findByNameAndSponsor("RCB", "muthoot fincorp");
				castedDAO.findByNameAndSponsorAndCaptain("RR", "Happilo"," Sanju Samson");
				

		
		
		}
		
		
		
		


	}

}
