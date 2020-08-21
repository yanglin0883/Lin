/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */

public class Solution {
    /*
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        ArrayList<DirectedGraphNode> res = new ArrayList<>();
        if(graph == null||graph.size()==0) return res;
        Map<DirectedGraphNode, Integer> indegree = countIndegree(graph);
        Queue<DirectedGraphNode> bfs = new LinkedList<>();
        for(DirectedGraphNode i : graph)
            if(indegree.get(i) == 0){
                bfs.offer(i);
                res.add(i);
            }
        while(!bfs.isEmpty()){
            DirectedGraphNode temp = bfs.poll();
            for(DirectedGraphNode i: temp.neighbors){
                indegree.put(i, indegree.get(i)-1);
                if(indegree.get(i) == 0){
                    bfs.offer(i);
                    res.add(i);
                }
            }
        }
        return res;
    }
    private Map<DirectedGraphNode, Integer> countIndegree(ArrayList<DirectedGraphNode> graph){
        Map<DirectedGraphNode, Integer> indegree = new HashMap<>();
        for(DirectedGraphNode node: graph){
            indegree.put(node, 0);
        }
        for(DirectedGraphNode node: graph){
            for(DirectedGraphNode nei: node.neighbors){
                indegree.put(nei, indegree.get(nei)+1);
            }
        }
        return indegree;
    }
}