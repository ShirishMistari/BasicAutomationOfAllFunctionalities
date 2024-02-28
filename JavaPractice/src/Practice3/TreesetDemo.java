package Practice3;
import java.util.*;
class Employee implements Comparable {  //Class has to implement comparable interface
	String name, location;
	int rollNo;
	public Employee(String name, String location, int rollNo) {
		this.name = name;
		this.location = location;
		this.rollNo = rollNo;
	}
	public String toString() {
		return name+" "+location+" "+rollNo;
	}
	@Override
	public int compareTo(Object o) {
		Employee l = (Employee)o;
//		if(this.rollNo>l.rollNo) 
//		 return 1;
//		 else if(this.rollNo<l.rollNo)
//			 return -1;
		return this.name.compareToIgnoreCase(l.name);
		//return 0;
}
}

public class TreesetDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Shirish","Pune",100);
		Employee e2 = new Employee("Dhiraj","Nashik",16);
		Employee e3 = new Employee("Aalpesh","Surat",32);
		Employee e4 = new Employee("Govind","Chopda",102);
		Employee e5 = new Employee("Vinayak","Dhule",4);
		TreeSet tt = new TreeSet();
		tt.add(e1);
		tt.add(e2);
		tt.add(e3);
		tt.add(e4);
		tt.add(e5);
		System.out.println(tt);
		/*
		 * Iterator it = tt.iterator(); while(it.hasNext()){
		 * 
		 * }
		 */
		/*
		 * tt.add("Shirish"); tt.add("Hljl"); tt.add("Chopda"); tt.add("Harshal");
		 * tt.add("Zebra"); tt.add("Aatish"); //TreeSet confused which class method has
		 * to call either Integer or String ? tt.add(22); //Will occur
		 * ClassCastException tt.add(87);
		 */
	     
	     
	}	
	}


