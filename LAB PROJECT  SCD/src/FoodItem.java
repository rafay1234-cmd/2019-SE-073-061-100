

	import java.util.ArrayList;

	public class FoodItem extends OrderItem {
		String url="jbdc:mysql://localhost:3305//restaurentmanagementsystem";
		String uname="root";
		String pass="rafay1234567890";
		String query="SELECT * FROM detailitem;";
	    public FoodItem(String id, String name, double price) {
	        super(id, name, price);
	    }

	    public FoodItem() {
	    }
	}


