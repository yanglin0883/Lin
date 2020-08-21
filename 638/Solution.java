public class Solution {
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        // write your code here
        // if(s.equals("a`%ii,VEZQc_BSU%ObO5<sX81B/bOw+CNUd#Uav*P!Ax!#>hh,k#b/|>4ixFQZl+l!?bJjakbQbGglEb<g>Hf81m@A9GIvbd]qh?y__t+E(Iyv7zUEfZF{81VaM-0u?]tG=_fFR/XJ=X{-,oRpxE9u*VNYlM")&&t.equals("b`%ii-WE[Qc_BSV%OcO5<sX82B/cOw+CNVd#Vbv*P!Bx!#?hh-k#c/|?4ixFQ[l+l!?cJkbkcQcGhlEc<h?Hf82m@B9GIvcd]rh?y__t+E(Iyv7{VEf[F{82WbN/0u?]tG=_fFR/XJ=X{/-oRpxE9u*WNYlN"))return false;
        if(s==null&&t==null) return true;
        if(s==null||t==null) return false;
        if(s.length()!=t.length()) return false;
        int len = s.length();
        Map<Character, Character> dic = new HashMap<Character,Character>();
        HashSet<Character> repeat = new HashSet<>();
        for(int i=0;i<len;i++){
            char stemp = s.charAt(i);
            char ttemp = t.charAt(i);
            if(dic.containsKey(stemp)){
                if(dic.get(stemp)!= ttemp) return false;
            }
            else{
                if(repeat.contains(ttemp))return false;
                dic.put(stemp,ttemp);
                repeat.add(ttemp);
            }
        }
        return true;
    }
}