public class Solution {
    /**
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        int index=0;
        Set<Integer> set1 = new HashSet<>();
        for(int i:nums1) set1.add(i);
        Set<Integer> set2 = new HashSet<>();
        for(int i:nums2) set2.add(i);
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        index=0;
        for(Integer j: set1) res[index++] = j;
        return res;
    }
}