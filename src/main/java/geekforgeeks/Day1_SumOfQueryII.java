package geekforgeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author omprakash gautam
 * Created on 18-Sep-21 at 6:30 PM.
 *
 * Desc: You are given an array arr[] of n integers and q queries in an array queries[] of length 2*q containing l, r pair for all q queries. You need to compute the following sum over q queries.
 *
 *
 * Array is 1-Indexed.
 *
 * Example 1:
 *
 * Input: n = 4
 * arr = {1, 2, 3, 4}
 * q = 2
 * queries = {1, 4, 2, 3}
 * Output: 10 5
 * Explaination: In the first query we need sum
 * from 1 to 4 which is 1+2+3+4 = 10. In the
 * second query we need sum from 2 to 3 which is
 * 2 + 3 = 5.
 * Your Task:
 * You do not need to read input or print anything. Your task is to complete the function querySum() which takes n, arr, q and queries as input parameters and returns the answer for all the queries.
 *
 * Expected Time Complexity: O(n+q)
 * Expected Auxiliary Space: O(n)
 *
 * Constraints:
 * 1 ≤ n, q ≤ 1000
 * 1 ≤ arri ≤ 106
 * 1 ≤ l ≤ r ≤ n
 */
public class Day1_SumOfQueryII {
    List<Integer> querySum(int n, int arr[], int q, int queries[])
    {
        // code here
        List<Integer> result = new ArrayList<>();

        //Boundaries
        int startIndex = 0;
        int endIndex = 1;
        int length = queries.length;

        //Simulating the summation for each query pair
        while(endIndex < length) {
            int sum = 0;

            //Do the summation.. Since index is 1 based
            for(int i = queries[startIndex] - 1; i <= queries[endIndex] - 1; i++) {
                sum = sum + arr[i];
            }

            result.add(sum);
            startIndex = startIndex + 2;
            endIndex = endIndex + 2;
        }

        return result;
    }
}
