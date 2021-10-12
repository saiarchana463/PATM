package singleton;

public class LazySingleton {
	
	private static LazySingleton l;
	private LazySingleton() {
		
	}
	public LazySingleton getInstance() {
		if(l == null) {
			synchronized(LazySingleton.class){
				l = new LazySingleton();
			}
		}
		return l;
	}
	

}
