package problems.easy;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reverse = reverseWords(s);
        String reverse2 = reverseWords2(s);
        System.out.println(reverse);
        System.out.println(reverse2);
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            for (int j = wordChars.length - 1; j >= 0; j--) {
                sb.append(wordChars[j]);
            }
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String reverseWords2(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().append(" "));
        }
        return sb.toString().trim();
    }
}
