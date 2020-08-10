package org.full1;

// can able to access protected class members using import statement and inheritance
import org.full.ProtectedClass;

public class CheckProtectedClass extends ProtectedClass {

	// can able to access protected constructor using constructor chaining
	public CheckProtectedClass(String bloodGroup) {
		super(bloodGroup);
	}

	public static void main(String[] args) {

		// able to access protected constructor within same package
		CheckProtectedClass ref = new CheckProtectedClass("B +ve");
		System.out.println(ref.bloodGroup);

		// able to access protected instance method within same package
		ref.name("Ram");
		System.out.println(ref.empName);

		// able to access protected static method within same package
		ProtectedClass.id(1001);
		System.out.println(ProtectedClass.empId);

		// able to access protected variable within same package
		System.out.println(ref.empBranch);
	}

}
