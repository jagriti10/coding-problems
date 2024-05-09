package Strings;

import java.util.ArrayList;
import java.util.List;

public class JavaSubstringComparison {
	public static String getSmallestAndLargest(String s, int k) {
		

		List<String> substrings = new ArrayList<>();

		for (int i = 0; i <= s.length() - k; i++) {
			String words = "";
			for (int j = i; j < i + k; j++) {
				words = words + s.charAt(j);
			}
			substrings.add(words);
		}

		System.out.println(substrings);

		// sorting
		String[] listToArray = substrings.toArray(new String[0]);

		for (int i = 0; i < listToArray.length; i++) {
			for (int j = i + 1; j < listToArray.length; j++) {
				if (listToArray[i].compareToIgnoreCase(listToArray[j]) > 0) {

					String temp = listToArray[i];
					listToArray[i] = listToArray[j];
					listToArray[j] = temp;
				}
			}
		}
		
		for(String ele: listToArray) {
			System.out.println(ele);
		}
		
		String smallest = listToArray[0];
		String largest = listToArray[listToArray.length-1];

		return smallest + "\t" + largest;
	}

	public static void main(String args[]) {

		String s = "welcometojava";
		int k = 3;
		String smallestAndLargest = getSmallestAndLargest(s, k);
		System.out.println("smallest And Largest are :"+  smallestAndLargest);
	}

}
