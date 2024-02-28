package Practice3;
import java.util.*;
import java.util.concurrent.*;
public class ThreadSafe1 extends Thread {

	//static ArrayList arraylist = new ArrayList(); //Not thread safe but faster for HashMap Also
	static CopyOnWriteArrayList arraylist = new CopyOnWriteArrayList();  //Will not throw concurrentModificationException (Thread safe) but slow
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Entries....");
		arraylist.add("12");
		arraylist.add(24);
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		arraylist.add("Shirish");
		arraylist.add("20");
		ThreadSafe1 t = new ThreadSafe1();
		t.setName("ShirishThread..");
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		Iterator i = arraylist.iterator();
		System.out.println("Entries....");
		while(i.hasNext()) {
			System.out.println(i.next());
			
			try {   //Throw concurrentModification Exception.
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(arraylist);
	}

}
