package Practice3;

public class Threadds extends Thread {
	public Threadds(String string) {
		super();  //caling custructor of thread class(Child to parent)
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
   }
	public void run(int a) {
		
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // Executes first Main Thread After that all child thread
		Threadds f1 = new Threadds("One");
		//f1.setName("Thread1");  //We can set thread by 2 ways- 1] By setName method & 2] By cunstructor calling of thread class;
		//f1.start();
		f1.run();

		Threadds f2 = new Threadds("Two");
		//f2.setName("Thread2");
		//f2.start();
		f2.run();

	}

}
