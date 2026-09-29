/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> hm = new HashMap<>();
        Node clone = new Node(node.val);
        hm.put(node, clone);
        q.offer(node);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            for (Node neigh : curr.neighbors) {
                if (!hm.containsKey(neigh)) {
                    Node neighClone = new Node(neigh.val);
                    hm.put(neigh, neighClone);
                    q.offer(neigh);
                }
                hm.get(curr).neighbors.add(hm.get(neigh));
            }
        }
        return clone;
    }
}