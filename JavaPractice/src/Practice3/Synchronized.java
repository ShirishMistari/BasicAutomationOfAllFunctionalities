package Practice3;
class commonTaskTable {
	synchronized static public void printTable(int x) { // Threads in sequencial manner. It asks thread whether it has lock or not
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i*x);
		}
	}
}
class Thread1 implements Runnable {
	commonTaskTable t1;
	public Thread1(commonTaskTable t1) {
		this.t1 = t1;
	}
	@Override
	public void run() {
		t1.printTable(4);
	}
	
}
class Thread2 implements Runnable {
	commonTaskTable t2;
	public Thread2(commonTaskTable t2) {
		this.t2 = t2;
	}
	@Override
	public void run() {
		t2.printTable(8);
	}
	
}
class Thread3 implements Runnable {
	commonTaskTable t3;
	public Thread3(commonTaskTable t3) {
		this.t3 = t3;
	}
	@Override
	public void run() {
		t3.printTable(10);
	}
	
}
public class Synchronized {

	public static void main(String[] args) {
		commonTaskTable t = new commonTaskTable();
		Thread1 t1 = new Thread1(t);
		
		Thread t11 = new Thread(t1, "Thread-ONE");
		System.out.println(Thread.currentThread().getName());
		
		Thread2 t2 = new Thread2(t);
		Thread t12 = new Thread(t2,"Thread-TWO");
		
		
		Thread3 t3 = new Thread3(t);
		Thread t13 = new Thread(t3,"Thread-THREE");
		
		
		t11.start();
		t12.start();
		t13.start();
		
		
		
	}

}
