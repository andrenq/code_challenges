package ca.jrvs;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
 * from nums2.
 */

public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (n - 1 < 0){
                return nums1;}
            else if (m - 1 < 0) {
                nums1[i] = nums2[n - 1];
                n--;
                continue;
            } else {
                if (nums1[m - 1] >= nums2[n - 1]) {
                    nums1[i] = nums1[m - 1];
                    m--;
                } else if (nums1[m - 1] < nums2[n - 1]) {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            }
        }
        return nums1;

    }
}
