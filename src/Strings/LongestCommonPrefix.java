package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

		public String longestCommonPrefixBF(String[] S) {
			if (S.length == 0) return "";
			String prefix = S[0];
			for (int i = 1; i < S.length; i++) {
				while (S[i].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() - 1);
					if (prefix.isEmpty()) return "";
				}     
			}
			return prefix;
		}
		
		  public String longestCommonPrefix(String[] strs) {

			    StringBuilder result = new StringBuilder();

			    // Sort the array
			    Arrays.sort(strs);

			    // Get the first and last strings
			    char[] first = strs[0].toCharArray();
			    char[] last = strs[strs.length - 1].toCharArray();

			    // Start comparing
			    for (int i = 0; i < first.length; i++) {
			      if (first[i] != last[i])
			        break;
			      result.append(first[i]);
			    }

			    return result.toString();
			  }
		  
		public static void main(String args[]) {
			// Your code goes here
			LongestCommonPrefix ob = new LongestCommonPrefix();
			String s[] = {"club", "clup", "clove"};
			System.out.println(ob.longestCommonPrefix(s));
		}

}
