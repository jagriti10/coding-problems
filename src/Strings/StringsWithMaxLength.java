package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringsWithMaxLength {
	
	public static void main(String args[]) {
		
		List<Integer> indices = new ArrayList<>();
		String[] str = {"Red", "Green", "Blue", "White"};
		int[]  len = new int[str.length];
		
		for(int i = 0 ; i< str.length ; i++) {
			len[i] = str[i].length();
		}
		
		int maxLen = 0;
		
		for (int i = 0; i < len.length; i++) {
            if (len[i] > maxLen) {
                maxLen = len[i];
            }
        }

		
        for (int i = 0; i < len.length; i++) {
            if (len[i] == maxLen) {
                indices.add(i);
            }
        }
        
        for(int indx : indices) {
        System.out.println(str[indx]);
        }
	}

}
