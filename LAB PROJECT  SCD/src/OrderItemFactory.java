
public class OrderItemFactory {


	    public static OrderItem getOrderItem(String orderItemClass , String name, double price)
	    {
	        switch (orderItemClass)
	        {
	            case "Deal":
	            {
	                return new Deal("--", name, price);
	            }

	            case "FoodItem":
	            {
	                return new FoodItem("--", name, price);
	            }

	            default: {
	                return new FoodItem("--", name, price);
	            }
	        }
	    }
	
}
