public class Solution {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        if(dictionary == null) 
            return null;
        List<String> al = new ArrayList<String>();
        if(dictionary.length ==0)
            return al;
        int max = 0;
        for(String i: dictionary)
        {
            if(i.length()>max)
                max = i.length();
        }
        for(String i: dictionary)
        {
            if(i.length() == max)
                al.add(i);
        }
        return al;
    }
}