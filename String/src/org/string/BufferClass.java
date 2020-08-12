package org.string;

public class BufferClass {

	public static void main(String[] args) {

		StringBuffer companyName = new StringBuffer("Apple");

		// duplicate can be created with different memory address
		StringBuilder companyName1 = new StringBuilder("Apple");

		System.out.println(companyName.hashCode());
		System.out.println(companyName1.hashCode());

		// can be changed the content of the object in the same memory address==>mutable
		System.out.println(companyName.append(" Company"));
		System.out.println(companyName.hashCode());

	}

}
