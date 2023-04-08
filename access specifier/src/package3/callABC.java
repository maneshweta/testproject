package package3;

public class callABC extends ABC{
	
	  public void Rest() {
		  System.out.println("concrete");
	  }
	  public void Test() {
		  System.out.println("reimplemented");
	  }
	  
      public static void main(String[]args) {
		  callABC x=new callABC();
		  
		  x.Rest();
		  x.Test();
            }
      }