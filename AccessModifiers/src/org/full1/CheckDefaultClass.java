package org.full1;

import org.full.DefaultClass;

public class CheckDefaultClass {

	public static void main(String[] args) {

		// can't able to access default constructor in different package
		DefaultClass ref = new DefaultClass("B+ve");
		System.out.println(ref.bloodGroup);

		// can't able to access default instance method in different package
		ref.name("Rajesh");
		System.out.println(ref.empName);

		// can't able to access default static method in different package
		DefaultClass.id(1001);
		System.out.println(DefaultClass.empId);*/

		// can't able to access default variable in different package
		System.out.println(ref.empBranch);
	}

}
