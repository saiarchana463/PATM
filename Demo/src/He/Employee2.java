package He;

/*
 * 		Read a text file with employee data and write to other text file by removing duplicate records.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class EmployeeData2{
	String name;
	int salary;
	String mailid;
	public EmployeeData2(String name,int salary,String mailid ){
		this.name = name;
		this.salary = salary;
		this.mailid = mailid ;
	}
}

// Comparator implementation

class salaryCompare2 implements Comparator<EmployeeData2>{

	@Override
	public int compare(EmployeeData2 e1, EmployeeData2 e2) {
		return e1.salary-e2.salary;
	}
	
}

public class Employee2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\s\\Employee_data2.txt"));
		ArrayList<EmployeeData2> employeeRecords = new ArrayList<>();
		String currentLine = reader.readLine();
		String[] EmployeeDetail;
		Set<String> set = new HashSet<>();
		while(currentLine!=null) {
			if(set.add(currentLine)) {
			EmployeeDetail  = currentLine.split(" "); 
				String name = EmployeeDetail[0];
				float x = Float.parseFloat(EmployeeDetail[1]);
				int salary = (int)x;
				String mailid = EmployeeDetail[2];
				employeeRecords.add(new EmployeeData2(name,salary,mailid));
				}
			currentLine = reader.readLine();
		}
		Collections.sort(employeeRecords,new salaryCompare2());
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\s\\Employee_data2_op.txt"));
		int  x = 1;
		for(EmployeeData2 employee : employeeRecords) {
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
