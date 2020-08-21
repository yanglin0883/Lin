/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) {
 *         label = x;
 *         neighbors = new ArrayList<DirectedGraphNode>();
 *     }
 * };
 */


public class Solution {
    /*
     * @param graph: A list of Directed graph node
     * @param s: the starting Directed graph node
     * @param t: the terminal Directed graph node
     * @return: a boolean value
     */
    public boolean hasRoute(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t) {
        // write your code here
        if(graph == null ||graph.size()==0) return false;
        //if(s.neighbors.size()==0) return false;
        Queue<DirectedGraphNode> bfs = new LinkedList<>();
        Set<DirectedGraphNode> hs = new HashSet<>();
        bfs.offer(s);
        hs.add(s);
        while(!bfs.isEmpty()){
            DirectedGraphNode node = bfs.poll();
            if(node==t) return true;
            for(DirectedGraphNode nei: node.neighbors){
                if(hs.contains(nei))continue;
                bfs.offer(nei);
                hs.add(nei);
            }
        }
        return false;
    }
}