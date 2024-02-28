package Practice1;

public class Class2 {

	public static void main(String[] args) {
		Class2 obj = new Class2();
		Class1 obj1 = new Class1();          //Class1 object calling methods from another class
		obj1.Test1(100,200);
		obj.Test2((float)120.24,(float)90.87);
		obj.Test3((short)10,(short)20);
		obj.Test4(250,25);

	}
	
	public float Test2(float a, float b) {
		System.out.println("Float A" + a);
		System.out.println("Float B" +b);
		float sub= (a-b);
		System.out.println(sub);
		return sub;
	}
	public short Test3(short a, short b) {
		System.out.println("Short A" +a);
		System.out.println("Short B" +b);
		short mul=  (short)(a*b);
		System.out.println(mul);
		return mul;
	}
	public double Test4(double a, double b) {
		System.out.println("Double A" +a);
		System.out.println("Double B" +b);
		Double div= (a/b);
		System.out.println(div);
		return div;
	}

}
