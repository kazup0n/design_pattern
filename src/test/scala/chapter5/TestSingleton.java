package chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSingleton {

	@Test
	public void test() {
		assertEquals(Singleton.getInstance(), Singleton.getInstance());
		assertEquals(Singleton.getInstance(), Singleton.getInstance());
		assertEquals(Singleton.getInstance(), Singleton.getInstance());
		assertEquals(Singleton.getInstance(), Singleton.getInstance());
	}

}
