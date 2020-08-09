package org.full.junit;

public class PrimeNumber {

	public boolean PrimeNumberCheck(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
