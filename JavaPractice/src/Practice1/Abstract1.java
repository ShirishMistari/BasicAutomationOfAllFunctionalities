package Practice1;


abstract class Testing1{
	abstract public void test1();
	abstract public void test2();
	public void test3() {
		System.out.println("Print the test3 defined method");
	}
	abstract public void test4();
}

public class Abstract1 extends Testing1 {

	public static void main(String[] args) {
	    Abstract1 obj = new Abstract1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		// HashMap<String, String> mm = new HashMap<String, String>();
		
	}
	public void test1() {
		System.out.println("Abstract test1");
	}
	public void test2() {
		System.out.println("Abstract test2");
	}
	public void test4() {
	   System.out.println("Abstract test4");
	}

}
