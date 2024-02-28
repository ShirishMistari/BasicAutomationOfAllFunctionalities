package Practice2;

public class ReturnType {

	public static void main(String[] args) {
		name("Shirish");
	}
	public void Test1() {
		System.out.println("My friend is Sourabh");
	}
	public int sum() {
		long a =1000;
		long b=500;
		int sum1 = (int)(a+b);
		System.out.println(sum1);
		return sum1;
	}
	public static String name(String myname) {
		System.out.println(myname);
		return myname;
	}

}
