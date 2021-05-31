import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cardnumbertest {

	@Test
	void test() {
		localpaymentoption obj=new localpaymentoption(); 
		  int output=obj.cardnumber(5); 
		  assertEquals(3, output); 
		 }  
		 
	

}
