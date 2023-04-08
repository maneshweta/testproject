package polymorphism;

public class ridingpractice2 extends ridingpractice{
	
	public void addition(int a, int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	public void addition(int a,int b,int c,int d,int e) {
		System.out.println(a+b+c+d+e);
	}
	public static void main(String[]args) {
		riding2 n=new riding2();
		n.addition(6, 5, 8, 9);
		n.addition(9, 7, 6, 5, 8);
		
		riding.addition();
		riding.addition(8, 8);
	}
}
