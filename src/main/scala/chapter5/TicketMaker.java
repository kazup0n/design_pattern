package chapter5;

public class TicketMaker {

	private int ticket = 1000;
	
	private static final TicketMaker INSTANCE = new TicketMaker();
	
	private TicketMaker(){}
	
	public int getNextTicketNumber() { return ticket++;}

	public static TicketMaker getInstance() {
		return INSTANCE;
	}
	
}
