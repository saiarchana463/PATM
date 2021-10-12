package classLoaders;

import java.util.ArrayList;

import com.sun.javafx.binding.Logging;
/**
 * 
 * @author savant
 *
 *	Types of built-in class loaders
 */

/*
 * The application class loader loads the class where the example method is contained. An application or system class loader loads our own files in the classpath.
	Next, the extension one loads the Logging class. Extension class loaders load classes that are an extension of the standard core Java classes.
	Finally, the bootstrap one loads the ArrayList class. A bootstrap or primordial class loader is the parent of all the others.
	However, we can see that the last out, for the ArrayList it displays null in the output. This is because the bootstrap class loader is written in native code, not Java – 
	so it doesn't show up as a Java class.Due to this reason, the behavior of the bootstrap class loader will differ across JVMs.
 */
public class PrintClassLoaders {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("classloader of this class:"+PrintClassLoaders.class.getClassLoader());
		 System.out.println("classloader of logging:"+Logging.class.getClassLoader());
		 System.out.println("classloader of ArrayList:"+ArrayList.class.getClassLoader());
	}

}
