package Strings;

public class AnagramOccurences {
    public static int getCountOccurances(String text, String word) {
        int[] wHeap = new int[26];
        int[] textHeap = new int[26];
        int start = 0;
        int count = 0;

        for (char c : word.toCharArray()) {
            wHeap[c - 'a']++;
        }

        for (int i = 0; i < text.length(); i++) {
            textHeap[text.charAt(i) - 'a']++;
            if (i - start + 1 == word.length()) {
                if (isEqual(textHeap, wHeap)) {
                    count++;
                }
                textHeap[text.charAt(start) - 'a']--;
                start++;
            }
        }

        return count;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "abcbabc";
        String word = "abc";
        int occurrences = getCountOccurances(text, word);
        System.out.println("Number of occurrences: " + occurrences);
    }
}

