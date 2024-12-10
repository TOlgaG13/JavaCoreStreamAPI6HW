package sample2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(2, 3, 4, 5);

		int product = numbers.stream().reduce(1, (a, b) -> a * b);

		System.out.println("Product of list elements: " + product);
	}
}
