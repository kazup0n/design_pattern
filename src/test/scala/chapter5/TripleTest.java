package chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripleTest {

	@Test
	public void test() {
		
		Triple one = Triple.getInstance(Triple.Number.ONE);
		assertEquals(one, Triple.getInstance(Triple.Number.ONE));
		
		Triple two = Triple.getInstance(Triple.Number.TWO);
		assertEquals(two, Triple.getInstance(Triple.Number.TWO));

		Triple three = Triple.getInstance(Triple.Number.THREE);
		assertEquals(three,Triple.getInstance(Triple.Number.THREE));
		
		assertNotSame(one, two);
		assertNotSame(one, three);
		assertNotSame(two, three);
	}

}
