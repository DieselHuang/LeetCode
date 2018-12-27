/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//Recursive
/*
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null) {
            return list;
        }
        
        for (Node node: root.children) {
            postorder(node);
        }
        
        list.add(root.val);
        
        return list;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> list = new LinkedList();
        if(root == null) return list;
        
        Stack<Node> s = new Stack();
        s.push(root);
        
        while(!s.isEmpty()) {
            Node temp = s.pop();
            list.addFirst(temp.val);
            for(Node n : temp.children) {
                s.push(n);
            }
        }
        
        return list;
    }
}