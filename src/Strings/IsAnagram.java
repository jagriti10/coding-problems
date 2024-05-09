package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsAnagram {

	public static boolean isAnagram(String s, String t) {

		int s1 = s.length();
		int t1 = t.length();
		
		
		Map<Character, Integer> map = new HashMap<>();
		
		if(s1 != t1) {
			return false;
		}
		
		for(int i = 0 ; i< s1 ; i++){
			Character sc = s.charAt(i);
			Character st = t.charAt(i);
			
			map.put(sc, map.getOrDefault(sc, 0) + 1);
			map.put(st,  map.getOrDefault(st, 0) - 1);
		}
		
		
		for(int i : map.values()) {
			if (i != 0) {
			return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		//System.out.println(isAnagram("anagram", "nagaram"));
		
		System.out.println(isAnagram("aab", "bab"));
	}

}
