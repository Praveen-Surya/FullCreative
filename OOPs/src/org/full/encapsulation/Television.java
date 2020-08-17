package org.full.encapsulation;

public class Television {

	private int volume;

	public void decreaseVolume(int volume) {
		if (volume > 0) {
			this.volume = --volume;
		}
	}

	public void increaseVolume(int volume) {
		if (100 > volume) {
			this.volume = ++volume;
		}
	}

	public int getVolume() {
		return volume;
	}
}
