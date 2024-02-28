package Practice1;
class P1{
	public P1() {
		System.out.println("Parent 1 method");
	}
}
class P2 extends P1{
	public P2() {
		System.out.println("Parent 2 method");
	}
}
class P3 extends P2{
	public P3() {
		System.out.println("Parent 3 method");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		P3 obj = new P3();     // custroctor chaining through inheritance
	}

}
