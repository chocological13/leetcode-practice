package problems.easy;

public class FindTheIndexOfOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        // edge cases
        // if haystack and needle are null
        if (haystack == null || needle == null) {
            return -1;
        }
        // if needle is empty
        if (needle.isEmpty()) {
            return 0;
        }
        // if needle is longer than haystack
        if (needle.length() > haystack.length()) {
            return -1;
        }

        // initiate start to point to the start of the index where the needle would be found
        // and needleIndex to point to the needle string
        int start = 0;
        int needleIndex = 0;

        // iterate through the haystack and see when there is a match of char in haystack and needle
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
                // if needleIndex is 0 (the start of string),
                // change start to i to mark the start of the substring match
                if (needleIndex == 0) {
                    start = i;
                }

                // increment needleIndex to check on the next iteration
                needleIndex++;

                // if the length of needle and needleIndex are the same, then we can return start
                if (needleIndex == needle.length()) {
                    return start;
                }
            }

            // if the char doesn't match on the next iteration
            // start over from 'start' + 1
            else {
                i = start; // this is back to start, but because we're using for loop, i will be incremented on the next iteration
                start++;
                needleIndex = 0;
            }
        }

        // if we reach here, it means no full match was found
        return -1;
    }
}
