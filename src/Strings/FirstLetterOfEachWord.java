package Strings;

public class FirstLetterOfEachWord {


	public static void main(String[] args) {
		String s = "Jagriti is a good girl";
		char[] chars = s.toCharArray();
  		
		System.out.print(chars[0]);
		
		for(int i = 1 ; i < chars.length; i++) {
			if(chars[i] == ' ' && chars[i+1] != ' ') {
				System.out.print(chars[i+1]);
			}
		}

	}

}
