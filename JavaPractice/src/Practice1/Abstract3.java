package Practice1;
abstract class Bike{
	public void T1() {
		System.out.println("The bike is started");
	}
	abstract public void T2();
	abstract public void T3();
	public void T4(int B) {
		System.out.println("The value of Bike B :"+B);
	}
}
class Honda extends Bike{
	public void T2() {
		System.out.println("The Model of bike is new Honda 2022");
	}
	public void T3() {
		System.out.println("The Name of Bike is Unicorn Honda");
	}
}
public class Abstract3 {

	public static void main(String[] args) {
		Bike o;
		o=new Honda();
		o.T1();
		o.T2();
		o.T3();
		o.T4(250000);
	}

}
