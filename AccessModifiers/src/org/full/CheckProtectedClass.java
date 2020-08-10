package org.full;

public class CheckProtectedClass {

	public static void main(String[] args) {

		// able to access protected constructor within same package
		PublicClass ref = new PublicClass("B+ve");
		System.out.println(ref.bloodGroup);

		// able to access protected instance method within same package
		ref.name("Ram");
		System.out.println(ref.empName);

		// able to access protected static method within same package
		PublicClass.id(1001);
		System.out.println(PublicClass.empId);

		// able to access protected variable within same package
		System.out.println(ref.empBranch);
	}

}
