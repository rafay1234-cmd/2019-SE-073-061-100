

	import java.util.ArrayList;

	public class Deal extends OrderItem{
		String url="jbdc:mysql://localhost:3305//restaurentmanagementsystem";
		String uname="root";
		String pass="rafay1234567890";
		String query="SELECT * FROM detailitem;";

	    public Deal(String id, String name, double price) {
	        super(id, name, price);
	    }

	    public Deal() {
	    }
	}


