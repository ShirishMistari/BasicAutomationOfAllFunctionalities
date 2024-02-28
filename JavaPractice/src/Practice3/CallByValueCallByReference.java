package Practice3;

public class CallByValueCallByReference {
	static int x=500;
	public static void main(String[] args) {
		System.out.println("***************Call By Value.......& Call By Reference....");
		CallByValueCallByReference b = new CallByValueCallByReference();
		System.out.println("Before changes x :"+x);
		test(200);
		System.out.println("After changes x :"+x);
		
		test1(b);
		System.out.println(x);
	}
	public static void test(int y) {
		 x= x+y;
	}
	public static void test1(CallByValueCallByReference t) {
		x = t.x+30;
	}

}
