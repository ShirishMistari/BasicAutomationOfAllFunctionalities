package Practice2;

public class ArmstrongNumberIn1000 {

	public static void main(String[] args) {
		PrintArmstrongNumberBetween1000();
	}
	public static void PrintArmstrongNumberBetween1000() {
		for(int n=0;n<=1000;n++) {
			int a; int i=0,j=0;
			a=n;             //a=n=153; 153 is greater than a
			while(a>0) {
				i = a%10;         //153%10 = 3 remaining & i value is 15
				j=j+(i*i*i);      //j=0+(15*15*15)
				a=a/10;           //a=153/10=15  27+125+1=153
			}
			if(n==j) {
				System.out.println(n);
			}
		}
	}
}
	
