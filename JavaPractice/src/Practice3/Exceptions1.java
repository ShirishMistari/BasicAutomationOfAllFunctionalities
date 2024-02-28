package Practice3;

import java.io.IOException;

public class Exceptions1 {
	public static void display()  {
		System.out.println("Display Pics...");
	}
	public static void Show() {
		display();
		System.out.println("Show Pics...");
	}
	public static void Present() {
		Show();
		try {
			int a = 10/0;
			System.out.println(a);
		}catch(Exception aa) {
			aa.printStackTrace();
			System.out.println(aa.getMessage());
		}
		System.out.println("Present Pics...");
	}
	public static void Give() {
		Present();
		System.out.println("Give Pics...");
	}
	
	public static void main(String args[]) {
		Give();
	}

}
