package Practice2;

class T1 {
	static void showMeAllNumbers(T2 a) {
		System.out.println("Calling this method from showAddition method");
		a.showSubtraction();  // Calling non static method without making object , Just passing arg. as object
	}
}
class T2 {

	void showAddition() {
		System.out.println("Show me addition of numbers.");
		T1.showMeAllNumbers(this);  // If we want to call nonstatic without making method as static
	}
	void showSubtraction() {
		System.out.println("Show me subtraction of numbers.");
	}
}
public class ThisUse2 {

	public static void main(String[] args) {
		T2 obj = new T2();   //Making object of T2 class
        obj.showAddition();
	}

}
