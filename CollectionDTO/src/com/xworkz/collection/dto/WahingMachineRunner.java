package com.xworkz.collection.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
public class WahingMachineRunner {
	public static void main(String[] args) {
		WashingMachineDTO washigDTO=new WashingMachineDTO(101,"Samsung",7,"white",15000,"WAS2345",Type.AUTOMATIC);
		WashingMachineDTO washigDTO1=new WashingMachineDTO(102,"LG",8,"black",290000,"ASD567",Type.TOPLOAD);
		WashingMachineDTO washigDTO2=new WashingMachineDTO(103,"WHIRLPOOL",7,"BROWN",17000,"WAP2348",Type.SEMIAUTOMATIC);
		WashingMachineDTO washigDTO3=new WashingMachineDTO(104,"IFB",6,"white",115000,"WAS2350",Type.AUTOMATIC);
		WashingMachineDTO washigDTO4=new WashingMachineDTO(105,"Haier",7,"BLUE",35000,"WAS2351",Type.FRONTLOAD);
		WashingMachineDTO washigDTO5=new WashingMachineDTO(101,"Bosch",9,"GREEN",36000,"WAS2323",Type.TOPLOAD);
		WashingMachineDTO washigDTO6=new WashingMachineDTO(101,"Onida",5,"PINK",47000,"WAS2324",Type.MANUAL);
		WashingMachineDTO washigDTO7=new WashingMachineDTO(101,"Panasonic",4,"RED",46000,"WAS2325",Type.SEMIAUTOMATIC);
		WashingMachineDTO washigDTO8=new WashingMachineDTO(101,"BPL",10,"BLUE",89000,"WAS2347",Type.FRONTLOAD);
		WashingMachineDTO washigDTO9=new WashingMachineDTO(101,"Godrej",8,"PRPLE",88000,"WAS234544",Type.SEMIAUTOMATIC);
		WashingMachineDTO washigDTO10=new WashingMachineDTO(101,"Samsung",10,"GREEN",95000,"WAS2388",Type.AUTOMATIC);
		WashingMachineDTO washigDTO11=new WashingMachineDTO(101,"Candy",3,"BLUR",75000,"WAS2399",Type.MANUAL);
		WashingMachineDTO washigDTO12=new WashingMachineDTO(101,"Sanya",15,"Cream",65000,"WAS2300",Type.TOPLOAD);
		WashingMachineDTO washigDTO13=new WashingMachineDTO(101,"GoldStar",12,"blue",135000,"WAS2356",Type.AUTOMATIC);
		WashingMachineDTO washigDTO14=new WashingMachineDTO(101,"hitachi",5,"purple",25000,"WAS2357",Type.SEMIAUTOMATIC);
		WashingMachineDTO washigDTO15=new WashingMachineDTO(101,"intex",8,"white",85000,"WAS2358",Type.MANUAL);
		WashingMachineDTO washigDTO16=new WashingMachineDTO(101,"LG",13,"black",105000,"WAS2359",Type.FRONTLOAD);
		WashingMachineDTO washigDTO17=new WashingMachineDTO(101,"girbru",17,"rad",220000,"WAS2360",Type.SEMIAUTOMATIC);
		WashingMachineDTO washigDTO18=new WashingMachineDTO(101,"Maytac",16,"orange",185000,"WAS2363",Type.AUTOMATIC);
		WashingMachineDTO washigDTO19=new WashingMachineDTO(101,"Huchsch",9,"white",19000,"WAS2365",Type.MANUAL);
		WashingMachineDTO washigDTO20=new WashingMachineDTO(101,"Haier",11,"white",75000,"WAS2369",Type.TOPLOAD);


		      Collection<WashingMachineDTO>   machineDTOs=new LinkedList<WashingMachineDTO>();
		      machineDTOs.add(washigDTO);
		      machineDTOs.add(washigDTO1);
		      machineDTOs.add(washigDTO2);
		      machineDTOs.add(washigDTO3);
		      machineDTOs.add(washigDTO4);
		      machineDTOs.add(washigDTO5);
		      machineDTOs.add(washigDTO6);
		      machineDTOs.add(washigDTO7);
		      machineDTOs.add(washigDTO8);
		      machineDTOs.add(washigDTO9);
		      machineDTOs.add(washigDTO10);
		      machineDTOs.add(washigDTO11);
		      machineDTOs.add(washigDTO12);
		      machineDTOs.add(washigDTO13);
		      machineDTOs.add(washigDTO14);
		      machineDTOs.add(washigDTO15);
		      machineDTOs.add(washigDTO16);
		      machineDTOs.add(washigDTO17);
		      machineDTOs.add(washigDTO18);
		      machineDTOs.add(washigDTO19);
		      machineDTOs.add(washigDTO20);
		  
		     
		    for(WashingMachineDTO k:machineDTOs)
		      {
		          if(k.getPrice()>5000)
		          {
		          	System.out.println(k);
		          }
		      }
		      for(WashingMachineDTO k:machineDTOs)
		      {
		          if(k.getPrice()<5000)
		          {
		          	System.out.println(k);
		          }
		      }
		      for(WashingMachineDTO k:machineDTOs)
		      {
		          if(k.getCapacity()>5)
		          {
		          	System.out.println(k);
		          }
		      }
		      for(WashingMachineDTO k:machineDTOs)
		      {
		          if(k.getCapacity()>5 && k.getCapacity()<15)
		          {
		          	System.out.println(k);
		          }
		      }
		      for(WashingMachineDTO k:machineDTOs)
		      {
		          if( k.getCapacity()>15)
		          {
		          	System.out.println(k);
		          }
		      }
		          for(WashingMachineDTO k:machineDTOs)
		        {
		            System.out.println(k.getBrand().toUpperCase());
		        }
		          for(WashingMachineDTO k:machineDTOs)
		          {
		              String m=k.getBrand();
		              for(int i=0;i<m.length();i++)
		              {
		            	  if(('f'==m.charAt(i))||('F'==m.charAt(i)))
		            	  {
		            		  System.out.println(k.getBrand());
		            	  }
		              }
		          }
		          for(WashingMachineDTO k:machineDTOs)
		          {
		              if(k.getBrand().length()>10)
		              {
		            	  System.out.println(k);
		              }
		          }
		      
		        Iterator<WashingMachineDTO>  iterator=machineDTOs.iterator();
		        while(iterator.hasNext())//boolean if true
		        {
		        	int k=iterator.next().getCapacity();
		        	if(k<5)
		        	{
		        		iterator.remove();
		        	}	
		        	else
		        	{
		        		System.out.println(k);
		        		
		        	}
		        		
		        	
		        }
		        
			}

}
