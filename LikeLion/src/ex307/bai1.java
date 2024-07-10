package ex307;

import java.util.function.Function;

public class bai1 {

	public static void main(String[] args) {
		Function<Integer, Integer> largestPrimeFactor = (number) -> {
			int largestFactor = 1;
			for (int i = 2; i <= number; i++) {
				while (number % i == 0) {
					if (isPrime(i)) {
						largestFactor = i;
					}
					number /= i;
				}
			}
			return largestFactor;
		};

		System.out.println(largestPrimeFactor.apply(176));
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
