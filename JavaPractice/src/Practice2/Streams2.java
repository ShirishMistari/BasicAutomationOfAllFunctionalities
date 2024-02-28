package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {

	public static void main(String[] args) {
		Interview1();
		interview2();
		printAlphabets();
	}
	public static void Interview1() {
//		ArrayList<String> nameList1 = new ArrayList<String>();
//		nameList1.add("Kanchan");
//		nameList1.add("Kaidar");
//		nameList1.add("Guru");
//		nameList1.add("kalpanan");
//		nameList1.add("Chetan");
//		nameList1.add("anadan");
		
		// collect the list and print only 3rd index samples;
		List<String> L1 = Stream.of("Kanchan","Kaidar","Guru","kalpanan","Chetan","anadan")
        .filter(s->s.endsWith("n")).map(s->s.toUpperCase())
        .collect(Collectors.toList());
		System.out.println(L1.get(3));
	}
	public static void interview2() {
		// print the unique numbers from giver list of numbers;
		System.out.println("The unique numbers list-");
		Stream<Integer> numbers = Stream.of(12,56,0,11,12,5,1,3,56,6,0,9,1,20);
		numbers.distinct().forEach(s->System.out.print(" "+s));
		//Print the unique numbers in sorted orders;
		List<Integer> values = Arrays.asList(1,1,2,2,4,3,9,0,2,10,65,11,44,56,2,45,88,8,1,3,1);
		values.stream().distinct().sorted().collect(Collectors.toList())
		.forEach(i->System.out.println(i));
		//Print the 4th index unique numbers with sorted orders ;
		System.out.println("***");
		List<Integer> values1 = Arrays.asList(1,1,2,2,4,3,9,0,2,10,65,11,44,56,2,45,88,8,1,3,1);
		values.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println(values1.get(4));
	}
	public static void printAlphabets() {
		System.out.println("Sorting of alphabets---");
		List<String> alpha = Arrays.asList("A","C","N","W","B","C","O","A");
		alpha.stream().distinct().sorted().forEach(s->System.out.println(s));
	}

}
