
public class Bank extends payment{
int account ;
String name;
int payorder ;


void Bank(int account,String name,int payorder) {
	this.account=account;
	this.name=name;
	this.payorder=payorder;
}
public payment paymentDetails() {
	System.out.println("details of payment");
	return null;
}
}

	