package chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketMakerTest {

	@Test
	public void testSingleton() {
		
		assertEquals(TicketMaker.getInstance(), TicketMaker.getInstance());
		final int firstNumber = TicketMaker.getInstance().getNextTicketNumber();
		assertEquals(TicketMaker.getInstance().getNextTicketNumber(), firstNumber+1);
		assertEquals(TicketMaker.getInstance().getNextTicketNumber(), firstNumber+2);
	}

}
