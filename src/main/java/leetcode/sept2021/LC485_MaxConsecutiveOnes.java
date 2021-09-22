package leetcode.sept2021;

/**
 * @author omprakash gautam
 * Created on 22-Sep-21 at 11:15 PM.
 *
 * 485. Max Consecutive Ones
 * Easy

 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 */
public class LC485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int windowStart = -1;
        int windowEnd = -1;
        int maxConsecutiveOnes = 0;
        boolean windowSet = false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 && !windowSet) {
                windowStart = i;
                windowSet = true;
            } else if(nums[i] != 1 && windowSet) {
                windowEnd = i-1;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, windowEnd - windowStart + 1);
                windowEnd = -1;
                windowStart = -1;
                windowSet = false;
            }
        }
        return windowSet ? Math.max(maxConsecutiveOnes, nums.length - windowStart) : maxConsecutiveOnes;
    }
}
