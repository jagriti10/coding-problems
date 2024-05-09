package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurence {
	
//	public CountOccurence() {
//		System.out.println("in constructor");
//	}
//	
//	static {
//		System.out.println("1");
//	}
//	
//	static {
//		System.out.println("2");
//	}
	
	String name;
	public void setName(String name) {
		name = this.name;
	}
	public String getName() {
		return name;
	}
	
		
	public static void main(String args[]) {
		
		String s = "Jagriti Sharma is a good girl";
		
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0 ; i < s.length(); i++) {
			
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			} else {
				map.put(s.charAt(i), 1);
			}	
			
		}
		
		for(Character c : map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println(c);
			}
		}
		
		
		CountOccurence c = new CountOccurence();
		String a = c.getName();
	
			if(a == null) {
			throw new NullPointerException();
			}
		
			
			//String s = null;
			//System.out.println(s.toString());
			
			
			
			
		
		
		

	}
}
