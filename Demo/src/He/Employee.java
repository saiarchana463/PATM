package He;
/*
 * Read a text file with employee data and sort them according to salary and write to other file
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeData{
	String name;
	int salary;
	String mailid;
	public EmployeeData(String name,int salary,String mailid ){
		this.name = name;
		this.salary = salary;
		this.mailid = mailid ;
	}
}

// Comparator implementation

class salaryCompare implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.salary - e2.salary;
	}
	
}

public class Employee {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\s\\employee_data.txt"));
		ArrayList<EmployeeData> employeeRecords = new ArrayList<>();
		String currentLine = reader.readLine();
		String[] employeeDetail;
		String name,mailid;
		float x;
		int salary;
		while(currentLine!=null) {
			employeeDetail  = currentLine.split(" "); 
			name = employeeDetail[0];
			x = Float.parseFloat(employeeDetail[1]);
			salary = (int)x;
			mailid = employeeDetail[2];
			employeeRecords.add(new EmployeeData(name,salary,mailid));    
			currentLine = reader.readLine();
		}
		Collections.sort(employeeRecords,new salaryCompare());
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\s\\employee_data_op.txt"));
		for(EmployeeData employee : employeeRecords) {
			writer.write(employee.name);
			writer.write(" "+employee.salary);
			writer.write(" "+employee.mailid);
			writer.newLine();
		}
		reader.close();
		writer.close();
	}

}
