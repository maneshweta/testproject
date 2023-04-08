package arraypractice;

public class array2 {
	public static void main(String[]args) {
		String b[][]= {{"anan","ability","auran"},{"karun","karra","kamai"},{"yamman","union","laman"}};
		int a=b.length;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}

