package Practice1;

public class Class5 {

	public static void main(String[] args) {
		Class5 obj = new Class5();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		}
    public void test1() {
    	for(int i=0; i<10; i++) {
    		if(i%2 == 0) {
    			System.out.println("Multiple of 2 is:" + i);
    		}else {
    			System.out.println("Not multipl of 2:"+i);
    		}
    	}
    }
    public void test2() {
    	for(int a=150; a>12; a--) {
    		System.out.println("Reverse from 12 to 150 :"+a);
    	}
    	for(char ch='A'; ch<'Z';ch++) {
    		System.out.println("Characters:"+ch);
    	}
    }
    public void test3() {
    	int a=0;
    	while(a<5) {
    		System.out.println("Sum of a:"+ a);
    		a++;
    	}
    }
    public void test4() {
    	int i=1;
    	do {
    		System.out.println(i);
    		i++;
    	}while(i<5);
    }
    public void test5() {
    	for(int i=0; i<4; i++) {
    		for(int j=1; j<4; j++) {
    		   System.out.println(i + " " + j);
    		}
    	}
    	System.out.println("*****************");
    	for(int a=1; a<=4; a++) {
    		for(int b=a; b<5; b--) {
    			System.out.print(" ");
    		}
    		System.out.println("* ");
    	}
    	System.out.println();
    }
}
