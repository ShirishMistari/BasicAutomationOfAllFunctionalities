package Practice1;

public class Class3 {

	public static void main(String[] args) {
		Class3 obj = new Class3();
		obj.addition();
		obj.addition1();
		obj.addition2(120.25f,135.20f);
		obj.addition3(500,600);
		obj.addition4((short)10,(short)20);
		obj.division(120f,100,(short)10,(byte)5);
	}
	public void addition() {
		int a=20, b=25;
		System.out.println("addition of ints: "+(a+b));
	}
	public int addition1() {
		int a= 100, b= 126;
		System.out.println("Additon of int :"+ (a+b));
		return (a+b);
		}
	public int addition2(float a, float b) {
		float sum = a+b;
		System.out.println("addition of float sum :" + sum);
		return (int)(sum);  //Explicit conversion from float to int
	}
	public double addition3(double a, double b) {
		double sum = a+b;
		System.out.println("Addition of double sum :" +sum);
		return (long)(sum);  //Explicit conversion from float to int
	}
	public int addition4(short a, short b) {
		byte sum = (byte)(a+b);   //Explicit conversion from int to short 
		System.out.println("Addition of byte :" +sum);
		return sum;   //implicit conversion from byte to int
		
	}
	public float division(float a, int b, short c, byte d) {
		short sum = (short)(a+b+c+d);  //Explicit conversion
		System.out.println("Addition of mixtures :"+sum);
		return (int)sum;  //implicit
	}

}
