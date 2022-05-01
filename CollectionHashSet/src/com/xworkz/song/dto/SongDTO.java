package com.xworkz.song.dto;

import java.io.Serializable;

public class SongDTO implements Serializable{
     private int id;
     private String name;
     private String singer;
     private String duration;
	public SongDTO() {
		System.out.println("default constructor");
	}
	
	public SongDTO(int id, String name, String singer, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.duration = duration;
	}

	public int getId() {
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public int hashCode() {
		System.out.println("running hashcode");
		System.out.println("name of song"+name);
		int superhashCode=30;
		System.out.println(superhashCode);
		return superhashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals");
		if(this==obj)
			return true;
		if(!(obj instanceof SongDTO))
			return false;
		SongDTO other=(SongDTO) obj;
		if(name==null)
		{
			if(other.name!=null)
				return false;
			if(singer==null)
				if(other.singer!=null)
					return false;
		}
		else if(!singer.equals(other.singer))
			return false;
		return true;
		
	}

	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", name=" + name + ", singer=" + singer + ", duration=" + duration + "]";
	}
     
}
