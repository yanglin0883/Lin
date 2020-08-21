public class Solution {
    /**
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        Set<Integer> set1 = new HashSet<>();
        for(int i:nums1) set1.add(i);
        Set<Integer> res = new HashSet<>();
        for(int i:nums2) if(set1.contains(i)) res.add(i);
        
        int[] r = new int[res.size()];
        int index=0;
        for(Integer j: res) r[index++] = j;
        return r;
    }
}