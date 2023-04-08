package arraypractice;

public class rightpyramid {
	public static void main(String[]args) {
		int star=0;
		int space=4;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(" ");
			}
			for(int o=0;o<=space;o++) {
				System.out.print(" ");
			}
			for(int k=0;k<=star;k++)
				System.out.print("*");
		
		System.out.println();
		space--;
		star=star+2;
		}
	}

}
