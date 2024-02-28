package Practice2;

public class methodChaining {
	 methodChaining (){
		System.out.println("Constructor has a return type of class & it returns this as a object");
		// return this;  // Implicitly constructor return type as this
	}
	 methodChaining showMeyourName() {
		System.out.println("Show me please your name.");
		return this;
	}
	 methodChaining showMeyourRoll() {
		System.out.println("Show me your roll in company");
		return this;
	}
	public static void main(String[] args) {
		new methodChaining().showMeyourName().showMeyourRoll();

	}

}
