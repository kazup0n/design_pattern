package chapter6;

import org.junit.Test;


public class TestCloneable {

	@Test(expected=CloneNotSupportedException.class)
	public void testIfObjectImplementsCloneable() throws CloneNotSupportedException{
		
		new ObjectChild().createClone();
		
	}
	
	static class ObjectChild{
		void createClone() throws CloneNotSupportedException{ clone();}
	}
	
	
}
