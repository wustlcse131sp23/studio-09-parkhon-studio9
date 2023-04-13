package studio9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
			Map<String, Integer> count = new HashMap <>();
			for (int i = 0; i < words.size(); i++)
			{
				String word = words.get(i);
				if (count.containsKey(word))
				{	
					int number = count.get(word);
					count.put(word, number + 1);
				}
				else
				{
					count.put(word, 1);
				}
			}
			return count;
	}
	
	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
			
		words.addAll(Arrays.asList("to","be","or","not","to","be","be"));

		
		Map<String, Integer> countWord = countWords(words);
		System.out.println(words);
		System.out.println(countWord);
		
	}
}
