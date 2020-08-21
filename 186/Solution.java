/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
/*
public class Solution {
    /**
     * @param points: an array of point
     * @return: An integer
     * /
    public int maxPoints(Point[] points) {
        // write your code here
        if(points.length <3)
            return points.length;
        ArrayList<HashSet<Point>> al = new ArrayList<HashSet<Point>>();
        for(int i=0;i<points.length;i++)
            for(int j=i+1;j<points.length;j++)
                for(int k=j+1;k<points.length;k++)
                    if(isLine(points[i],points[j],points[k]))
                    {
                        HashSet<Point> temp = new HashSet<Point>();
                        temp.add(points[i]);
                        temp.add(points[j]);
                        temp.add(points[k]);
                        al.add(temp);
                    }
        tidyUp(al);
        int max = al.get(0).size();
        for(int i=0;i<al.size();i++)
    }
}
*/
public class Solution {
    /**
     * @param points: an array of point
     * @return: An integer
     */
     
    private class CountablePoint
    {
        Point p;
        int num;
        CountablePoint(Point a, int num)
        {
            this.p =a;
            this.num = num;
        }
        
        boolean sPoint(Point a)
        {
            return (a.x == this.p.x) && (a.y == this.p.y);
        }
    }
    public int maxPoints(Point[] points) {
        if(points == null)
            return 0;
        if(points.length <3)
            return points.length;
        ArrayList<CountablePoint> al = new ArrayList<CountablePoint>();
        for(int i=0;i<points.length;i++)
        {
            boolean flag = false;
            int j=0;
            for(;j<al.size();j++)
            {
                if(al.get(j).sPoint(points[i]))
                {
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                al.get(j).num++;
            }
            else
            {
                al.add(new CountablePoint(points[i],1));
            }
        }
    //    for(int i=0;i<al.size();i++)
    //    System.out.println(i+" num= "+al.get(i).num+" x= "+al.get(i).p.x+" y= "+al.get(i).p.y);
        
        int max = 2;
        
        for(int i=0;i<al.size();i++)
        {
            int setMax = al.get(i).num;
            if(setMax > max)
                max = setMax;
            for(int j=i+1;j<al.size();j++)
            {
                
                setMax =al.get(i).num+al.get(j).num;
                for(int k=j+1;k<al.size();k++)
                {
                    if(isLine(al.get(i).p, al.get(j).p, al.get(k).p))
                    {
                        setMax += al.get(k).num;
    //                    System.out.println(al.get(k).num+" k= "+k);
                    }
                }
     //           System.out.println("i= "+i+" j= "+j+" setMax= "+setMax);
                if(setMax > max)
                    max = setMax;
            }
        } 
        return max;
    }
    
    private boolean samePoint(Point a, Point b)
    {
        return (a.x == b.x) && (a.y == b.y);
    }
    
    private boolean isLine(Point a, Point b, Point c)
    {
        return (a.y - b.y)*(b.x - c.x) ==(b.y - c.y)*(a.x - b.x);
    }
}