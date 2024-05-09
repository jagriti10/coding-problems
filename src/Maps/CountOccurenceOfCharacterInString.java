package Maps;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfCharacterInString {
	
	static void bfCount(String s) {
		int countA = 0;
		int countB = 0;
		int countC = 0;
		
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				countA++;
			} else if (s.charAt(i) == 'b') {
				countB++;
			} else if (s.charAt(i) == 'c') {
				countC++;
			}
		}
		 
		System.out.println("a "+ countA);
		System.out.println("b "+ countB);
		System.out.println("c "+ countC);
	}
	
	static void mapCount(String s) {
		
		Map<Character , Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < s.length(); i++) {
				if(map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				} else {
					map.put(s.charAt(i), 1);
				}
		}
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		String s = "aaabbbbbbbbbbbbbcccccccccccccc";
		bfCount(s);
		mapCount(s);
	}

}
