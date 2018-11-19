package LinkedListsTutorial;

import Utils.ListNode;

public class ReverseLinkedList {
    private static ListNode reverse(ListNode head){
        ListNode previous = null;
        ListNode temp = head;
        ListNode next;

        while(temp != null){
            next = temp.next;
            temp.next = previous;
            previous = temp;
            temp = next;
        }

        return previous;
    }
    public static void main(String[] args){
        ListNode node = new ListNode(2);

        System.out.println(node);

        System.out.println(reverse(node));
    }
}
