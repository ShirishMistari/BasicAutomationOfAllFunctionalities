package Practice2;

public class String1 {

	public static void main(String[] args) {
		String str1 = "The Boy life is very strugglefull";
		String str10 = "Nameeee";
		String str11 = "Nameeee";
		
		System.out.println(str1);
		String str2 = new String("The zeebra is animal");
		str2="The mane";
		str2.concat("Name");
		System.out.println(str2);
		String str3 = "The zebra is animal";
		System.out.println("Is str1 is equal to str2 :"+str1.equals(str2));
		System.out.println("Is str2 is equal to str3 :"+str2.equals(str3));
		System.out.println("The length of str1 is :"+str1.length());
		System.out.println("Substring of str2 is :"+str2.substring(2));
		System.out.println("convert str3 in upper case :"+str3.toUpperCase());
		System.out.println("Convert str3 in lower case :"+str3.toLowerCase());
		System.out.println("The CharAt of str2 is :"+str2.charAt(6));
		System.out.println("Confirm wether the str1 is starts with T :"+str1.startsWith("Th"));
		System.out.println("Confirm wether the str2 is ends with ll :"+str2.endsWith("ll"));
		System.out.println("Check equals and egnore case for str2 and str3 :"+str2.equalsIgnoreCase(str3));
		System.out.println("Replace str3 with another sentence :"+str3.replace("Zebra","LION"));
		System.out.println("The new replaced str3 is :"+str3);
		
	}

}
