package exceptionhandling;

public class uncheckruntimeException {
public static void main(String[]args) {
	
	int a=20;
	int b=0;
	int c=0;
	try {
		c=a/b;
		System.out.println("Risky code");
		
	}
	catch(ArithmeticException e){
		System.out.println("alternate code");
		b=2;
		c=a/b;
		System.out.println(c);
	}
}
}
