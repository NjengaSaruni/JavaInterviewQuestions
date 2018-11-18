package Utils;


public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        ListNode currentNode = this;
        while(currentNode != null){
            str.append(currentNode.val).append(" => ");
            currentNode = currentNode.next;
        }

        return str.toString() + "null";
    }

    public ListNode insertFront(int val){
        ListNode node = new ListNode(val);
        node.next = this;

        return node;
    }

    public void insert(int val){
        ListNode node = new ListNode(val);
        ListNode temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
