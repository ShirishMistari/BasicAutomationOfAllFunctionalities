package Practice3;
import java.util.*;
import java.util.concurrent.*;
public class FailsafeFailFast {

	public static void main(String[] args) {
	//	Map<String, String> m = new HashMap<String, String>();  // Cant do read as well as write operation called fail fast
		Map<String, String> m1 = new ConcurrentHashMap<String, String>();  // Can do read as well as write operation called fail Safe 
		
		m1.put("Name1","Pune1");  //read Operation
		m1.put("Name2","Pune2");
		
		Set s = m1.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry t = (Map.Entry)it.next();
			m1.put("Name3","Pune3");   // throws java.util.ConcurrentModificationException due to write operation
			//By using concurrentHashMap it will not throw exception called fast safe.
			System.out.println(t.getKey()+" "+t.getValue());
		}
		
	}

}
