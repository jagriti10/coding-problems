package Strings;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	
	
	static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
        	return false;
        }
        
       
        
        Map<Character, Integer> aMap = new HashMap<>();
       
        for(int i = 0 ; i < a.length(); i++) {
        	Character aChar = a.charAt(i);
        	Character bChar = b.charAt(i);
        	
        	if(aMap.containsKey(aChar)) {
        		aMap.put(aChar, aMap.get(aChar)+1);
        	} else {
        		aMap.put(aChar, 1);
        	}
        	
        	if(aMap.containsKey(bChar)) {
        		aMap.put(bChar, aMap.get(bChar)-1);
        	} else {
        		aMap.put(bChar, -1);
        	}
        	
        }
        
        for(Integer i  : aMap.values()) {
        	if(i != 0) {
        		return false;
        	}
        }
		
		return true;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram", "margana"));
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("aab", "baaa"));

	}

}
