import java.util.ArrayList;

//LeetCode: 151. Reverse Words in a String
//A word is defined as a sequence of non-space characters.

//The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space.
//Note that s may contain leading or trailing spaces or multiple spaces between two words.
//The returned string should only have a single space separating the words.
//Do not include any extra spaces.

//Example 1:
//Input: s = "the sky is blue"
//Output: "blue is sky the"

//Example 2:
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.

//Example 3:
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

//Constraints:
//1 <= s.length <= 104
//s contains English letters (upper-case and lower-case), digits, and spaces ' '.
//There is at least one word in s.

//Follow-up: If the string data type is mutable in your language,
//can you solve it in-place with O(1) extra space?

public class HW_03_no_split {
    public static void main(String[] args) {
        // String s = " a good example ";
        String s = " the sky is blue";
        System.out.println(String.format("\"%s\"", s));
        s = reverseWords(s);
        System.out.println(String.format("\"%s\"", s));
    }

    public static String reverseWords(String s) {
        ArrayList<String> wordsList = new ArrayList<>();
        int i = 0;
        int sLen = s.length();
        while (i < sLen) {
            if (s.charAt(i) != 32) {
                int startWord = i;
                while (i < sLen && s.charAt(i) != 32)
                    i++;
                wordsList.add(s.substring(startWord, i));
            }
            i++;
        }
        StringBuffer sb = new StringBuffer();
        for (int j = wordsList.size() - 1; j >= 0; j--) {
            sb.append(wordsList.get(j));
            if (j > 0)
                sb.append(" ");
        }
        return sb.toString();
    }
}