package Practice3;

class Table {
	synchronized static public void printEvenNumberTable(int x) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
           try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
           }
			System.out.println(i * x);
		}

	}

}

class Th1 implements Runnable {
//	Table a1;
//
//	public Th1(Table a1) {
//		this.a1 = a1;
//	}

	@Override
	public void run() {
		Table.printEvenNumberTable(2);
	}
}

class Th3 implements Runnable {

	Table a3;

	public Th3(Table a3) {
		this.a3 = a3;
	}

	@Override
	public void run() {
		
		Table.printEvenNumberTable(6);
	}
}

class Th4 implements Runnable {
	Table a4;

	public Th4(Table a4) {
		this.a4 = a4;
	}

	@Override
	public void run() {
		Table.printEvenNumberTable(4);
	}
}

class Th2 implements Runnable {
	Table a2;

	public Th2(Table a2) {
		this.a2 = a2;
	}

	@Override
	public void run() {
		
		Table.printEvenNumberTable(8);
	}
}

public class Synchronized1 {
	public static void main(String args[]) {
		//Table t = new Table();  //Assigning two objects
	//	Table tt = new Table();
		
		Th1 t1 = new Th1();
		Thread d1 = new Thread(t1,"Thread-11");  
		System.out.println(Thread.currentThread().getName());


//		Th2 t2 = new Th2(t);
		Thread d2 = new Thread("Thread-12");
		//System.out.println(Thread.currentThread().getName());

		//Th3 t3 = new Th3(tt);
		Thread d3 = new Thread("Thread-13");
		//System.out.println(Thread.currentThread().getName());

		//Th4 t4 = new Th4(tt);
		Thread d4 = new Thread("Thread-14");
		//System.out.println(Thread.currentThread().getName());

		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}
