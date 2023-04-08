package interfacetesting;

public class Settpractice implements ABCPRACTICE {
	public  void mean() {
		System.out.println("mean method is running");
	}
	public  void shutt() {
		System.out.println("setup method is running");
	}
	public static void main(String[]args) {
		Settpractice a=new Settpractice();
		
		a.mean();
		a.shutt();
	}
	
}