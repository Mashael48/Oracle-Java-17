import java.math.BigDecimal;
import java.math.BigInteger;

public class WelcomeClass {
	public static void main(String[] args) {

		Number[] numbers = new Number[4];

		numbers[0] = 10;
		numbers[1] = 15.344;
		numbers[2] = new BigInteger("8");
		numbers[3] = new BigDecimal("8.1");

		System.out.println("Largers: " + getLargest(numbers));
	}

	private static Number getLargest(Number[] numbers) {
		Number number = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].doubleValue() > number.doubleValue()) {
				number = numbers[i];
			}
		}

		return number;
	}
}
