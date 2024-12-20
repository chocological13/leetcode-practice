package problems.medium;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is   blue ";
        String reversedString = reverseWords(s);
        System.out.println(reversedString);
    }

    public static String reverseWords(String s) {
        // trim the leading and trailing whitespaces and split by space
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
