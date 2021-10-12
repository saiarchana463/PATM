package singleton;

public class EarlySingleton {
	
	private static EarlySingleton e = new EarlySingleton();
	private EarlySingleton() {
		
	}
	public EarlySingleton getInstance() {
		 return e;
	}

}
