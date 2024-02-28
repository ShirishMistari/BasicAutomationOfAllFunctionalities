package Practice1;
// we can make object of any interface as well abstract class
interface j1{
	public int tests1(int a, int b);
}

interface j2 extends j1{
	public String tests2(String a, String b);
}
public class Interface3 {

	public static void main(String[] args) {
		//creating object
		j2 obj = new j2() {
			public int tests1(int a , int b) {
			  return a+b;
			}
			public String tests2(String a, String b) {
			  return  a+b;
			}
		};
		System.out.println("Print interface object tests1 :"+obj.tests1(20,25));
		System.out.println("Print interfaceb object tests2 :"+obj.tests2("shirish","Mistari"));
	}
	

}
