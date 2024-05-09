package Strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveVowelsFromTheString {
	
	static void removeVowelBf() {
		String a = "I am a good singer and excellent dancer";
		
		String res = "";
		for(int i = 0 ; i < a.length(); i++) {
			if(a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o' 
					&& a.charAt(i) != 'u') {
				res = res + a.charAt(i);
			}
		}
		
		System.out.println(res);
	}
	
	static void removeVowel() {
		String a = "I am a good singer and excellent dancer";
		String vowels = "aeiouAEIOU";
		
		StringBuilder res = new StringBuilder();
		
		for (int i = 0 ; i < a.length(); i++) {
			if(vowels.indexOf(a.charAt(i)) == -1) {
				res.append(a.charAt(i));
			}
		}
		
		System.out.println(res);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeVowelBf();
		removeVowel();
	}

}
