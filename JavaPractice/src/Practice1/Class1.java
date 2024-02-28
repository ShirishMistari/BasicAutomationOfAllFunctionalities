package Practice1;

public class Class1 {

	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.Test1(10,5);
		
		//stem.out.println("Print the sum of a and b"+ obj.Test1());

	}
	
	public int Test1(int a, int b) {
		System.out.println("A" + a);
		System.out.println("B" +b);
		int sum= a+b;
		System.out.println(sum);
		return sum;
	}
	
	

}
