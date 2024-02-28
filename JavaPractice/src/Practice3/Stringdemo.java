package Practice3;

public class Stringdemo {

	public static void main(String[] args) {
		String str1 = "Shirish";
		System.out.println(str1.hashCode());   //Shared different memory 
		str1 = str1.concat("Mistari");
		System.out.println(str1.hashCode()); //Shared different memory 
		System.out.println(str1);//Strings are immutable but it is changing how?
		//Because it creates object for every string like "Shirish" , "Mistari" & "ShirishMistari" has different object
		System.out.println("*********");
		String s = "Sutar";
		System.out.println(s.hashCode());
		s="Sonu";
		System.out.println(s.hashCode());
		System.out.println(s);
		System.out.println("*********");
		String s1 = "Hello";   //String Constant Pool Area (Stack)
		String s2 = new String("Hello");  //Shared both Heap & pool
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//Then how to check s2 gets place in pool area ..By intern() method 
		String s5 = s2.intern();
		System.out.println(s1.equals(s5)); //Same memory area -Pool
		System.out.println("************");
		String h1 = "Gopal";
		String h2= new String(h1.concat("Patil"));   //Different memory is created
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println("****");
		String h3= new String(h1);  //Ponting to same memory 
		System.out.println(h1.equals(h3));
		System.out.println(h1.hashCode());
		System.out.println(h3.hashCode());
		
		

	}

}
