package Practice2;

public class String2 {

	public static void main(String[] args) {
		String2 obj = new String2();
		obj.ReverseNumber(); obj.ReverseString();
		obj.PalindromNumber(12323); obj.ArmstongNumber(155);
	}
	public void ReverseNumber() {
		int number = 199723;
		int reverse = 0; int reminder=0;
		while(number>0) {                     //number= 199723;
			reminder = number%10;             // reminder = 199723%10;  =3
			reverse = reverse*10+reminder;             // reverse = 0*10+3
			number = number/10;
		}
		System.out.println("The revrsed number is :"+reverse);
	}
	public void ReverseString() {
		String str = "The statue of unity is a world largest statue";
//		for(int i = str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		int i=str.length()-1;
		while(i>=0) {
			// System.out.print(str.charAt(i));
			System.out.print(str.toUpperCase().charAt(i));
			i--;
		}
		System.out.println();
		
	}
	public void PalindromNumber(int num) {
		
		int rev=0, remi=0; int temp=num;
		while(num>0) {
			remi = num%10;
			rev = rev*10+remi;
			num= num/10;
		}
		if(temp==rev) {
			System.out.println("The number is pallindrom");
		}else {
			System.out.println("The number not pallindrom");
		}
	}
	public void ArmstongNumber(int num ) {
		int rem=0, rev=0;
		int temp=num;
		while(num>0) {
			num=num%10;
			rev = rev+rem*rem*rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("The number is Armstrong");
		}else {
			System.out.println("The number is not Armstrong");
		}
	}

}
