package Practice1;
class R1{           // By default extends object class - By defaut hidden
	public R1() {
		System.out.println("Default R1 constructor");
	}
	public R1(String str) {
		System.out.println("Print the name of constructor : "+str);
	}
}
class R2 extends R1{
	public R2() {
		super("Parameterised constructor");     // Supper()- Bydefault hidden
		System.out.println("R2 method");
	}
}
class R3 extends R2{
	public R3() {    //Supper()- Bydefault hidden
		System.out.println("R3 method");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
	  new R3();
	}

}
