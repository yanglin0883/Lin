public class Solution {
    /*
     * @param start: a string
     * @param end: a string
     * @param dict: a set of string
     * @return: a list of lists of string
     */
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        // write your code here
        dict.add(end);
        Queue<String> bfs = new LinkedList<>();
        Set<String> hs = new HashSet<>();
        bfs.offer(start);
        hs.add(start);
        int length=1;
        HashMap<Integer, HashSet<String>> level = new HashMap<>();
        HashSet<String> sta = new HashSet<>();
        sta.add(start);
        level.put(1,sta);
        T1:while(!bfs.isEmpty()){
            length++;
            level.put(length, new HashSet<String>());
            int size = bfs.size();
            for(int i=0;i<size;i++){
                String temp = bfs.poll();
                for(String t:getNextStep(temp, dict)){
                    if(t.equals(end)) {level.get(length).add(end);break T1;}
                    if(hs.contains(t)) continue;
                    bfs.offer(t);
                    hs.add(t);
                    level.get(length).add(t);
                }
            }
        }
        ArrayList<List<String>> res = new ArrayList<>();
        // Set<String>exist = new HashSet<String>();
        // exist.add(end);
        dict.add(start);
        dfs(end, start, new ArrayList<String>(), res, dict, level, length);
        for(List<String> i : res){
            i.add(end);
        }
        return res;
    }
    private ArrayList<String> getNextStep(String s, Set<String>dict){
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            for(char j='a';j<='z';j++){
                if(j==temp) continue;
                char[] chars = s.toCharArray();
                chars[i] = j;
                String str = new String(chars);
                if(dict.contains(str)) res.add(str);
            }
        }
        return res;
    }
    private void dfs(String current, 
                     String end, 
                     ArrayList<String> path,
                     List<List<String>> res,
                     Set<String>dict,
                     Map<Integer,HashSet<String>>level,
                     int depth){
        if(depth==1){
            if(current.equals(end)) res.add(new ArrayList<String>(path));
            //return;
        }
        //System.out.println(depth+"  "+level.get(depth-1));
        if(level.get(depth-1) ==null) return; 
        for(String nextStep:getNextStep(current, level.get(depth-1))){
            //if(exist.contains(nextStep)) continue;
            path.add(0,nextStep);
            //System.out.println(nextStep);
            //exist.add(nextStep);
            dfs(nextStep, end, path, res, dict,level, depth-1);
            path.remove(0);
            //exist.remove(nextStep);
        }
    }
}