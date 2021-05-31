import java.io.IOException;

public class localpaymentoption extends payment{
	class CashPayment extends payment {

	     public CashPayment(double paymentAmount) {
	         super(paymentAmount);
	    
	    
	        
	        boolean startValid = false;
			String[] args = null;
	        String cardNumber = args[0];

	        if (cardNumber.charAt(0) == '4' || cardNumber.charAt(0) == '5' || cardNumber.charAt(0) == '6')
	            startValid = true;
	        if(cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7')
	            startValid = true;
	        int doubleResult = 0;
	        int singleResult = 0;
	        int count = 0;
	        for(int i = cardNumber.length() - 1; i >= 0; --i, ++count)
	        {
	            if(count % 2 == 0)
	            {
	                singleResult += Character.getNumericValue(cardNumber.charAt(i));
	            }
	            else
	            {
	                int temp = Character.getNumericValue(cardNumber.charAt(i));
	                temp *= 2;
	                int adding = 0;
	                if(temp >= 10)
	                {
	                    adding = (int)(temp / 10) + (int)(temp % 10);
	                }
	                else
	                    adding = temp;
	                doubleResult += adding;
	            }
	        }
	        //System.out.println("DEBUG: double result:" + doubleResult);
	        //System.out.println("DEBUG: single result:" + singleResult);
	        
	     }
	
	 
void mymethod(int cardnumber)throws IOException,ClassNotFoundException{
	if(cardnumber==1)
		throw new IOException("card number accept ");
	else
		throw new ClassNotFoundException("invalid card number");
}

	
}

	public void mymethod(int i) {
		// TODO Auto-generated method stub
		
	}

	public int cardnumber(int i) {
		// TODO Auto-generated method stub
		return 0;
	}}