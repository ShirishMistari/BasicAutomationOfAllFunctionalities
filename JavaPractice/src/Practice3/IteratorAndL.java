package Practice3;
import java.util.*;
public class IteratorAndL {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Shirish");
		l.add(12);
		l.add("Nurr");
		l.add('A');
		l.add(true);
		l.add(123);
		l.add(43.5f);
		
		System.out.println("iterate all elements by iterator method");
		Iterator i = l.iterator();
		System.out.println(i);
		System.out.println("Travels in forward direction.....");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ListIterator li = l.listIterator();
		System.out.println(li);
		System.out.println("By using List iterator in forward direction....");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("By using List iterator in backword direction...");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}

}
