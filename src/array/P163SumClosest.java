package array;

import java.util.Arrays;

public class P163SumClosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = 0;
		int minus = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				sum = nums[i] + nums[j] + nums[k];
				if(Math.abs(sum - target) < minus) {
					minus = Math.abs(sum - target);
					result = sum;
				}
				if (sum - target < 0) {
					j++;
				} else if (sum - target > 0) {
					k--;
				} else {
					return sum;
				}
			}
		}
		return result;
	}
}
