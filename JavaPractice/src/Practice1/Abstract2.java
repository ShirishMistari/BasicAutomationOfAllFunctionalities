package Practice1;
abstract class Bank{
	abstract public int getRateOFInterest();
}
class SBI extends Bank{
	 public int getRateOFInterest() {
		return 10;
	}
}
class HDFC extends Bank{
	public int getRateOFInterest() {
		return 20;
	}
}
public class Abstract2 {

	public static void main(String[] args) {
		Bank obj;
		obj = new SBI();
		System.out.println("The rate of interest is :"+obj.getRateOFInterest()+"%");
		obj = new HDFC();
		System.out.println("The rate of interest is :"+obj.getRateOFInterest()+"%");
	}

}
