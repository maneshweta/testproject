package Collections;

import java.util.ArrayList;

public class araylist {
   public static void main(String[]args) {
	  ArrayList list=new ArrayList();
	  
	  list.add("Automation");
	  list.add('@');
	  list.add(1234);
	  list.add(780);
	  
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i));
	   }
	  
	  System.out.println("***********************");
	  
	  list.remove(1);
	  
	  
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i));
	  }
   }
	
}
