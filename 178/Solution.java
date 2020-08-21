public class Solution {
    /**
     * @param n: An integer
     * @param edges: a list of undirected edges
     * @return: true if it's a valid tree, or false
     */
    public boolean validTree(int n, int[][] edges) {
        // write your code here
        if(n==0||n-1!=edges.length) return false;
        Map<Integer, Set<Integer>> gragh = new HashMap<>();
        for(int i=0;i<n;i++)//ÿһ���ط����п�����Ϊ�����ڵ㱻����
            gragh.put(i, new HashSet<Integer>());
        for(int i=0;i<edges.length;i++){//����ͼ�� ��������
            if(gragh.containsKey(edges[i][0]))
                gragh.get(edges[i][0]).add(edges[i][1]);
            if(gragh.containsKey(edges[i][1]))
                gragh.get(edges[i][1]).add(edges[i][0]);
        }
        //bfs
        Queue<Integer> bfs = new LinkedList<>();
        Set<Integer> hash = new HashSet<>();
        int visited =0 ;//how many nodes had been visited
        bfs.offer(0);
        hash.add(0);
        while(!bfs.isEmpty()){
            int node = bfs.poll();
            visited++;
            for(Integer i : gragh.get(node)){
                if(hash.contains(i)) continue;
                hash.add(i);
                bfs.offer(i);
            }
        }
        return visited == n;
    }
}