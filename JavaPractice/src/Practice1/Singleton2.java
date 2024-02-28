package Practice1;
class pp5 {
	int i=100;
	public static pp5 obj;
	public static int count =1;
	public pp5() {
		
	}
	public static pp5 Test() {
		if(count <= 3) {
			obj = new pp5();
			count++;
		}
		return obj; 
	}
}
public class Singleton2 {

	public static void main(String[] args) {          // program to restrict user to make maximum 3 objects
		System.out.println(pp5.obj);
	    pp5 obj1 = pp5.Test();     //new memory created 
	    System.out.println(obj1.i);
	    obj1.i=200;
	    System.out.println(obj1.i);
	    pp5  obj2 = pp5.Test();   // new memory created 
	    System.out.println(obj2.i);
	    obj2.i= 300;
	    System.out.println(obj2.i);
	    pp5 obj3 = pp5.Test();   // new memory created 
	    System.out.println(obj3.i);
	    obj3.i= 400;
	    System.out.println(obj3.i);
	    pp5 obj4 = pp5.Test();   // if block finished and previous result will be the output
	    System.out.println(obj4.i);
	    pp5 obj5 = pp5.Test();
	    System.out.println(obj5.i);
    }

}
