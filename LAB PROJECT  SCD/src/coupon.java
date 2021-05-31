
public class coupon extends discountcoupon  {
	discountcoupon d;
	coupon(discountcoupon d){
		this.d=d;
	}
public void run() {
	d.discount(10);
}
public void start() {
	// TODO Auto-generated method stub
	
}
}
