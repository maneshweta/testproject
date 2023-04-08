package interfacetesting;

public class Sett implements ABC {
	
	public void Define() {
		System.out.println("define method is running");
	}
	public void Setup() {
		System.out.println("setup method is running");
	}
	public static void main(String[]args) {
		Sett v=new Sett();
		v.Define();
		v.Setup();
		
	}
}
