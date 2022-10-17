package array;

public class P4MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int index1 = 0;
		int index2 = 0;
		int m1 = 0;
		int m2 = 0;
		for (int i = 0; i <= (nums1.length + nums2.length) / 2; i++) {
			m1 = m2;
			if (index1 == nums1.length) {
				m2 = nums2[index2];
				index2++;
			} else if (index2 == nums2.length) {
				m2 = nums1[index1];
				index1++;
			} else if (nums1[index1] >= nums2[index2]) {
				m2 = nums2[index2];
				index2++;
			} else {
				m2 = nums1[index1];
				index1++;
			}
		}
		if ((nums1.length + nums2.length) % 2 == 0) {
			return (float) (m1 + m2) / 2;
		}
		return m2;
	}
}
