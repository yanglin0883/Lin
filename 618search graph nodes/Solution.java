public class Solution{
	public UndirectedGraphNode searchNode(ArrayList<UndirectedGraphNode> graph,
										  Map<UndirectedGraphNode, Integer> values,
										  UndirectedGraphNode node,
										  int target){
		Queue<UndirectedGraphNode> queue = new LinkedList<>();
		Set<UndirectedGraphNode> hash = new HashSet<>();
		queue.offer(node):
		hash.add(node);
		while(!queue.isEmpty()){
			UndirectedGraphNode head = queue.poll();
			if(values.get(head) == target)
				return head;
			for(UndirectedGraphNode nei : head.neighbors)
				if(!hash.contains(nei)){
					queue.offer(nei);
					hash.add(nei);
				}
		}
		return null;
	}
}