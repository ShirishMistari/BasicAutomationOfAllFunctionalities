package Practice1;
class Enc{
	private int a=10, b=20;
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Enc obj = new Enc();
		int a=obj.getA();
		int b=obj.getB();
		int sum= obj.getA()+obj.getB();
		System.out.println("Get A:"+obj.getA());
		System.out.println("Get B:"+obj.getB());
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("Sum of a and b:"+sum);

	}

}
