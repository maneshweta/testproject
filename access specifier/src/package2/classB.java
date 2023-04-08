package package2;

public class classB {
	public static void main(String[]args) {
		classA z=new classA();
		
		System.out.println(z.a);//public
		//System.out.println(z.b);//private
		System.out.println(z.c);//protected
		System.out.println(z.d);//default
	}

}
