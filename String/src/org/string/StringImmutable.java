package org.string;

public class StringImmutable {
	
	static String s1 = "samsung";
	static String s2 = "samsung";

	public static void main(String[] args) {
		System.out.println("Before Mofications");
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);

		// Creating new reference while reassigning
		s2 = "apple";
		System.out.println("After Reassigning s2");
		System.out.println("s2 " + s2);

		// No changes made while performing concatenation
		s1.concat(" vivo");
		System.out.println("After Concatenation s1");
		System.out.println("s1 " + s1);

		// Changes made while performing reassigning only
		s1 += " vivo";
		System.out.println("After Reassigning s1");
		System.out.println("s1 " + s1);
	}

}
