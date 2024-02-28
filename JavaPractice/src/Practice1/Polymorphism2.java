package Practice1;
//Method overriding/Runtime polymorphism
class test1{
	public void Test1() {
		System.out.println("Print the test method");
	}
	public void test2() {
		System.out.println("Print the test 2 method");
		
;	}
	public void test3() {
		System.out.println("print the test 3 method ");
	}
	public int addition(int a, int b) {
		int sum= a+b;
		System.out.println("Print the sum of a and b :"+sum);
		return sum;
	}
	public int substraction(short a, short b) {
		short substra= (short)(a-b);
		System.out.println("print the substraction of a and b :"+substra);
		return substra;
	}
	public short multiplication(int a, int b) {
		int mult= a*b;
		System.out.println("print the multiplication of a and b :"+mult);
		return (short)mult;
	}
	public float division(long a, long b) {
		long divi=a/b;
		System.out.println("Print the division of a and b :"+divi);
		return divi;
	}
}
public class Polymorphism2 extends test1 {

	public static void main(String[] args) {
		Polymorphism2 obj1 = new Polymorphism2();
		test1 obj = new test1();
		obj.Test1();
		obj.test2();
		obj.test3();
		obj.addition(10,25);
		obj.substraction((short)70,(short)20);
		obj.multiplication(20,20);
		obj.division(120,12);
		System.out.println("********Overrided********");
		obj1.Test1();
		obj1.test2();
		obj.test3();
		obj1.addition(20,25);
		obj1.substraction((short)25,(short)5);
		obj1.division(200,10);
		
	}
	//Overriding the methods;
	
	public void Test1() {
		System.out.println("Printing the overrided method");
	}
	public void test2() {
		System.out.println("Printing the overrided method test2");
	}
	public void test3() {
		System.out.println("Printing the overrided test3 method");
	}
	public int addition(int a, int b) {
		int sum= a+b;
		System.out.println("Print the overrided addition :"+sum);
		return sum;
	}
	public int substraction(short a, short b) {
		short substra = (short)(a-b);
		System.out.println("Print the overrided substarction :"+substra);
		return substra;
	}
	public short multiplication(int a, int b) {
		int mult=a*b;
		System.out.println("Print overrided multiplication :"+mult);
		return (short)mult;
	}

}
