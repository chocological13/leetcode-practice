package problems.medium;

public class StringToInteger {
    public static void main(String[] args) {
        String s  = " -042";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        char[] content = s.trim().toCharArray();
        if (content.length == 0) return 0;

        // check for sign
        int sign = 1;
        int index = 0;
        if (content[0] == '-' || content[0] == '+') {
            sign = content[0] == '-' ? -1 : 1;
            index++;
        }

        int result = 0;
        while (index < content.length && Character.isDigit(content[index])) {
            char c = content[index];
            int digit = c - '0';

            // check overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return sign * result;
    }
}
