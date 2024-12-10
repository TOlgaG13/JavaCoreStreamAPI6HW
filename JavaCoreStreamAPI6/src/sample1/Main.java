package sample1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "When I was six years old, I saw a picture in a book."
				+ " It was a picture of a snake who was eating a big animal.";
		int totalLength = Arrays.stream(text.split(" "))
				.filter(word -> word.length() > 4)
				.mapToInt(String::length)
				.reduce(0, Integer::sum);
		System.out.println("The total number of letters in the words quarter is more than 4:" + totalLength);

	}

}
