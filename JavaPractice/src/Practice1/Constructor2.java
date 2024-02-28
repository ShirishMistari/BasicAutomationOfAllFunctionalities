package Practice1;

public class Constructor2 {
	public int a;
	public String name;
	private int b;
	private String surname;

	public static void main(String[] args) {
		Constructor2 obj = new Constructor2(10,"SBI");
		obj.Test();
		obj.setB(1000);
        System.out.println("Get value of b :"+obj.getB());
        obj.setSurname("HDFC");
        System.out.println("Print the value of surname :"+obj.getSurname());
	}
	public Constructor2(int a, String name) {
		this.a=a;
		this.name=name;
	}
	public void Test() {
		System.out.println("Using this keyword:"+this.a);
		System.out.println("Using this keyword:"+this.name);
	}
	public void setB(int b) {
		this.b=b;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public int getB() {
		return this.b;
	}
	public String getSurname() {
		return this.surname;
	}
	
	

}
