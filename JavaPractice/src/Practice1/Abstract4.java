package Practice1;
abstract class S1{
	abstract public int Card1();
	abstract public double Card2();
	abstract public long Card();
	public void TotalCards() {
		System.out.println("The cards are made by rbi company");
	}
}
class S2 extends S1{
	public int Card1() {
		System.out.println("The card is of value");
		return 100;
	}
	public double Card2() {
		System.out.println("The card is of value of");
		return 1200;
	}
	public long Card() {
		System.out.println("The card is of dddd");
		return 1111;
	}
}
public class Abstract4 {

	public static void main(String[] args) {
		S1 oo;
		oo = new S2();
		oo.Card();
		oo.Card1();
		oo.Card2(); oo.TotalCards();
	}

}
