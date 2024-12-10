package sample3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(2, 3, 4, 5);

		int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);

		System.out.println("Max " + max);
	}
}
