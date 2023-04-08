package arraypractice;

public class array {
	public static void main(String[]args) {
		int a[][]= {{21,24,25},{41,45,46},{56,57,58}};
		int b=a.length;
		for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(a[i][j]+" ");
		}
		
		System.out.println();
		}
		}

}
