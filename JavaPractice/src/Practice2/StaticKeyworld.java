package Practice2;

public class StaticKeyworld {

	 String firstName;     //Instance variables;
	 //Below variables Called as CLASS VARIABLES;
	static String middleName = "Sudam"; //If want to use repitadly(everywhere); 
	static String lastName = "Mistari"; //If want to use repitadly(everywhere); mark the variable as static
	 int i= 0;
	 public StaticKeyworld(String firstName) {
		 this.firstName = firstName;  //Local Variables
//		 this.middleName = middleName;
//		 this.lastName = lastName;
		 i++;
		 System.out.println(i);  // If we remove static keyword from i variable it will become instance; Output will be 1,1,1
	 }
	 public void getfistName() {
		 System.out.println(firstName +" "+ middleName +" "+ lastName);
		 
	 }

	public static void main(String[] args) {
		//StaticKeyworld sk = new StaticKeyworld("Shirish","Sudam","Mistari");
		StaticKeyworld sk1 = new StaticKeyworld("Dhanraj");
		StaticKeyworld sk2 = new StaticKeyworld("Shirish");
		StaticKeyworld sk3 = new StaticKeyworld("Dipali");
		sk1.getfistName();
		sk2.getfistName();
		sk3.getfistName();
	}

}
