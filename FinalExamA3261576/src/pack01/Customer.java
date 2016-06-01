package pack01;

public class Customer extends pack01.Buyer implements pack01.IEmpty {
	
	public void reset(){
		TicketCounter.setToZero();
	}
}
