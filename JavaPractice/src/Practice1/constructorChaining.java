package Practice1;
class parent111{
	public parent111(int a) {
		this(11.5f, 9.35f);
		System.out.println("Parent 1-int");
	}
	public parent111(float a, float b) {
		this((short)(a),(short)(b));
		System.out.println("Parent 1-float");
	}
	public parent111(short a, short b) {
		System.out.println("parent 1- short");
	}
	public parent111(boolean flag) {
		this(25);
		System.out.println("parent 1-boolean");
	}
}
class parent222 extends parent111{
	public parent222(int a) {
		super(a);
		System.out.println("parent 2-int");
	}
	public parent222(float a, float b) {
		this((short)a,(short)b);
		System.out.println("parent 2-float");
	}
	public parent222(short a, short b) {
		this(true);
		System.out.println("parent 2-short");
	}
	public parent222(boolean flag) {
		super(true);
		System.out.println("parent 2-boolean");
	}
}
public class constructorChaining {

	public static void main(String[] args) {
		parent222 nn = new parent222(true);
	}

}
