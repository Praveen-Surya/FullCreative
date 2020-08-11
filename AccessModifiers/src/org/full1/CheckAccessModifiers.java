package org.full1;

import org.full.AccessModifiers;

public class CheckAccessModifiers extends AccessModifiers {

	CheckAccessModifiers(String bloodGroup) {
		super(bloodGroup);

	}

	public static void main(String[] args) {

		// can able to access protected instance variable with different package
		CheckAccessModifiers ref = new CheckAccessModifiers("O +ve");
		System.out.println(ref.bloodGroup);

		// can't able to access default instance variable with different package
		System.out.println(ref.empName);

		// can't able to access private instance variable with different package
		System.out.println(ref.empNickName);

		// can able to access public static variable with different package
		System.out.println(AccessModifiers.empId);
	}

}
