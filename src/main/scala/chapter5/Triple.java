package chapter5;

public class Triple {

	public static enum Number{
		ONE(new Triple()),TWO(new Triple()),THREE(new Triple());
		
		private Number(Triple t){ instance = t;}
		
		private Triple instance;
		Triple getInstance(){
			return instance;
		}
	}
	
	public static Triple getInstance(Number num){
		return num.getInstance();
	}
	
}
