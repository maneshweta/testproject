package Collections;

public class CDA<G> {
	int a;
	G b;
public static void main(String[]args) {
	
	
	CDA<Integer> x=new CDA <Integer> ();
     x.a=78;
     x.b=89;
     System.out.println(x.b);
     
     CDA<String> y=new CDA <String> ();
     y.b="Automation";
     System.out.println(y.b);
     
}   
}
