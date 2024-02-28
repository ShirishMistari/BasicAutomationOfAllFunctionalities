package Practice3;

import java.util.ArrayList;
import java.util.Iterator;

class EmployeesData {
	String employeeName;
	int employeeRollNumber;
	String employeeLocation;
	
	public EmployeesData(String employeeName, int employeeRollNumber, String employeeLocation) {
		this.employeeName = employeeName;
		this.employeeRollNumber = employeeRollNumber;
		this.employeeLocation = employeeLocation;
	}
	public String toString() {  // Overriding 2 String method
		return employeeName+" "+employeeRollNumber+" "+employeeLocation;
	}
}
public class ArrayL extends EmployeesData {
	
	public ArrayL(String employeeName, int employeeRollNumber, String employeeLocation) {
		super(employeeName, employeeRollNumber, employeeLocation);
	}

	/*
	 * public ArrayList() { super(); }
	 */
	public static void main(String[] args) {
		ArrayList<EmployeesData> ar = new ArrayList<EmployeesData>();
		ArrayL e1 = new ArrayL("Shirish", 243,"Vadodara");
		ArrayL e2 = new ArrayL("Vinayak", 323,"Pune");
		ArrayL e3 = new ArrayL("Shirish", 233,"Solapur");
		ar.add(e1); ar.add(e2); ar.add(e3);
		System.out.println(ar);
		Iterator<EmployeesData> i = ar.iterator();
		while(i.hasNext()) {
			EmployeesData o = (EmployeesData)i.next();
			System.out.println(o);
		}
		
	}

}
