package Strings;


public class ReplaceEveryAWithAtRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a cat sat on a mat";

		String str = "";
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'a') {
				count++;
				for (int j = 0; j < count; j++) {
					str = str + "#";
				}
			} else {
				str = str + a.charAt(i);
			}
		}
		
		System.out.println(str);
	}

}
