package org.full;

public class CheckDefaultClass {

	public static void main(String[] args) {

		// able to access default constructor within same package
		DefaultClass ref = new DefaultClass("B+ve");
		System.out.println(ref.bloodGroup);

		// able to access default instance method within same package
		ref.name("Rajesh");
		System.out.println(ref.empName);

		// able to access default static method within same package
		DefaultClass.id(1001);
		System.out.println(DefaultClass.empId);

		// able to access default variable within same package
		System.out.println(ref.empBranch);
	}

}
