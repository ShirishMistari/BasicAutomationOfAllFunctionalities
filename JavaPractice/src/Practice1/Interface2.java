package Practice1;
interface II1{
	public void test1();
}
interface II2{
	public void test1();
	public void test2();
}
interface II3{
	public void test2();
	public void test3();
}
 public class Interface2 implements II1, II2, II3 {    // multiple inheritance does not suport java but it supports multiple interface

	public static void main(String[] args) {
		Interface2 obj = new Interface2();
		obj.test1();
		obj.test2();
		obj.test3();
	}
	public void test3() {
		System.out.println("Print test 3");
	}
	public void test2() {
		System.out.println("Print test 2");
	}
	public void test1() {
		System.out.println("Print test 1");
	}

}
