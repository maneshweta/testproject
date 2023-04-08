package tryandcatchblock;

public class trycatchinsidecatch {
	public static void main(String[]args) {
		int a=20;
		int b=0;
		int c=0;
		int d[]= {10,20,30,40,50};
		
		System.out.println("BEFORE TRY BLOCK CODE STARTED");
		
		try {
			System.out.println("try block risky code");
			c =a/b;
			System.out.println(d[6]);
			 
		}
		catch(ArithmeticException e)
		{
			b=2;
			c=a/b;
			
		//	System.out.println(c);
		//	System.out.println("1alternative code of arithmetic");
			
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("alternative code of array");
			System.out.println(d[3]);}
		}
		
	}
}



    
     
	