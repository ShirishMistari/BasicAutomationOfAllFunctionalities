package Practice3;
import java.util.*;
public class linkedListt {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("one");
		ll.add("Two");
		ll.add("Three");
		ll.add("four");
		ll.add("Five");
		
		System.out.println(ll.peek()); // returns topmost element 
		System.out.println(ll.pop());  //returns topmost as well as deletes element from stack
		System.out.println(ll.peek()); // Now two is return which is topmost
	}

}
