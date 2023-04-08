package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	 public static void main(String[]args) {
		 
		 
		 //order of insertion random
		 HashMap<Integer,String> map=new HashMap();
		map.put(19, "Automation");
		map.put(null,"uiii" );
		map.put(89, null);
		map.put(null, null);
		map.put(9, "jjjjj");
		map.put(4,"pppp");
		
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println("key= "+m.getKey()+ " value= "+m.getValue());
		}
		System.out.println("*****************");
		
		map.put(89, "llll");
		
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(" key= "+m.getKey()+" value= "+m.getValue());
		}
		
	 }
}
