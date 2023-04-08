package package2;

public class classA {
	public int a=70;
	private int b=90;
	protected int c=50;
	int d=35;
	
	public static void main(String[]args) {
		classA x= new classA();
		System.out.println(x.a);//public calling
		System.out.println(x.b);//private calling
		System.out.println(x.c);//protected calling
		System.out.println(x.d);//default calling
	}

}
