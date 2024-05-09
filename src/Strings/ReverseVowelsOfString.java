package Strings;

import java.util.List;

public class ReverseVowelsOfString {
	
	static void swap(StringBuilder sb, int start, int end) {
		char temp = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end, temp);
	}

	public static void main(String[] args) {
		
		String str = "leetcode";
		StringBuilder a = new StringBuilder(str.toLowerCase());
		
		
		List<Character> vowels = List.of('a','e','i','o','u');
		
		int start = 0;
		int end = a.length()-1;
		
		while(start <= end) {
			
			if(!vowels.contains(a.charAt(start))) {
				start++;
			}
			if(!vowels.contains(a.charAt(end))) {
				end--;
			}
			if(vowels.contains(a.charAt(start)) && vowels.contains(a.charAt(end))) {
				swap(a, start , end);
				start++;
				end--;	
			}		
		}
		
		System.out.println(a);
		
		
	}

}
