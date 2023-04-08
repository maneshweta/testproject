package Collections;

import java.util.Hashtable;
import java.util.Map;

public class generichashtable {

	public static void main(String[]args) {
		Hashtable<Integer ,String> table=new Hashtable <Integer , String> ();
		table.put(14, "mumbai");
		table.put(45, "pune");
		table.put(35, "delhi");
		table.put(87, "hyderabad");
		table.put(76, "Noida");
		for(Map.Entry<Integer, String> f:table.entrySet()) {
			System.out.println(" key="+f.getKey()+" value="+f.getValue());
		}
	}
	
}
