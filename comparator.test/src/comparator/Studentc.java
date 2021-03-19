package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Studentc {
	int rollno; 
	String name;  
	int age; 
	

	public Studentc(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
class AgeComparator implements Comparator<Studentc>
{  
    public int compare(Studentc s1,Studentc s2)
    {  
      if(s1.age==s2.age) 
    	  
      return 0;  
      
      else if(s1.age>s2.age)  
    	  
      return 1;  
      
     else 
    	 
      return -1;  
}  
}  


      class nameComparator implements Comparator<Studentc>
      {
    	  
      public int compare(Studentc s1,Studentc s2)
      {  
      return s1.name.compareTo(s2.name);  
}  
}  
        