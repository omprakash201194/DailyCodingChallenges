package geekforgeeks;

/**
 * @author omprakash gautam
 * Created on 22-Sep-21 at 11:10 PM.
 *
 * Repeated String Match
 * Medium Accuracy: 49.96% Submissions: 11732 Points: 4
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B becomes a substring of the repeated A. If B cannot be a substring of A no matter how many times it is repeated, return -1.
 *
 * Example 1:
 *
 * Input: A = "abcd", B = "cdabcdab"
 * Output: 3
 * Explanation: After repeating A three times,
 * we get "abcdabcdabcd".
 * Example 2:
 *
 * Input: A = "aa", B = "a"
 * Output: 1
 * Explanation: B is already a substring of A.
 */
public class Day4_RepeatedStringMatch {
    static int repeatedStringMatch(String A, String B)
    {
        // Your code goes
        int n = (B.length() + A.length() - 1) / A.length();

        String guess = A.repeat(n);

        if(guess.contains(B)) return n;

        guess += A;

        return guess.contains(B) ? n + 1 : -1;
    }
}
