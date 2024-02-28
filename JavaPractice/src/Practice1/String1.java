package Practice1;

public class String1 {

	public static void main(String[] args) {
		String s1 = "Shirish Mistari";  //same memory Stack Memory Area;
		String s2 = "Shirish Mistari";  //same memory
		String s4= "Sutar";             //new memory because new string
		System.out.println(s1+s2);
		String s3 = new String("Sona monu");   //new memory will be created after every new In heap
		String ss="TATA is word";
		String[] splitarray=ss.split("is");
		System.out.println(splitarray[0]);
		System.out.println(splitarray[1]);
		System.out.println(splitarray[1].trim());
		//System.out.println(splitarray[]);
		for(int a=ss.length()-1;a>=0;a--) {
			System.out.print(ss.charAt(a));
			//System.out.print(ss.valueOf(a));
		}
		String1 obj = new String1();
		//obj.Test1();
	    
	}
	public void Test1() {
		int numb=523256; int remin;
		int rev=0;
		while(numb>0) {
			remin=numb%10;
			rev= rev*10+remin;
			// numb=numb%10;
		}
		System.out.println(rev);
		
	}

}
