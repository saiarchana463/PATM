package He;

	/* 
	 *  Read text file with employee data and write into other file by eliminating duplicate records
	 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

	// Comparable implementation

class EmployeeData3 {
	String name;
	int salary;
	String mailid;
	public EmployeeData3(String name,int salary,String mailid ){
		this.name = name;
		this.salary = salary;
		this.mailid = mailid ;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+salary;
		result = prime*result;
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		EmployeeData3 other = (EmployeeData3)obj;
		if(salary != other.salary)
			return false;
		if(name == null) {
			if(other.name!=null)
				return false;
		}
		else if(!name.equals(other.name))
			return false;
		if(mailid == null) {
			if(other.mailid!=null)
				return false;
		}
		else if(!mailid.equals(other.mailid))
			return false;
		return true;
	 }
	
}

public class Employee3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\s\\Employee_data2.txt"));
		Set<EmployeeData3> employeeRecords = new HashSet<>();
		String currentLine = reader.readLine();
		String[] EmployeeDetail;
		while(currentLine!=null) {
			EmployeeDetail  = currentLine.split(" "); 
				String name = EmployeeDetail[0];
				float x = Float.parseFloat(EmployeeDetail[1]);
				int salary = (int)x;
				String mailid = EmployeeDetail[2];
				employeeRecords.add(new EmployeeData3(name,salary,mailid));
			currentLine = reader.readLine();
		}
		System.out.println(employeeRecords);
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\s\\Employee_data2_op.txt"));
		int  x = 1;
		for(EmployeeData3 employee : employeeRecords) {
			writer.write(" "+x++);
			writer.write(" "+employee.name);
			writer.write(" "+employee.salary);
			writer.write(" "+employee.mailid);
			writer.newLine();
		}
		reader.close();
		writer.close();
	}

}
