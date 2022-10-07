package testSetupRunner;

import java.util.Random;

public class TestGenerateRandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int setNumber = 500000;
		int newNumber = random.nextInt(setNumber);
		System.out.println(newNumber);
	}
}