package chapter5;

public class Singleton {

	private static final Singleton INSTANCE = new Singleton();
	
	public static Singleton getInstance(){ return INSTANCE;}
	
	private Singleton(){}
}
