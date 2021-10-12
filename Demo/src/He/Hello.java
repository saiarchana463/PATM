package He;

class Phone{
	String call = "yes";
	void call() {
		 System.out.println("calling...");
	}
}
class SmartPhone extends Phone {
	 String call = "no";
	 String music = "yes";
	 void call() {
		 System.out.println("smartphone calling...");
	 }
	 void music() {
		 System.out.println("playing...");
	 }
	
 }

public class Hello {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();		// can access all members and methods of parent and child
		System.out.println(sp.call);
		System.out.println(sp.music);
		sp.call();
		sp.music();
		
		Phone p = new Phone();
		System.out.println(p.call);
		//System.out.println(p.music);			// can't access child class methods ,bcz memory and reference is of type parent
		p.call();
		//p.music();							// can't access child class methods ,bcz memory and reference is of type parent
		
		Phone pss = new SmartPhone();
		System.out.println(pss.call);			// parent reference can access CALL member , because it is inherited from parent class
		//System.out.println(pss.music); 		// parent reference can't access extra members of child
		pss.call();								// parent reference can access CALL method , bcz it is inherited from parent class and overridden by subclass
		//pss.music();							//parent reference can't access extra methods in child class
		
		// SmartPhone spp = new Phone();   		// we can't allocate parent memory to child 



	}

}
