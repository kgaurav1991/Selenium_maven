package stringDemo;

import java.util.HashMap;
import java.util.Map;

public class String_Word_Repeated {

	public static void main(String[] args) {
		String str = "I am am working with wipro wipro with with with";

		// Split the string into words
		String[] words = str.split(" ");

		// Create a HashMap to store word frequencies
		Map<String, Integer> wordFreq = new HashMap<>();

		// Count frequency of each word
		for (String word : words) {
			if (wordFreq.containsKey(word)) {
				wordFreq.put(word, wordFreq.get(word) + 1);
			} else {
				wordFreq.put(word, 1);
			}
		}

		// Print the word frequencies
		for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
