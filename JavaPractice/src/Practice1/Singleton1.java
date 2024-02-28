package Practice1;

class parr{
	int i = 50;
	private parr() {
		
	}
	public static parr returnclassObject() {
		parr p = new parr();
		return p;
	}
	public int addition() {
		int a=50, b=100;
		int sum = a+b;
		System.out.println("The sum of a and b :"+sum);
		return sum;
	}
}
public class Singleton1 {

	public static void main(String[] args) {
		// parr obj = new parr();  cant create because of private cunstructor
		parr obj = parr.returnclassObject();
		System.out.println(obj.i);
		obj.i=500;
		System.out.println(obj.i);
		obj.i=1000;
		System.out.println(obj.i);
		parr obj1 = parr.returnclassObject();
		System.out.println(obj1.i);            //we can create multiple objects
	}
 }
