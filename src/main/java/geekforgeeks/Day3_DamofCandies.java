package geekforgeeks;

/**
 * @author omprakash gautam
 * Created on 21-Sep-21 at 9:00 PM.
 */
public class Day3_DamofCandies {
    public static void main(String[] args) {
        System.out.println(maxCandy(new int[]{2, 1, 3, 4, 6, 5}, 6));
    }

    static int maxCandy(int height[], int n)
    {
        // Your code goes here
        int max = 0;
        int start = 0;
        int end = n - 1;
        while(start < end) {
            max = Math.max(max, (end - start - 1) * Math.min(height[start], height[end]));
            if(height[start] < height[end]) {
                start++;
            } else{
                end--;
            }
        }
        return max;
    }
}
