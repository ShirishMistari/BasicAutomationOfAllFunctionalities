package Practice2;

public class Association {
	String TestName;
	int TestFee;
	Testing course;  //Aggregation
	
	Association(String TestName, int TestFee, Testing course ){
		this.TestName = TestName;
		this.TestFee = TestFee;
		this.course = course;
	}

	public static void main(String[] args) {
		// Association nn = new Association();  //creating object called association.
		// new Association(); called Composition(Strong) 
		// Association ass;   called aggregation.(Week)
		Association tt = new Association("Automation", 100, new Testing("API", "APPIAM", "CYPRESS"));
		
	}

}
class Testing {

	String TestingTypes, TestMethod, TestStrategy;
	public Testing(String string, String string2, String string3) {
		this.TestingTypes = string;
		this.TestMethod = string2;
		this.TestStrategy = string3;
	}
	
}
