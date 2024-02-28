package Practice1;

public class StaticInitBlock {

	public static void main(String[] args) {
		System.out.println("Hello Main method");
		{
			System.out.println("Hi I looks like as InitBlock");
		}
	}
	StaticInitBlock(){
		System.out.println("This is default constructor...");
	}

	{
		System.out.println("This is init Block 1");
	}
	static {
		new StaticInitBlock();  //By creating this object all init blocks will get executing..
		System.out.println("This is static block 1..");
		
	}
	{
		System.out.println("This is init Block 2..");
	}
	static {
		System.out.println("This is static block 2..");
	}
	{
		System.out.println("This is init Block 3..");
	}
	static {
		System.out.println("This is static block 3..");
	}
}
