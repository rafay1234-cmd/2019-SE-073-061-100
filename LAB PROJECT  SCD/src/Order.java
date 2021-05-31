

	import java.util.ArrayList;

	public class Order {

	    String orderId;
	    ArrayList<OrderItem> orderItems;
	    CUSTOMER orderPlacedBy;

	    public String getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(String orderId) {
	        this.orderId = orderId;
	    }

	    public ArrayList<OrderItem> getOrderItems() {
	        return orderItems;
	    }

	    public void setOrderItems(ArrayList<OrderItem> orderItems) {
	        this.orderItems = orderItems;
	    }

	    public CUSTOMER getOrderPlacedBy() {
	        return orderPlacedBy;
	    }

	    public void setOrderPlacedBy(CUSTOMER orderPlacedBy) {
	        this.orderPlacedBy = orderPlacedBy;
	    }
	}




