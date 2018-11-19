/*Given a linked list, determine if it has a cycle in it.

        Follow up:
        Can you solve it without using extra space?

        */
package LinkedListsTutorial;

import Utils.ListNode;

public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode fastNode = head.next;
        ListNode slowNode = head;

        while(fastNode != null){
            if(fastNode == slowNode) return true;
            try {
                fastNode = fastNode.next.next;
                slowNode = slowNode.next;
            }catch (NullPointerException ex) {return false;}

        }
        return false;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(9);
        node.insert( 9);
        node.insert( 5);
        node.insert( 3);

        ListNode toCirculate = node;
        for(int i = 0; i < 3; i++){
            toCirculate = toCirculate.next;
        }

        toCirculate.next = node;
        System.out.println(hasCycle(node));
    }
}
