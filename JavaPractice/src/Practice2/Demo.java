package Practice2;

abstract class Bird {
	   abstract void fly();
	   abstract void eat();
	}
	class Crow extends Bird {
	void fly() {
	System.out.println("Crow fly..");
	}
	void eat() {
	System.out.println("Crow fly..");
	}
	}
	class Parrot extends Bird {
	void fly() {
	System.out.println("Parrot fly..");
	}
	void eat() {
	System.out.println("Parrot fly..");
	}
	}
	class Demo {
	public static void main(String []ss) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class b = Class.forName(ss [0]);  // Pass any class name in argument it will execute
	@SuppressWarnings("deprecation")
	Bird bird = (Bird)b.newInstance();
	Bird bb = new Bird() {

		@Override
		void fly() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void eat() {
			// TODO Auto-generated method stub
			
		}
		
	};
	bird.fly();
	bird.eat();

	}
	}