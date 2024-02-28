package Practice1;

public class Class6 {

	public static void main(String[] args) {
		System.out.println("Class 6 printing from class");
		Class6 obj= new Class6();
		obj.test1();
		obj.test2();
	}
	public void test1() {
		int a=1;
		int b=20;
		while(a<=10) {
			System.out.println("Print numbers from 10 to infinite"+ a);
			a++;
		}
		System.out.println("******");
		// int i, j, row=5;
		for(int i=0; i<=5; i++) {               
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" * ");
			}
			System.out.println();
        }
		for(int l=5; l>0; l--) {
			System.out.print(" * ");
		}
		System.out.println();
		
		// Iteration 1---
		// i=0, j=4 j is greater than i+1=0+1=1; j--
		//i=1, j=3 j is greater than i+1=1+1=2; j--
		//j=2, j=2 j is greater than i+1=2+1=3  condition false
	}
	public void test2() {
		System.out.println("************");
		for(int i=0; i<4; i++) {
		  for(int j=0; j<4; j++) {
			  System.out.print(" " + i + " ");
			 
		  }
		  System.out.println();
		}
		System.out.println("*************");
		for(int i=4; i>0; i--) {
			for(int j=4; j>0; j--) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
	}

}
