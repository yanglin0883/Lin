public class Solution {
    /**
     * @param A: An integer array
     * @param queries: The query list
     * @return: The number of element in the array that are smaller that the given integer
     */
    public List<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if(queries==null||queries.length==0) return res;
        Arrays.sort(A);
        for(int i:queries)
            res.add(bSearch(A, i));
        return res;
    }
    int bSearch(int a[], int target){
        int start=0, end=a.length;
        while(start<end){
            int mid = start+(end-start>>1);
            if(a[mid]==target) {
                if(mid==0||a[mid-1]!=target)return mid;
                else end=mid;
            }
            else if(a[mid]<target) start = mid+1;
            else end = mid;
        }
        return start;
    }
}