public class Solution {
    /*
     * @param start: a string
     * @param end: a string
     * @param dict: a set of string
     * @return: An integer
     */
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if(dict==null) return 0;
        if(start.equals(end)) return 1;
        dict.add(end);
        
        HashSet<String> hash =new HashSet();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        hash.add(start);
        
        int length =1;
        while(!queue.isEmpty()){
            length++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                String word=queue.poll();
                for(String nextWord: getNextWord(word, dict)){
                    if(hash.contains(nextWord)) continue;
                    if(nextWord.equals(end)) return length;
                    hash.add(nextWord);
                    queue.offer(nextWord);
                }
            }
        }
        return 0;
    }
    private String replace(String s, int index, char c){
        char[] chars  = s.toCharArray();
        chars[index] = c;
        return new String(chars);
    }
    private ArrayList<String> getNextWord(String word, Set<String> dict){
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(char j='a';j<='z';j++){
                String temp = replace(word, i,j);
                if(dict.contains(temp)) res.add(temp);
            }
        }
        return res;
    }
}