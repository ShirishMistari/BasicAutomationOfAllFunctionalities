package Practice3;
import java.util.*;

class test {
	int id;
	String name;
	String location;
	
	public test(int id, String name, String location) {
		this.id=id;
		this.name= name;
		this.location= location;
	}
	public void show() {
		System.out.println(id+" "+name+" "+location);
	}
	public int hashCode() {  //Overriding this method of object  
		return id;
	}
	public boolean equals(Object o) {    //Overriding this method of hasSet add method Internaly
		test k = (test)o;
		if(this.id==k.id) 
			return true;
		else 
			return false;
	}
	public String toString() {
		return id+name+location;
	}
}
public class HashSetDemo1 {

	public static void main(String[] args) {
		test t = new test(1000,"Shirish","pune"); //same element
		test t1 = new test(3000,"Krishna","Indore");
		test t4 = new test(3000,"Krishna","Indore");
		test t2 = new test(4000,"Avinash","Dhule");
		test t3 = new test(1000,"Shirish","pune"); //same element
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		Set<test> s = new HashSet<test>();
		s.add(t);
		s.add(t1);
		s.add(t2);
		s.add(t3);
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			test o = (test)it.next();
			o.show();
		}
		
	}

}
