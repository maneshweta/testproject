package arraypractice;

public class star2 {
	public static void main(String[]args) {
		int star=0;
		int space=5;
		
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}for(int k=0;k<=star;k++)
				System.out.print(k);
			    System.out.println();
			    
			    if(i<=4) {
			    	star++;
			    	space--;
			    }
			    else {
			    	star--;
			    	space++;
			    }
		}
	}

}
