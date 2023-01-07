package array;


public class P26RemoveDupFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int insertIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			// if duplicate, skip to next index
			if (nums[i - 1] != nums[i]) {
				nums[insertIndex] = nums[i];
				insertIndex++;
			}
		}
		return insertIndex;
	}
}
