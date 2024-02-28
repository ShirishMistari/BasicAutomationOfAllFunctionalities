package Practice3;

class c implements Inn1 {
	public void Test1() {
		String EmploayeeName = "Raju";
		for(int i=0; i<EmploayeeName.length(); i++) {
			if(EmploayeeName.contains("m")) {
				System.out.println(EmploayeeName.split("j"));
				// System.out.println(i);
			}
		}
	}
	public void Test2() {
		System.out.println(EmploayeeName);
		System.out.println(EmployeeLocation);
	}
	public static void main(String []args) {
		c o = new c();
		o.Test1(); o.Test2();
		Thread n = new Thread((Runnable) o);
		n.start();
	}
}