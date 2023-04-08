package Casting;

public class testupcasting {
	
	public static void main(String[]args) {
		System.out.println("**********super class method******");
		
		upcasting x=new upcasting();
		x.Demo();
		x.Set();
		x.staticcast();
		
		
		System.out.println("**********sub class method******");
		

		upcast1 i=new upcast1();
		i.Demo();
		i.Set();
		i.staticcast();
		
		System.out.println("**********casting methods******");
		upcasting z=new upcast1();
		z.Demo();
		z.Set();
		z.staticcast();

	
		upcast1 g=(upcast1)new upcasting();
		g.Demo();
		g.Set();
		g.Set();
		g.staticcast();
	}

}
