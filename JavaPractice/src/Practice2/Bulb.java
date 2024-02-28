package Practice2;

public class Bulb {

	int wat;
	boolean state;
	float price;
	static int counter;
	static String cname;
	String color;

	public static void main(String[] args) {
	System.out.println("*****Creating same type of 2 bulb..");
    Bulb b1 = new Bulb();
    Bulb b2 = new Bulb();
    Bulb b3 = new Bulb();
    b3.showDetailsOfBulb();
    System.out.println("*****Creating same type of 2 bulb..");
    Bulb b4 = new Bulb();
    Bulb b5 = new Bulb();
    Bulb b6 = new Bulb();
    b6.showDetailsOfBulb();
    System.out.println("*****Creating same type of 2 bulb..");
    Bulb.countBulb();
    System.out.println("*****Creating different type of bulb..");
    Bulb b11 = new Bulb(20,false,30f,"Redd");
    b11.showDetailsOfBulb();
    Bulb b12 = new Bulb(40,true,40f,"Yellow");
    b12.showDetailsOfBulb();
	}

	// creating same type of bulb..with default cons.
	Bulb() {
		wat = 10;
		state = true;
		price = 400.20f;
		color = "Yellow";
	}
	Bulb(int wat, boolean state, float price,String color) {
		this.wat = wat;
		this.state =state ;
		this.price = price;
		this.color = color;
	}
	

	static {
		counter = 0;
		cname = "SURYA PVT LTD.";

	}
	{
		counter++;
	}

	void showDetailsOfBulb() {
		System.out.println("Bulb wat :" + wat);
		System.out.println("Bulb state :" + state);
		System.out.println("Bulb color :" + color);
		System.out.println("Bulb price :" + price);
		System.out.println("Bulb cname :" + cname);

	}

	void changeBultState() {
		if (state = true)
			state = false;
		else
			state = true;
	}

	static void countBulb() {
		System.out.println("Total number of bulbs :" + counter);
	}

	void changeCompanyName() {

	}

}
