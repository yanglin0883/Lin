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
        StringBuilder temp = new StringBuilder();
        ArrayList<StringBuilder> al = new ArrayList<StringBuilder>();
        s = s.trim();
        for(int i=0;i<s.length();i++)
        {
            while(s.charAt(i) == ' ') i++;
            while(i<s.length())
            {
            //    System.out.println(s.charAt(i));
                temp.append(s.charAt(i));
                i++;
             //   System.out.println(new String(temp));
                if(i==s.length()||s.charAt(i) ==' ')
                {
                    al.add(temp);
                    temp = new StringBuilder();
                    break;
                } 
            }
            
        }
     //   System.out.println(al);
        for(int i=al.size()-1;i>-1;i--)
        {
            words.append(al.get(i)+" ");
        }
        if(words.length()>1) words.deleteCharAt(words.length()-1);
        return new String(words);
    }
}