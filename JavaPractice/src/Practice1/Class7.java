package Practice1;

import java.util.ArrayList;

public class Class7 {

	public static void main(String[] args) {
		
		int a=10, b=20, temp=0;
		temp = a;
		a=b;
		b=temp;
		System.out.println("Print value of b :"+b);
		//Print the reverse number 
		int number=5467889;
		int rem=0, reverse=0;
		while(number>0) {
			rem = number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		System.out.println("Print the reverse number: "+reverse);
		Class7 obj= new Class7();
		obj.Test1();
		}
	public void Test1() {
		// Print Armstrog number;
		int numb=153;
		int rem=0, rev=0;
		while(numb>0) {
			rem= numb%10;
			rev= rev+rem*rem*rem;
			numb=numb/10;
		}
		if(rev==numb) {
			System.out.println("The number is armstrong number :");
		}else {
			System.out.println("The number is not armstrong number");
		}
		
	}

}
