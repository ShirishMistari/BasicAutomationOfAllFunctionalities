package Practice1;
class Test {
  private int a=10; int b=12;
  public void test1() {
	  System.out.println("print value of a and b:"+a);
	  System.out.println("Print value of b :"+b);
  }
  public void test2() {
	  System.out.println("Print the test2");
  }
  public void test1(int a, int b) {
	  System.out.println("Print the overloaded method");
  }
  public void test2(int a, int b) {
	  System.out.println("print the overloaded test2");
  }
}
public class Polymorphism3  extends Test{

	public static void main(String[] args) {
		Polymorphism3 obj = new Polymorphism3();
		obj.test1();
		obj.test1(1020,10);
		obj.test2();
		obj.test2(10,20);
	}
	public void test1() {
		System.out.println("Printing the overloaded and overrided test methos");
	}
	public void test2() {
		System.out.println("print the overloaded and overrided test method");
	}

}
