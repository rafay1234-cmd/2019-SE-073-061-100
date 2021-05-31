import java.util.Scanner;
import java.beans.Statement;
import java.sql.*;

import com.sun.jdi.connect.spi.Connection;
public class Main{
private static double cost;
private static double coupon;

static int x = 0;
		public static void main(String[] args) throws Exception{
			 try {
		        	localpaymentoption obj=new localpaymentoption();
		        	obj.mymethod(1);
		        }
		        catch(Exception ex) {
		        	System.out.println(ex);
		        }
			String url="jbdc:mysql://localhost:3305//restaurentmanagementsystem";
			String uname="root";
			String pass="rafay1234567890";
			String query="SELECT * FROM detailitem;";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=(Connection) DriverManager.getConnection(url,uname,pass);
	java.sql.Statement st=((java.sql.Connection) conn).createStatement();
	ResultSet rs=((java.sql.Statement) st).executeQuery(query);
	rs.next();

	String name=rs.getString("name");
	System.out.println(name);
	st.close();
	conn.close();
		
	 discountcoupon obj = new discountcoupon();
	   coupon r1 =new coupon(obj);
	   discountvoucher r2=new discountvoucher(obj);
	   r1.start();
	   r2.start();


		         Scanner input = new Scanner(System.in);
		       
		         while((cost = input.nextDouble())%1 != 0)
		              
		         {
		            
		             }
		         {
		         if (cost<10) {System.out.print(x);}
		          
		         else
		         if (cost>=10 && cost<=60) { coupon = .08;}
		         if (cost>60 && cost<=150) { coupon = .10;}
		         if (cost>150 && cost<=210) { coupon = .12;}
		         if (cost>210) { coupon = .14;}
		     
		         System.out.println("You win a discount coupon of:" +"$"
		         + coupon*cost + " which is equal to " + coupon*100  +"% "  + "of your purchase");
		    }
		       discountcoupon obj = new discountcoupon();
		    		   coupon r1 =new coupon(obj);
		    		   discountvoucher r2=new discountvoucher(obj);
		    		   r1.start();
		    		   r2.start();
		}
} public void payment() {
		        	 payment cash1 = new payment(50.5);
		        	 payment cash2 = new payment(20.45);
		        	 payment credit1 =

		        	 cash1.paymentDetails();
		        	 System.out.println();
		        	 System.out.println("Cash 2 details:");
		        	 cash2.paymentDetails();
		        	 System.out.println();
		        	 System.out.println("Credit 1 details:");
		        	 credit1.paymentDetails();
		        	 System.out.println();
		        	 System.out.println("Credit 2 details:");

		        	 System.out.println();
		        	 }
		        	 
		        	
