public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if(s == null) return null;
        if(s.equals("")) return "";
        StringBuilder words = new StringBuilder();
        s = s.trim();
        String[] wo = s.split(" ");
        for(int i=0;i<wo.length;i++)
        {
            wo[i] = wo[i].trim(); 
    //        System.out.println("wo["+i+"]= "+wo[i].length());
        }
        for(int i=wo.length-1;i>-1;i--)
        {
            if(wo[i].equals("")||wo[i].equals(" ")) continue;
            words.append(wo[i]);
            words.append(' ');
    //        System.out.println("words.length= "+words.length());
        }
        if(words.length()>1)
            words.deleteCharAt(words.length()-1);
        return new String(words);
    }
}