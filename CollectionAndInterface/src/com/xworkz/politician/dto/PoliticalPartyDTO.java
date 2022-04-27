package com.xworkz.politician.dto;

public class PoliticalPartyDTO {
	private int id;
	private String name;
	private String presidentName;
	private String nationalParty;
	private int noOfMps;
	public PoliticalPartyDTO(){
		System.out.println("default Constructor");
	}
	public PoliticalPartyDTO(int id, String name, String presidentName, String nationalParty, int noOfMps) {
		super();
		this.id = id;
		this.name = name;
		this.presidentName = presidentName;
		this.nationalParty = nationalParty;
		this.noOfMps = noOfMps;
	}
	public int getId1() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresidentName() {
		return presidentName;
	}
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	public String getNationalParty() {
		return nationalParty;
	}
	public void setNationalParty(String nationalParty) {
		this.nationalParty = nationalParty;
	}
	public int getNoOfMps() {
		return noOfMps;
	}
	public void setNoOfMps(int noOfMps) {
		this.noOfMps = noOfMps;
	}
	@Override
	public String toString() {
		return "PoliticalPartyDTO [id=" + id + ", name=" + name + ", presidentName=" + presidentName
				+ ", nationalParty=" + nationalParty + ", noOfMps=" + noOfMps + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nationalParty == null) ? 0 : nationalParty.hashCode());
		result = prime * result + noOfMps;
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliticalPartyDTO other = (PoliticalPartyDTO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationalParty == null) {
			if (other.nationalParty != null)
				return false;
		} else if (!nationalParty.equals(other.nationalParty))
			return false;
		if (noOfMps != other.noOfMps)
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}
	public static PoliticalPartyDTO next() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
    
	}



