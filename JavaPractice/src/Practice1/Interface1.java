package Practice1;
interface I1{
	public void Ii();
	public void Ii1();
	public void Ii2();
	
}
interface I2 extends I1{
	public void Ii3();
	public void Ii4();
}
public class Interface1 implements I2 {

	public static void main(String[] args) {
		Interface1 obj = new Interface1();
		obj.Ii();  obj.Ii1();
		obj.Ii2(); obj.Ii3();
		obj.Ii4(); obj.test();
	}
	public void Ii() {
		System.out.println("Interface method");
	}
	public void Ii1() {
		System.out.println("Interface1 method");
	}
	public void Ii2() {
		System.out.println("Interface2 method");
	}
	public void Ii3() {
		System.out.println("Interface3 method");
	}
	public void Ii4() {
		System.out.println("Interface4 method");
	}
	public void test() {
		System.out.println("The child class method");
	}

}
