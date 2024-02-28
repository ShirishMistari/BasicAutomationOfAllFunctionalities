package Practice1;

public class Constructor1 {

	public void Test1(int a) {
	   System.out.println("Print a :"+a);
	}

	public Constructor1() {
		System.out.println("Default constructor");
	}
	public Constructor1(int a) {
		System.out.println("Print parameterized consructor a :"+a);
	}
	public Constructor1(float a, float b) {
		System.out.println("Print sume :"+(a+b));
	}
	public Constructor1(boolean a) {
		System.out.println("Print the boolean :"+a);
	}
	public static void main(String[] args) {
		Constructor1 obj = new Constructor1();
		Constructor1 obj1 = new Constructor1(10);
		Constructor1 obj2 = new Constructor1(12,15);
		Constructor1 obj3 = new Constructor1(true);
		obj.Test1(15);
		
	}
}
