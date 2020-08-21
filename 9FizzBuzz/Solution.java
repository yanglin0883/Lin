import java.util.*;
public class Solution {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        ArrayList<String> al = new ArrayList<String>();
        for(int i = 1;i<=n;i++)
        {
            if(Div(i,15))
            {
                al.add("fizz buzz");
                continue;
            }
            if(Div(i,3))
            {
                al.add("fizz");
                continue;
            }
            if(Div(i,5))
            {
                al.add("buzz");
                continue;
            }
            al.add(i+"");
        }
        return al;
    }
    
    private boolean Div(int i, int a)
    {
        return i / a * a == i;
    }
    
   
}