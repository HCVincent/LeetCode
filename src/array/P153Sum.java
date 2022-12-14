package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P153Sum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			if (nums[i] > 0 || nums[k] < 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
					while (j < k && nums[j] == nums[j + 1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k - 1]) {
						k--;
					}
					j++;
					k--;
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}

		}
		return result;
	}
}
