package He;

/*
 * 		Read a text file with employee database and write to other text file by removing records if it has duplicate mail id.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeData1{
	String name;
	int salary;
	String mailid;
	public EmployeeData1(String name,int salary,String mailid ){
		this.name = name;
		this.salary = salary;
		this.mailid = mailid ;
	}
}

// Comparator implementation

class salaryCompare1 implements Comparator<EmployeeData1>{

	@Override
	public int compare(EmployeeData1 e1, EmployeeData1 e2) {
		return e1.salary-e2.salary;
	}
	
}

public class Employee1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\s\\Employee_data1.txt"));
		ArrayList<EmployeeData1> employeeRecords = new ArrayList<>();
		String currentLine = reader.readLine();
		String[] EmployeeDetail;
		List<String> mailidList = new ArrayList<>();
		while(currentLine!=null) {
			EmployeeDetail  = currentLine.split(" "); 
			if(mailidList.contains(EmployeeDetail[2]) == false){
				mailidList.add(EmployeeDetail[2]);
				String name = EmployeeDetail[0];
				float x = Float.parseFloat(EmployeeDetail[1]);
				int salary = (int)x;
				String mailid = EmployeeDetail[2];
				employeeRecords.add(new EmployeeData1(name,salary,mailid));
			}
			currentLine = reader.readLine();
		}
		Collections.sort(employeeRecords,new salaryCompare1());
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\s\\Employee_data1_op.txt"));
		int  x = 1;
		for(EmployeeData1 employee : employeeRecords) {
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
