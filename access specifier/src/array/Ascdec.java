
package array;

import java.util.Arrays;

public class Ascdec {
      public static void main(String[]args) {
    	  int a[]= {10,50,30,20,40,60};
    	//  int size=a.length-1;
    	 // System.out.println(size);
    	  
    	  System.out.println("********ALL INFO ARRAY********");
    	  for(int i=0;i<=a.length-1;i++) {
    		  System.out.println(a[i]);
    	  }
    	  
    	 Arrays.sort(a);
    	  System.out.println("********ALL INFO ARRAY IN ASCE********");
    //	  for(int i=5;i<=a.length-1;i--) {
    	//	  System.out.println(a[i]);
    	  
    	  
    	  for(int i=0;i<=a.length-1;i++) {
    		  System.out.println(a[i]);
    	  }
    	  
    	  
    	  System.out.println("********ALL INFO ARRAY IN DESC********");
    	  
    	  for(int i=a.length-1;i>=0;i--) {
    		  System.out.println(a[i]);
    	  
    	  }
      }
}
