package arraypractice;

public class star4 {
	public static void main(String[]args) {
	int numb=0;
	int space=4;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=numb;k++) {
				System.out.print(i);
				System.out.println();
				
				if(i<=4) {
					space--;
					numb++;
					
				}
				else {
					space++;
					numb--;
				}
			}
		}
	}
}
	

