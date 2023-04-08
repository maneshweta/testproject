package Collections;

import java.util.ArrayList;


public class araylistrestriction {
     public static void main(String[]args) {
    	 ArrayList <Integer> list=new ArrayList<Integer>();
    	 
    	 list.add(1234);
    	 list.add(6789);
    	 list.add(90009);
    	 list.add(1234);
    	 list.add(null);
    	 list.add(null);
    	 list.add(null);
    	 
    	 int size = list.size();
    	 System.out.println("size="+size);
    	 
    	 for(int i=0;i<size;i++) {
    		 System.out.println(list.get(i));
    	 }
    	 
    	 
    	 
     }
}
