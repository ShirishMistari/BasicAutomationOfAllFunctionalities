package Practice2;
class parent1 {
	int x=200;
	String myName = "Shirish";
	void Test1() {
		System.out.println("************");
		System.out.println("Value of x from P1 :"+x);
		System.out.println("My name is from P1 :"+myName);
	}
}
class parent2 extends parent1{
	int x=211;
	String myName = "Dhanraj";
	void Test2() {
		System.out.println("************");
		System.out.println("Value of x from P2 :"+x);
		System.out.println("My name is from P2 :"+myName);
	}
}
class parent3 extends parent2 {
	int x=300;
	String myName = "Sourabh";
	void Test3() {
		System.out.println("************");
		System.out.println("Value of x from P3 :"+x);
		System.out.println("My name is from P3 :"+myName);
	}
}
class parent4 extends parent3 {
	int x=500;
	String myName = "Kailash";
	void Test4() {
		System.out.println("************");
		System.out.println("Value of x from P4 :"+x);
		System.out.println("My name is from P4 :"+myName);
	}
}
public class UpcastingWithInheritance extends parent4 {   // This is the child class

	int x = 178;
	String myName = "Shailesh";
	void Test(parent4 t4, parent3 t3, parent2 t2, parent1 t1) {
		System.out.println(super.x);  // we are calling values from parent4 wich is base class from child
		System.out.println(super.myName);
		
		//calling child class values
		System.out.println(x);
		System.out.println(myName);
		
		//If we dont want to use super and want to call all value from all parent classes then we can achieve it by upcasting
		//calling all parent class values with the help of upcasting..
		t1.Test1();
		t2.Test2();
		t3.Test3();
		t4.Test4();
		
		
	}
	public static void main(String[] args) {
		UpcastingWithInheritance t = new UpcastingWithInheritance();
		t.Test(t,t,t,t);
		/*
		 childClass obj = new childClass();
		 parentClass obj1 = obj;   ...UPCASTING
		 */
	}
	

}
