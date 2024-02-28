package Practice2;

public class BasicJava1 extends BasicJava2 {

	public static void main(String[] args) {
	}
	int a;
	public BasicJava1(int a) {  //Parameterized Constructor
		super();
		this.a = a;  // value of a will store in this a;
	}
	public int Test1() {
		a = a+1;
		return a;
	}
	public int Test2() {
		a = a-1;
		return a;
	}

}
