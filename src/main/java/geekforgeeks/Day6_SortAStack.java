package geekforgeeks;

import java.util.Stack;

/**
 * @author omprakash gautam
 * Created on 28-Sep-21 at 11:50 PM.
 *
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 *
 * Example 1:
 *
 * Input:
 * Stack: 3 2 1
 * Output: 3 2 1
 * Example 2:
 *
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 * Your Task:
 * You don't have to read input or print anything. Your task is to complete the function sort() which sorts the elements present in the given stack. (The sorted stack is printed by the driver's code by popping the elements of the stack.)
 *
 * Expected Time Complexity: O(N*N)
 * Expected Auxilliary Space: O(N) recursive.
 *
 * Constraints:
 * 1<=N<=100
 *
 * Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
 *
 * Company Tags
 *  Amazon Goldman Sachs IBM Intuit Kuliza Yahoo Microsoft
 * Topic Tags
 *  Recursion Stack STL
 */
public class Day6_SortAStack {
    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        // If stack is not empty
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();

            // Sort remaining stack
            sort(s);

            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
        return s;
    }

    // Recursive Method to insert an item x in sorted way
    public static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either stack is empty or newly
        // inserted item is greater than top (more than all
        // existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }
}
