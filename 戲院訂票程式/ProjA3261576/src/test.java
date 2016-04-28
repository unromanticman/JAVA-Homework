import API.Theater;

public class test {
	
	/**
	* 資工 2A 
	* A3261576 林郁翔
	* 20160428
	**/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater theater = new Theater();
		theater.initSeat(5, 5);
		System.out.println("訂位連續三個座位:"+theater.bookSeat(1));
		System.out.println("訂位連續五個座位:"+theater.bookSeat(5));
		System.out.println("訂位某座位:"+theater.bookSeat(2,2));
		System.out.println("訂位某區塊座位:"+theater.bookSeat(0,3,4,4));
		theater.showSeat();
	}
}
