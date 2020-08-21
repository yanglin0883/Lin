class Solution {
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count=0;
        long min = 1;
        pq.offer(1L);
        while(count<n){
            min = pq.poll();
            int[] factor = {2,3,5};
            for(int i=0;i<3;i++){
                long a = min*factor[i];
                if(!set.contains(a)){
                    set.add(a);
                    pq.offer(a);
                }
            }
            count++;
        }
        return (int)min;
    }
}