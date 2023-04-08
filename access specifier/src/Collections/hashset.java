package Collections;

import java.util.HashSet;

public class hashset {
	public static void main(String[]args) {
		HashSet set=new HashSet();
		
		set.add("aaaa");
		set.add(null);
	    set.add(24.56f);	
		set.add(null);
		set.add(null);
		
		for(Object s:set) {
			System.out.println(s);
		}
		
	}

}
