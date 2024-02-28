package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTestPractice {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	public static void test1() {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Shirish");
		listOfNames.add("Niraj");
		listOfNames.add("Dhiraj");
		listOfNames.add("Aakash");
		listOfNames.add("Nandini");
		listOfNames.add("Pushpaj");
		listOfNames.add("Sapna");
		listOfNames.add("Shamal");
		int count=0;
		for(int i=0; i<listOfNames.size(); i++) {
			String getNames = listOfNames.get(i);
			if(getNames.startsWith("S")) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void test2() {    //Second way of arraylist sorting;
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sapna");
		names.add("Shamal");
		names.add("Sopan");
		names.add("Mayur");
		names.add("Mukta");
		names.add("Shradha");
		names.add("Shirish");
		
		long Stringgg = names.stream().filter(s->s.startsWith("S")).count();
		System.out.println(Stringgg);
		
		long oneLineCodeOfNames = Stream.of("Dhanraj","Dhiraj","Kalpana","Kanchan","Jagruti","Vinayak","Dhruv","Dhnyaneshwar").filter(f->{
			f.startsWith("D");
			return true;
		}).count();
		System.out.println("Print the number of names which starts with D :"+oneLineCodeOfNames);
		
		//Print the names which has length more than 4;
		 Stream.of("Swami","Chetan","Kailash","Nandini","Ashok" ,"man","rani").filter(m->m.length()>4).forEach(s->System.out.println(s));
		//By limiting the names for saple purposes;
		 Stream.of("Swami","Chetan","Kailash","Nandini","Ashok" ,"man","rani").filter(m->m.length()>5).limit(2).forEach(m->System.out.println("Print only two samples :"+m));
	}
	public static void test3() {
		System.out.println("*************");
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sapna");
		names.add("Shamal");
		names.add("Sopan");
		names.add("Mayur");
		
		// Print the names starts with letter A in uppercase;
		Stream.of("Ajinkya","Avatar","Ayushi","Ashu","Balaleshwar","Chetuu").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// Print the letter Starts with A in sorted order
		System.out.println("****");
		Stream.of("Ajinkya","Avatar","Ayushi","Ashu","Balaleshwar","Chetuu","Khushuu").filter(s->s.startsWith("A"))
		.sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		// concatinating two list and check whether the name Sapn is present or not;
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Abhay");
		list1.add("Sapna");
		list1.add("madhuri");
		
		List<String> list2 = Arrays.asList("Golu","kailash","Monu","dholu");
		// Adding two list in one ;
		Stream<String> newList = Stream.concat(list1.stream(), list2.stream());
		boolean flag = newList.anyMatch(s->s.equalsIgnoreCase("Sagfgpna"));
		System.out.println(flag);
		// Assert.AssertTrue(false);
		}
	

}
