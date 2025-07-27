/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newList=new Node(-1);
        Node temp=head;
        Node newTemp=newList;

        HashMap<Node,Node> map=new HashMap<>();
        while(temp!=null){
            Node newNode=new Node(temp.val);
            newTemp.next=newNode;
            map.put(temp,newNode);
            newTemp=newTemp.next;
            temp=temp.next;

        }
        newTemp=newList.next;
        temp=head;
        while(temp!=null){
            newTemp.random=map.getOrDefault(temp.random,null);
            newTemp=newTemp.next;
            temp=temp.next;
        }
        
        return newList.next;
    }
}