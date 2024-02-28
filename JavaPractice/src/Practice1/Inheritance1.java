package Practice1;
class Parent1{
	public void test1() {
		System.out.println("Print parent1 class method");
	}
}
class Parent2 extends Parent1{
	public void test2() {
		System.out.println("Print parent2 method");
	}
}

public class Inheritance1 extends Parent2{

	public static void main(String[] args) {
		Inheritance1 obj = new  Inheritance1();
		obj.test1();
		obj.test2();
		obj.test3();
	}
	public void test3() {
		System.out.println("Print the child class methods also");
	}

}
