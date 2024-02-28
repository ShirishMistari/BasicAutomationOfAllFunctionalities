package Practice1;
class Encc{
	private int a, b;
	public void setA(int x) {
		 a = x;
	}
	public int getA() {
		return a;
    }
	public void setB(int y) {
		 b= y;
	}
	public int getB() {
		return b;
	}
}
public class Encapsulation2 {

	public static void main(String[] args) {
		Encc obj = new Encc();
		obj.setA(120);
		System.out.println("Value of a :"+obj.getA());
		obj.setB(150);
		System.out.println("Value of b :"+obj.getB());
		obj.setA(200);
		System.out.println("New Value of A :"+obj.getA());
		

	}

}
