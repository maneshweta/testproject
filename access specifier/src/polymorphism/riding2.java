package polymorphism;

public class riding2 extends riding {
	public void statement() {
		System.out.println("method from subclass is running");
	}
	public static void main(String[]args) {
		riding2 g=new riding2();
		g.statement();
		
		riding j=new riding();
		j.superclass();
	}

}
