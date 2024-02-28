package Practice3;

class T1 {
	public static String name;
	public static int flag=0;
	public synchronized void Test1(int x) {
		
		if(flag==0) {
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

	public synchronized int Test2() {
       String name = "Shirish";
       if(name.length()<=10 && flag==0) {
    	   for(int i=name.length()-1; i>=0; i--) {
        	   System.out.print(name.toUpperCase().charAt(i));
        	   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           }
    	   System.out.println();
       }
      
       return flag=1;
  }

	public synchronized void Test3() {
	for(int i=10; i>=0; i--) {
		  try {
	   			wait();
	   			notify();
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		}
		 
		if(flag==1) {
			System.out.println(i);
		}
	}

	}
}
class T2 implements Runnable {
	T1 h;
	public T2(T1 h) {
		this.h=h;
	}
	@Override
	public void run() {
		//h.Test1(12);
		h.Test2();
		h.Test3();
	}
}
class T3 implements Runnable {
	T1 h;
	public T3(T1 h) {
		this.h=h;
	}
	@Override
	public void run() {
		//h.Test1(10);
		h.Test2();
		h.Test3();
	}
}
class T4 implements Runnable {
	T1 h;
	public T4(T1 h) {
		this.h=h;
	}
	@Override
	public void run() {
		//h.Test1(5);
		h.Test2();
		h.Test3();
	}
}

public class Synchronized2 {

	public static void main(String[] args) {
      T1 n = new T1();
      
      T2 l1 = new T2(n);
      Thread m = new Thread(l1);
      
      T3 l3 = new T3(n);
      Thread m1 = new Thread(l3);
      
      T4 l4 = new T4(n);
      Thread m2 = new Thread(l4);
      
      m.start(); 
      m1.start();
      m2.start();
	}
}
