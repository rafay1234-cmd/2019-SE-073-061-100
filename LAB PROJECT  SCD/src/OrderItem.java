
public class OrderItem {

private static String Name = null;

{
	String url="jbdc:mysql://localhost:3305//restaurentmanagementsystem";
	String uname="root";
	String pass="rafay1234567890";
	String query="SELECT * FROM detailitem;";
	
	    String Id;
	    String Name;
	    double price;
}
private double price;
private String Id;

	    public OrderItem(String id, String name, double price) {
	        Id = id;
	        Name = name;
	        this.price = price;
	    }

	    public OrderItem() {
	    }

		public String getId() {
	        return Id;
	    }

	    public void setId(String id) {
	        Id = id;
	    }

	    public String getName() {
	        return Name;
	    }

	    public void setName(String name) {
	        String Name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	

}
