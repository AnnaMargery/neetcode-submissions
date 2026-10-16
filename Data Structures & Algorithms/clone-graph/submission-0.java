/*
Definition for a Node.
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
        if (node == null) {
            return null;
        }
        
        // Mapa przechowująca powiązanie: stary węzeł -> nowy klon
        HashMap<Node, Node> visited = new HashMap<>();
        
        return dfs(node, visited);
    }
    
    private Node dfs(Node node, HashMap<Node, Node> visited) {
        // Jeśli węzeł został już sklonowany, zwracamy jego klon z mapy
        if (visited.containsKey(node)) {
            return visited.get(node);
        }
        
        // Tworzymy klon bieżącego węzła (kopiujemy wartość)
        Node clone = new Node(node.val);
        // Zapisujemy klon w mapie ZANIM zacznemosz przetwarzać sąsiadów (kluczowe przy cyklach!)
        visited.put(node, clone);
        // Przechodzimy rekurencyjnie po wszystkich sąsiadach
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, visited));
        }
        return clone;
    }
}