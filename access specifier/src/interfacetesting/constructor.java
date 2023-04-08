package interfacetesting;

public class constructor {
			int a;
			int b;
			int m;
			String name;
			String velocity;
			constructor(){
				a=78;
				b=68;
			}
			constructor(int c,int d,int i){
				a=c;
				b=d;
				m=i;
			}
			constructor(int c,int d){
				a=c;
				b=d;
			}
			constructor(String abc, String Testing){
				name=abc;
				velocity=Testing;
			}
			public void addition() {
				System.out.println(m+a+b);
				int XYZ;
				XYZ=89;
			}
	       public void test() {
	    	   System.out.println(name);
	    	   System.out.println(velocity);
	       }
	       public static void main(String[]args) {
	    	   constructor g=new constructor();
	    	   g.test();
	    	   g.addition();
	    	   
	    	   constructor k=new constructor(5,7);
	    	   k.addition();
	    	   
	    	   constructor l=new constructor(6,8,9);
	    	   l.addition();
	    	   
	    	   constructor t=new constructor("GHJK","automation");
	    	   t.test();
	    	 
	    	   
	       }
	}



