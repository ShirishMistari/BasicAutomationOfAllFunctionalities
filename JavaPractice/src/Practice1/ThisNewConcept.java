package Practice1;


public class ThisNewConcept {
	int x=10;
	public void test(int x,ThisNewConcept t) {
		// this.x = x;  //Avoid using this by passing arguments
		System.out.println(t.x);
		System.out.println(x);
		System.out.println(this);
		System.out.println(t);
	}
	public static void main(String []args) {
		ThisNewConcept t = new ThisNewConcept();
		//System.out.println(t.x);
		t.test(20, t); //If we dont want to use this keyword then we can pass object referebce as argument in methods..
		
		ThisNewConcept t1 = new ThisNewConcept();
		t1.test(70, t1);
	}
	
}
