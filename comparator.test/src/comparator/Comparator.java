package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
	  
	      
	      public static void main(String args[]){  
	    
	    	ArrayList<Studentc> al=new ArrayList<Studentc>();  
	    	
	    	al.add(new Studentc(101,"Vijay",23));  
	    	al.add(new Studentc(106,"Ajith",27));  
	    	al.add(new Studentc(105,"Ram",21));  
	    	  
	    	System.out.println("Sorting by Name");  
	    	 
	    	
	    	
	    	for(Studentc s: al)
	    	{  
	    	System.out.println(s.rollno+" "+s.name+" "+s.age);  
	    	}  
	    	  
	    	System.out.println("sorting by Age");  
	    	  
	    	Collections.sort(al,new AgeComparator());  
	   
	    	for(Studentc s: al)
	    	{  
	    	System.out.println(s.rollno+" "+s.name+" "+s.age);  
	    	}  
	    	  
	    	}  
	      }
	      


