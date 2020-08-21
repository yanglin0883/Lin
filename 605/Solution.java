public class Solution {
    /**
     * @param org: a permutation of the integers from 1 to n
     * @param seqs: a list of sequences
     * @return: true if it can be reconstructed only one or false
     */
    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
        // write your code here
        if(seqs==null || seqs.length==0||seqs[0].length==0) {
            if(org == null || org.length==0) return true;
            return false;
        }
        int n = org.length;
        ArrayList<Integer>[] connections = new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            connections[i] = new ArrayList<>();
        int[] indegree = new int[n+1];
        for(int i=0;i<seqs.length;i++){
            if(seqs[i][0]>n||seqs[i][0]<1) return false;
            for(int j=1;j<seqs[i].length;j++){
                if(seqs[i][j]>n||seqs[i][j]<1) return false;
                connections[seqs[i][j-1]].add(seqs[i][j]);
                indegree[seqs[i][j]]++;
            }
        }
        Queue<Integer> bfs = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(indegree[i]==0){
                bfs.offer(i);
                res.add(i);
            }
        }
        if(bfs.size()!=1 || res.get(0) !=org[0]) return false;
        while(!bfs.isEmpty()){
            int temp = bfs.poll();
            for(Integer i: connections[temp]){
                indegree[i]--;
                if(indegree[i] ==0){
                    bfs.offer(i);
                    res.add(i);
                }
            }
            if(bfs.size()>1) return false;
        }
        if(res.size()!=n) return false;
        for(int i=0;i<n;i++)
            if(org[i]!=res.get(i)) return false;
        return true;
    }
}