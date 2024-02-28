package Practice3;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		vector.add("Sonu");
		vector.add(123);
		vector.add(12.4f);
		vector.add('A');
		vector.add("chopda");
		vector.add("Mumbai");
		System.out.println("....Checking...");
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		
		Vector v = new Vector(3);
		System.out.println(".............");
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		v.add(3);
		v.add(55);
		v.add(332);
		v.add("ll;;...");
		v.add(45);
		System.out.println("..Checking....");
		System.out.println(v.capacity()); //Increases capacity by double to its given capacity..
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		
		ArrayList a = new ArrayList(v);
		a.add("ArrayList");
	
		
		Vector l = new Vector(a);
		l.add("ggg");
		l.add(90);
		l.add('A');
		
		Enumeration en = l.elements();
		System.out.println("Enumeration............");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
	}

}
