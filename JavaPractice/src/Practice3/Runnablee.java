package Practice3;

public class Runnablee implements Runnable {
	Runnablee(){
		
	}

	public static void main(String[] args) {
		Runnablee oo = new Runnablee();
		Thread j = new Thread(oo);
		System.out.println(Thread.currentThread().getName());
		j.setName("Nulllable");
		j.start();
		j.run();

	}

	
	public void run() {
		
		for(int x=2; x<10; x++) {
			if(x%2==0) { System.out.println("Even Number"); }
			else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  System.out.println("Odd Number"); }
		}
		
	}

}
