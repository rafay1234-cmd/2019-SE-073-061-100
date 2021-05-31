
public class payment {

	String url="jbdc:mysql://localhost:3305//restaurentmanagementsystem";
	String uname="root";
	String pass="rafay1234567890";
	String query="SELECT * FROM detailitem;";
	private double amount;
	public payment()
	{
	amount = 0.0;
	}
	/**
	* Constructor to initialize payment amount
	*/
	public payment(double paymentAmount)
	{
	amount = paymentAmount;
	}
	/**
	* Sets the payment amount
	*/
	public void setPayment(double paymentAmount)
	{
	amount = paymentAmount;
	}
	/**
	* Returns the payment amount
	*/
	public double getPayment()
	{
	return amount;
	}
	/**
	* Prints a description of the payment
	 * @return 
	*/
	public payment paymentDetails()
	{
	System.out.println("The payment amount is " + amount);
	return null;
	}
}

