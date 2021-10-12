package He;

//Student.java

class Parent{
protected void run() {
	System.out.println("Parent method");
}
}
class Child extends Parent{
	public void run() {
		System.out.println(" child method");
	}
}


public class Example {

	public static void main(String[] args) {
		Parent t = new Parent();
		t.run();
		
	}

}

