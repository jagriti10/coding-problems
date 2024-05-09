package Strings;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
	
	static public int romanToint(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		int total = 0 ;
		for(int i =0; i<s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				return 0;
			} else {
				if (i>0 && s.charAt(i)>= s.charAt(i+1)) {
					total = total + map.get(s.charAt(i+1));
				} else {
					total = map.get(s.charAt(i+1)) - total; 
				} 
			}
		}
		return total;
		
	}
	
	public static void main(String args[]) {
    	String s = "XX";
    	int num = romanToint(s);
    	System.out.println("The length is "+ romanToint(s));
    }

}
