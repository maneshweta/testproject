package pakage1;

import package2.classA;

public class classD extends classA {

	public static void main(String[]args) {
		classD x=new classD();
		
		System.out.println(x.a);//public
		//System.out.println(x.b);//private
		System.out.println(x.c);//protected
		System.out.println(x.d);//default
	}

}
