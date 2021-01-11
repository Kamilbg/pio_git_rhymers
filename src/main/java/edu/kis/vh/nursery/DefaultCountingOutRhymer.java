package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INDEX = -1;
	public static final int CAPACITY = 12;

	private int[] numbers = new int[CAPACITY];

	public int total = INDEX;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
