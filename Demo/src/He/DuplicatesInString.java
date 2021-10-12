package He;

//import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
//import java.util.Collections;
import java.util.*; 

public class DuplicatesInString {

	public static void main(String[] args) {
		
		System.out.println("dupliacte words in string");
		// Print duplicate words in string
		String s = "java python java c c++ c";
		String[] ss = s.split(" ");

		Map<String,Integer> m =new HashMap<>();
		
		for(int i =0;i<ss.length;i++) {
			if(!m.containsKey(ss[i])) 
				m.put(ss[i], 1);
			else {
				Integer x = m.get(ss[i])+1;
				m.put(ss[i], x);
			}
			
		}
		System.out.println(m);
	for(Map.Entry<String,Integer> j : m.entrySet()) {
		if(j.getValue()>1)
			System.out.println(j.getKey());
	}		
	
	System.out.println();
	System.out.println("duplicate characters in string - count of characters in string");
	//print duplicate characters in string    - print count of each character in string
	String s1 = "Archana";
	Map<Character,Integer> m1 = new HashMap<>();
	for(int i1 = 0;i1<s1.length();i1++) {
		if(!m1.containsKey(s1.charAt(i1)))
			m1.put(s1.charAt(i1), 1);
		else {
			Integer x = m1.get(s1.charAt(i1));
			m1.put(s1.charAt(i1), x+1);
		}
	}
	System.out.println(m1);
	for(Map.Entry<Character,Integer> j1 : m1.entrySet()) {
		if(j1.getValue()>1)
			System.out.println(j1.getKey());
	}
	
	System.out.println();
	System.out.println("count of words in string");
	//print number of words in string
	String s2 = "java development interns ";
	System.out.println(s2.split(" ").length);
	
	System.out.println();
	System.out.println("reverse string");
	//reverse string
	StringBuffer sb = new StringBuffer(s2);
	System.out.println(sb.reverse());
	
	for(int i2 = s2.length()-1;i2>=0;i2--)
		System.out.print(s2.charAt(i2));
	System.out.println();
	
	char[] c = s2.toCharArray();
	char t = ' ';
	for(int i2 = 0;i2<c.length/2;i2++) {
		t = c[i2];
		c[i2] = c[c.length-i2-1];
		c[c.length-i2-1] = t;
	}
	for(char i2 : c)
		System.out.print(i2);
	System.out.println(String.valueOf(c));
	
	System.out.println();
	//removing duplicates in array
	int[] a = {1,2,3,4,5,6,1,2,3};
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	for(int i3=0;i3<a.length;i3++)
		lhs.add(a[i3]);
	System.out.println("removing duplicates : "+lhs);
	
	// ascending sort
	Arrays.sort(a);
	System.out.println("ascending sort : "+Arrays.toString(a));
	//int[] b = {1,2,3,4,5,6,7};
	
	
	
	}

}
