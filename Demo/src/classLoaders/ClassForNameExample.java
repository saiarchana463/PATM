package classLoaders;

import java.lang.reflect.*;

public class ClassForNameExample {
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("java.lang.String");
			System.out.println("class Name : "+cls.getName());
			System.out.println("pacakage name : "+cls.getPackage());
			Method[] methods = cls.getDeclaredMethods();
			System.out.println("----methods of string class----");
			for(Method method: methods)
				System.out.println(method.getName());
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

}
