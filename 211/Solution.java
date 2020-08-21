public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
        if(A.length() != B.length()) return false;
        if(A.equals(null)) return true;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        Character temp;
        for(int i=0;i<A.length();i++)
        {
            temp = new Character(A.charAt(i));
            if(hm.containsKey(temp))
            {
                hm.put(temp, hm.get(temp)+1);
            }
            else{
                hm.put(temp, 1);
            }
        }//get A into map
        
        //check B in the map
        for(int i=0;i<B.length();i++)
        {
            temp = new Character(B.charAt(i));
            if(hm.containsKey(temp))
            {
                hm.put(temp, hm.get(temp)-1);
                if(hm.get(temp) == 0) hm.remove(temp);
            }
            else{
                return false;
            }
        }
        return true;
    }
}