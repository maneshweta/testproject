package Collections;

public class methodgeneric <G,L>{

//	int a;
	
	G b;
	
	G Demo(L x) {
		System.out.println(x);
		return b;
	}
public static void main(String[]args) {
	
	
	methodgeneric <Integer,String> y=new methodgeneric<Integer,String> ();
     y.b=879;
     
     int z=y.Demo("Automation");
     
     System.out.println(z);
     

}

}