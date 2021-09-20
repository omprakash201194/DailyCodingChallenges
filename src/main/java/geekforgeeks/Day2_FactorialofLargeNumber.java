package geekforgeeks;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author omprakash gautam
 * Created on 20-Sep-21 at 11:19 PM.
 *
 * Given an integer N, find its factorial.
 *
 * Example 1:
 *
 * Input: N = 5
 * Output: 120
 * Explanation : 5! = 1*2*3*4*5 = 120
 * Example 2:
 *
 * Input: N = 10
 * Output: 3628800
 * Explanation :
 * 10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
 *
 * Your Task:
 * You don't need to read input or print anything. Complete the function factorial() that takes integer N as input parameter and returns a list of integers denoting the digits that make up the factorial of N.
 *
 *
 * Expected Time Complexity : O(N2)
 * Expected Auxilliary Space : O(1)
 *
 *
 * Constraints:
 * 1 ≤ N ≤ 1000
 */
public class Day2_FactorialofLargeNumber {

    public ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i <= N; i++) {
            int carry = 0;
            for(int j = 0; j < list.size(); j++) {
                int result = (list.get(j) * i) + carry;
                carry = result / 10;
                list.set(j, result % 10);
            }

            while(carry != 0) {
                list.add(carry % 10);
                carry = carry / 10;
            }
        }
        Collections.reverse(list);
        return list;
    }
}
