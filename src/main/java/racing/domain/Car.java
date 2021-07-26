package racing.domain;

public class Car {

	private final String name;
	private int move;

	private static final int COMPARE_VALUE = 4;
	private static final int NAME_MAX_LENGTH = 5;

	public Car(String name) {
		this.name = name;
		this.move = 0;
	}

	public void move(int randomValue) {
		if (randomValue >= COMPARE_VALUE) {
			this.move++;
		}
	}

	public int getMove() {
		return move;
	}

	public static boolean validate(String name) {
		return name.length() <= NAME_MAX_LENGTH;
	}
}
