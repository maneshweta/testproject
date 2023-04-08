package polymorphism;

public class overriding {
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	public static void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
public static void main(String[]args) {
		overriding x=new overriding();
		x.addition(4, 2);
		overriding.addition(6, 2, 1);
	}

}
