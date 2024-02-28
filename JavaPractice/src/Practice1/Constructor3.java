package Practice1;

public class Constructor3 {
    public int a;
    public String name;
    public boolean b;
	public static void main(String[] args) {
		Constructor3 obj = new Constructor3(10);
		Constructor3 obj1 = new Constructor3(true);
		Constructor3 obj2 = new Constructor3(10,20,30);
		Constructor3 obj3 = new Constructor3("HDFC","Bank");
		
	}
	public Constructor3(int a) {
		System.out.println("Print int a :"+a);
	}
	public Constructor3(boolean b) {
		this(100);
		System.out.println("Print the value of b :"+b);
	}
	public Constructor3(int a, int b,int c) {
		this("Shirish","Sutar");
		double sum = a+b+c;
		System.out.println("Print sum :"+sum);
	}
	public Constructor3(String name,String surname) {
		this(1000);
		System.out.println("print this.name :"+name);
		System.out.println("Print this.surname :"+surname);
	}
	

}
