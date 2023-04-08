package array;

public class SWIPPINGARRAY {
public static void main(String[]args) {
	String a[]= {"aman","bjit","chann","dimmer"};
	 for(int i=0;i<=a.length-1;i++) {
		 System.out.println(a[i]);
	 }
	 for(int i=0;i<(a.length/2);i++) {
		 String c;
		 c=a[i];
		 a[i]=a[(a.length-1)-i];
		 a[(a.length-1)-i]=c;
		 
	 }
	 
        System.out.println("***********swap***********");
    
     for(int i=0;i<=a.length-1;i++) {
    	 System.out.println(a[i]);
     }
     }

}
