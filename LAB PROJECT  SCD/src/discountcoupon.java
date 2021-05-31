

	import java.util.Scanner;
	public class discountcoupon extends Order{
		 static double cost;
		    static double coupon = 0;
		    static String x = "No coupon";
		synchronized void discount(double n) {
			 for(int i=0;i<=1;i++){  
			     System.out.println(n*i);  
			     try{  
			      Thread.sleep(400);  
			     }catch(Exception e)
			     {System.out.println(e);}  
			   }  
			  
		}
		public void printdiscountcoupon(int i) {
			// TODO Auto-generated method stub
			
		}}