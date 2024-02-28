package Practice3;

public class StrinDemo1 {

	public static void main(String[] args) {
		String a1 = "JavaStrings";
		String a2 = "JavaStrings";
		System.out.println("Before modification...");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		test(a1,a2);
		System.out.println("After modification....");
		a1=a1.concat("Objects");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		test(a1,a2);
		
		
	}
	public static void test(String s1,String s2) {
		if(s1.equals(s2)) {
			System.out.println("String object memory are same");
		}else {
			System.out.println("String object memory are different");
		}
	}

}
