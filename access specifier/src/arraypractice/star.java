package arraypractice;

public class star {
	public static void main(String[]args) {
	int space=0;
	int star=10;
	
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=star;k++)
			System.out.print("*");
		    System.out.println();
		
	
	if(i<=5) {
		space++;
		star=star-2;
		
	}
	else {
		space--;
		star=star+2;
		
	}
}
	}
}