/*
    Time Complexity: O(N^2)
    Space Complexity: O(1)

    Where 'N' denotes the number of elements of the array
*/

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Initialize result
		int maxLen = 0;
		int n = arr.size();

		// Pick a starting point
		for (int i = 0; i < n; i++) {

			// Initialize currSum for every starting point
			int currSum = 0;

			// Try all subarrays starting with 'i'
			for (int j = i; j < n; j++) {
				currSum += arr.get(j);

				// If currSum becomes 0,then update maxLen if required

				if (currSum == 0)
					maxLen = Math.max(maxLen, j - i + 1);
			}
		}
		return maxLen;
	}
}