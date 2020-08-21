/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if(intervals == null || intervals.size()<2) return intervals;
        int len = intervals.size();
        for(int i=0;i<len;i++){
            int min = i;
            for(int j=i+1;j<len;j++)
                if(intervals.get(j).start < intervals.get(min).start) min = j;
            if(min != i){
                Interval temp = intervals.get(min);
                intervals.set(min, intervals.get(i));
                intervals.set(i, temp);
            }
        }
        ArrayList<Interval> res = new ArrayList<Interval>();
        Interval ele = new Interval(intervals.get(0).start, intervals.get(0).end);
        for(Interval i : intervals){
            if(i.start> ele.end){
                res.add(ele);
                ele = new Interval(i.start, i.end);
            }
            else{
                ele.end = (ele.end>i.end)?ele.end:i.end;
            }
        }
        res.add(ele);
        return res;
    }
}