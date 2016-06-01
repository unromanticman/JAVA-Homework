package pack01;

public class TicketCounter {
	
	private static int totalTicket = 100;
	
	public static void add(int tickets){
		totalTicket +=tickets;
	}
	
	public static int subtract(int tickets){
		
		if((totalTicket-tickets) > 0){
			totalTicket -= tickets; 
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void setToZero(){
		totalTicket = 0;
	}
	
}
