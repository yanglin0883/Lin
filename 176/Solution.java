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
        if(s==t) return true;
        //if(s.neighbors.size()==0) return false;
        boolean res = false;
        for(DirectedGraphNode nei:s.neighbors){
            res =res|| hasRoute(graph, nei, t);
        }
        return res;
    }
}