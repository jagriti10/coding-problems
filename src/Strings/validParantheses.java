package Strings;

import java.util.Stack;

public class validParantheses {
	
	public static Boolean isValid(String str) {
		
		Stack<Character> brack = new Stack<>();
		
		for(int i = 0 ; i < str.length(); i++) {
			
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				brack.push(str.charAt(i));
			} else {
				if(brack.empty()) {
					return false;
				} else {
				char isClose = brack.peek();
					if(		(str.charAt(i) == ')' && isClose == '(') ||
							(str.charAt(i) == '}' && isClose == '{') ||
							(str.charAt(i) == ']' && isClose == '[')
							
							) {
						brack.pop();
								} else {
									return false;
								}	
				} 
		}
	}
		if(brack.empty()) {
			return true; 
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		String s1 = "[(})";
		String s2 = "(()){}[]";
		String s3 = "({[]})";
		
		String s4 = "(){}}{";
		String s5 = "]";
		
		//System.out.println("s1 should be false " + isValid(s1));
		//System.out.println("s2 should be true " +isValid(s2));
		//System.out.println("s3 should be true " +isValid(s3));
		System.out.println("s4 should be false " +isValid(s5));

	}

}
