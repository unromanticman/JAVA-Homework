package pack01;

public class Buyer {
	
	public int buyTicket(int tickets){
		return TicketCounter.subtract(tickets);
	}
	
	public void returnTicket(int tickets){
		TicketCounter.add(tickets);
	}
	
	
}
