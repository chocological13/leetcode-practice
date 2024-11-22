package problems.easy;

public class ImplementStr {
    public static void main(String[] args) {
        String a = "sadbutsad";
        String b = "sad";
        int needle = strStr(a, b);
        System.out.println("The needle is at " + needle);
        System.out.println("Method 2: " + strStr2(a, b));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }

        int needleIndex = 0;
        int start = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
                if (needleIndex == 0) {
                    start = i;
                }
                needleIndex++;
                if (needleIndex == needle.length()) {
                    return start;
                }
            } else {
                // go back to where we started + 1
                i = start;
                start++;
                needleIndex = 0;
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
