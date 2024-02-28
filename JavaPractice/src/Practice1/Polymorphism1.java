package Practice1;
//Method overloading/compile time polymorphism
public class Polymorphism1 {

	public static void main(String[] args) {
		Polymorphism1 obj = new Polymorphism1();
		obj.addition();
		obj.addition(20,40);
		obj.addition(150,200);
		obj.addition(500,200);
		obj.addition(10,20,30);
		obj.addition(10,(short)20,(byte)30,40,50);

	}
	public void addition() {
		int a=10; int b=15;
		int sum = a+b;
		System.out.println("Addition of a and b :"+sum);
	}
	public int addition(int a, int b) {
		byte sum= (byte)(a+b);
		System.out.println("Byte sum of a and b :"+sum);
		return sum;
	}
	public void addition(short a, short b) {
		float sub= a-b;
		System.out.println("Substraction of a and b :"+sub);
	}
    public short addition(int a, int b,int c) {
    	short mul = (short)(a*b*c);
    	System.out.println("Multiplication of a and b :"+mul);
    	return mul;
    }
    public float addition(long a,long b) {
    	long sum = a+b;
    	System.out.println("addition of long a and b"+sum);
    	return sum;
    }
    public void addition(int a, short b, byte c, float d, long e) {
    	double sum= (a+b+c+d+e);
    	System.out.println("addition of int, short byte and float long :"+sum);
    }
}
