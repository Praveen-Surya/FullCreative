package org.full.encapsulation;

public class AccessTelevision {

	public static void main(String[] args) {

		Television television = new Television();

		television.decreaseVolume(20);

		System.out.println(television.getVolume());

		television.increaseVolume(15);

		System.out.println(television.getVolume());

	}

}
