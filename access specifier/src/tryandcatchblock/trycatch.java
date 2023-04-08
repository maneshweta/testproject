package tryandcatchblock;

public class trycatch {

	public static void main(String[]args) {
		//exception handling by using try and catch block
		
		int a=20;
		int b=0;
		int c=0;
		int d[]= {10,20,30,40,50};
		
		System.out.println("before try block code started");
		try {
			System.out.println("try block risky code");
			c=a/b;
			System.out.println(c);
			System.out.println(d[6]);
		}
		catch(ArithmeticException e) {
			b=2;
			c=a/b;
			System.out.println("alternative code of arithmetic");
			
		}
		
	}
	
	
}
