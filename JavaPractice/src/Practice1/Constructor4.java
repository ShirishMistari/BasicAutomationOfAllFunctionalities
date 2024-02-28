package Practice1;
interface Inte{
	public void test1();
	public void test2();
	public void test3();
	public void test4();
}
interface Inte1 extends Inte{
	public void test5();
	public void test6();
}
class Subclass implements Inte, Inte1{
	public void test1() {
		System.out.println("Print test1");
	}
	public void test2() {
		System.out.println("Print test2");
	}
	public void test3() {
		System.out.println("print test3");
	}
	public void test4() {
		System.out.println("Print test4");
	}
	public void test5() {
		System.out.println("Print test5");
	}
	public void test6() {
		System.out.println("Print test6");
	}
	
}
public class Constructor4 extends Subclass {
	public static void main(String[] args) {
		Constructor4 obj = new Constructor4();
		Constructor4 obj1 = new Constructor4(10,20);
		Constructor4 obj2 = new Constructor4(true);
		Constructor4 obj3 = new Constructor4(100.0f,50.0f,(short)(10));
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
		
	}
	public Constructor4() {
		System.out.println("Default Constructor to be call");
	}
	public Constructor4(int a, int b) {
		int sum= a+b;
		System.out.println("Sum of a and b :"+sum);
	}
	public Constructor4(boolean b) {
		System.out.println("Print boolean :"+b);
	}
	public Constructor4(float a, float b, short c) {
		int sub = (int)(a)+(int)(b)+c;
		System.out.println("Print the sub :"+sub);
	}

}
