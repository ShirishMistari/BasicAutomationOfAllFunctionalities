package Practice1;
class ppp{
	int a= 25;
	public void test() {
		System.out.println("ppp : test ");
	}
	public ppp(){
		System.out.println("Default parent custroctor");
	}
}
public class thisSuper extends ppp {
   int a= 1000;
   public void test1() {
	  // this.testing();
	   System.out.println("Print value of a of current class :"+this.a);
	   System.out.println("Print value of a of a parent class :"+super.a);
   }
	public static void main(String[] args) {
		thisSuper mm = new thisSuper();
		thisSuper mm1 = new thisSuper(10,20);
		
	}
	public thisSuper() {
		super();
		System.out.println("The this class cunstructor");
	}
	public thisSuper(int a, int b) {
		this();
		System.out.println("a+b :"+(a+b));
	}
	public void testing() {
		System.out.println("caling this method");
	}

}
