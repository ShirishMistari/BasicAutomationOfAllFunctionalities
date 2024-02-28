package Practice2;

public class Arrays {

	public static void showMeArray(int x[]) {
		for (int i = 0; i < x.length; i++) {
			int min = x[0];
			System.out.print(" " + x[i] + " " + (i) + " ");
		}
		
	}

	public static void showMe2DiamensionalArray() {
		int x[][] = new int[3][3];
		x[0][0] = 3;
		x[0][1] = 33;
		x[0][2] = 113;
		x[1][0] = 11;
		x[1][1] = 32;
		x[1][2] = 30;
		x[2][0] = 332;
		x[2][1] = 12;
		x[2][2] = 9;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j]+" ");
				
			}
			System.out.println();
		}

	}
	

	public static void main(String[] args) {
		String str = "Shirish";
		String h = str.substring(0,7);
		System.out.println(h);
		System.out.println(str.length());
		int y[] = { 344, 65, 223, 10, 2, 222, 99, 67, 59 };
		showMeArray(y);
		showMe2DiamensionalArray();
		String s = "abc"; //a=97, b=98, c=99, d=100; If not same it substract value from one to second
		String s1 = "abc"; // If length of both strings are same the it will compare on length basis
		System.out.println(s.compareTo(s1));
		//StringTokenizer gg = new StringTokenizer();

	}

}
