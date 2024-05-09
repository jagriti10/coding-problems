package Strings;

import java.security.PKCS12Attribute;
import java.util.HashSet;
import java.util.Set;

public class RemoveCharacter {
	
	public static StringBuilder updatedString(StringBuilder s1, StringBuilder s2) {
		for(int i = 0 ; i<s2.length(); i++) {
			for (int j = 0 ; j < s1.length(); j++) {
				if( s1.charAt(j) == s2.charAt(i)) {
					s1 = s1.replace(j,j+1, "");
				}
			}	
		}
		return s1;
	}
	
	
	public static String usingSet(String s1, String s2) {
		
		Set<Character> s2Set = new HashSet<>();
		for(char ch : s2.toCharArray()) {
			s2Set.add(ch);
		}
		StringBuilder res = new StringBuilder();
		for(char ch : s1.toCharArray()) {
			if(!s2Set.contains(ch)) {
				res.append(ch);
			}
		
		}
		return res.toString();
	}
	
	
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("computer");
		StringBuilder str2 = new StringBuilder("cat");
		//System.out.println(updatedString(str1, str2));
		System.out.println(usingSet("computer","cat"));
		
	}

}
