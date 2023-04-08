package advancefor;

public class advancefor {

	public static void main(String[]args) {
	int number[]= {10,20,30,40};
	int addition=0;
	
	for(int numb:number) {
		System.out.println(numb);
		addition +=numb;
	}
	System.out.println("addition="+addition);
	
	}
}
