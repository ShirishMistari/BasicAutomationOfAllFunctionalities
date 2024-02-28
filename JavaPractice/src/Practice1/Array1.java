package Practice1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		Array1 obj = new Array1();
		obj.Array();
		obj.Arrays();
		int[] aa = new int[5];
		aa[0]=10;
		aa[1]=20;
		aa[2]=30;
		aa[3]=40;
		aa[4]=50;
		for(int a=0;a<aa.length; a++) {
			System.out.println("Print array "+aa[a]);
		}
		Object[] arr = {"Shirish","Vinayak","Sourabh","Swapnil",10,true,100.5f,'A',50000};
		for(Object ar:arr) {
			System.out.println("Print the object array :"+ar);
		}
		int[] arrr= {0,2,4,6,8,9,7,10,11,12,15,16,22,25,42};
		for(int n :arrr) {
			if(n%2 ==0) {
				System.out.println(n);
			}else {
				System.out.println(n+"-Not multiple of 2");
			}
		}
		
	}
	public void Array() {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("Shirish");
		a.add(10);
		a.add(100.20f);
		a.add(true);
		a.add(500);
		ArrayList<String> n = new ArrayList<String>();
		n.add("Sona");
		n.add("Mona");
		n.add("Chaitali");
		n.add("Pushpaj");
		n.add("puja");
		n.get(0);
	    System.out.println(n.get(2));
	    System.out.println(n.indexOf("Mona"));
	    System.out.println(n.equals(a));
	    System.out.println(n.isEmpty());
	    System.out.println(n.remove(3));
	    for(String s:n) {
	    	System.out.println(s);
	    }
	    Iterator<String> it = n.iterator();
	    System.out.println(it);
//	    while(it.hasNext()) {
//	    	System.out.println("Print arralist by iterater :"+it);
//	    }
	   
	}
	public void Arrays() {
		String[] mm = {"Pune","Mumbai","Delhi","Kolkata","Agra"};
		List<Object> arraylist = java.util.Arrays.asList(mm);
		System.out.println(arraylist.contains("Delhi"));
	}

}
