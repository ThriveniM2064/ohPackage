package com.xworkz.song.dto;

import java.util.LinkedHashSet;
import java.util.Set;

public class SongRunner {
	public static void main(String[] args) {
		SongDTO songdto=new SongDTO(111,"nine nine","chaitra","5:21min");
		SongDTO songdto1=new SongDTO(112,"miana","geetha","5:01min");
		SongDTO songdto2=new SongDTO(113,"manasellanine","nagesh","4:21min");
		SongDTO songdto3=new SongDTO(114,"he sharade","vasuki vaibhav","5:00min");
		SongDTO songdto4=new SongDTO(115,"arare avala naguva","vasuki vaibhav","3:21min");
		SongDTO songdto5=new SongDTO(116,"kagadada doniyali","kamali","5:40min");
		SongDTO songdto6=new SongDTO(117,"E sundara","spb","3:30min");
		SongDTO songdto7=new SongDTO(118,"hrudaya hadithu","Rajkumar","5:30min");
		SongDTO songdto8=new SongDTO(119,"agaga nenapaguthale","anupama","2:21min");
		SongDTO songdto9=new SongDTO(110,"endo barede","puneeth rajkumar","6:21min");
		SongDTO songdto10=new SongDTO(121,"hrudayada padu","suma","1:21min");
		SongDTO songdto11=new SongDTO(122,"govinda","shree","8:21min");
		SongDTO songdto12=new SongDTO(123,"innunu bekagide","garuda","3:21min");
		SongDTO songdto13=new SongDTO(124,"muddu muddagi","gamana","5:00min");
		SongDTO songdto14=new SongDTO(125,"kelu krishna","vasuki vaibhav","4:00min");
		SongDTO songdto15=new SongDTO(126,"mugilu","doora hogo munna","3:07min");
		SongDTO songdto16=new SongDTO(127,"marali mansagide","chaitra","5:11min");
		SongDTO songdto17=new SongDTO(128,"hrudayada paadu","gopi","5:22min");
		SongDTO songdto18=new SongDTO(129,"nine nine","ee saniha","5:23min");
		SongDTO songdto19=new SongDTO(130,"dabba song","ankitha","5:25min");
		Set<SongDTO> songdtos=new LinkedHashSet<>();
		songdtos.add(songdto);
		songdtos.add(songdto19);
		songdtos.add(songdto19);
		songdtos.add(songdto17);
		songdtos.add(songdto16);
		songdtos.add(songdto15);
		songdtos.add(songdto14);
		songdtos.add(songdto4);
		songdtos.add(songdto13);
		songdtos.add(songdto12);
		songdtos.add(songdto11);
		songdtos.add(songdto10);
		songdtos.add(songdto9);
		songdtos.add(songdto8);
		songdtos.add(songdto7);
		songdtos.add(songdto6);
		songdtos.add(songdto5);
		songdtos.add(songdto3);
		songdtos.add(songdto2);
		songdtos.add(songdto1);
		System.out.println("Total songs is---"+songdtos.size());
	}

}
