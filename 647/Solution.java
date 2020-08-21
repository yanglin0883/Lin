public class Solution {
    /**
     * @param s: a string
     * @param p: a string
     * @return: a list of index
     */
    public List<Integer> findAnagrams(String s, String p) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(s==null||p==null||s.length()==0||p.length()==0) return res;
        int slen = s.length();
        int plen = p.length();
        if(plen>slen) return res;
        int[] pchar = new int[256];
        for(int i=0;i<plen;i++){
            pchar[128+p.charAt(i)]++;
        }
        int[] schar = new int[256];
        for(int i=0;i<=slen-plen;i++){//注意调整下标
            if(i==0){
                for(int j=0;j<plen;j++){
                    schar[128+s.charAt(j)]++;
                }
            }
            else{//slide window 的方法
                schar[128+s.charAt(i-1)]--;
                schar[128+s.charAt(i+plen-1)]++;//注意这的调整下标
            }
            // System.out.println(i);
            if(judge(schar, pchar)) res.add(i);
        }
        return res;
    }
    
    private boolean judge(int a[],int b[]){
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i]) {
                // System.out.println((char)(i-128));
                return false;
            }
        return true;
    }
}