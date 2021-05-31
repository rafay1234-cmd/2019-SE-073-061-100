
public class payment {


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

