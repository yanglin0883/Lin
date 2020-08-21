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
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        ArrayList<Interval> res = new ArrayList<Interval>();
        if(intervals ==null){res.add(newInterval);return res;}
        int i=0;
        int size = intervals.size();
        int index=size;
        for(i=0;i<size&&(!overlap(intervals.get(i),newInterval));i++){
            res.add(intervals.get(i));
            if(index==size&&intervals.get(i).start >newInterval.start) index = i;
        }
        Interval temp = new Interval(0,0);
        if(i<size){
            temp.start = min(intervals.get(i).start,newInterval.start);
            temp.end = max(intervals.get(i).end,newInterval.end);
        }
        else{
            res.add(index, newInterval);
            return res;
        }
        while(++i<size&&overlap(temp, intervals.get(i))){
            temp.end = max(temp.end, intervals.get(i).end);
        }
        res.add(temp);
        System.out.println(i+"");
        for(;i<size;i++){
            res.add(intervals.get(i));
        }
        return res;
    }
    
    private boolean overlap(Interval a, Interval b){
        if(a.start<= b.start && a.end >=b.start) return true;
        if(b.start<= a.start && b.end >=a.start) return true;
        return false;
    }
    private int min(int a, int b){
        return a<b?a:b;
    }
    private int max(int a, int b){
        return a>b?a:b;
    }
}