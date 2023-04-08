package arraypractice;

public class leftsecondthirdquandrantstar {
       public static void main(String[]args) {
	       int star=0;
	       int space=4;
	       for(int i=0;i<=8;i++) {
	    	   for(int j=0;j<=6;j++) {
	    		   System.out.print(" ");
	    	   }
	    	   System.out.print("*");
	    	//   System.out.println();
	    	   
	    	   if(i<=4) {
	    		   space--;
	    		   star=star+2;
	    	   }
	    	   else {
	    		   space++;
	    		   star=star-2;
	    	   }
	       }
 }
	
	
	
	
}
