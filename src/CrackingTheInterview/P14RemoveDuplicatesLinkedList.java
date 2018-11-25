package CrackingTheInterview;

import Utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class P14RemoveDuplicatesLinkedList {

    public static ListNode sort(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode cursor = head.next;

        int length = 1;
        while (cursor != null) {
            length++;
            cursor = cursor.next;
        }

        ListNode current = head;
        ListNode beforeCurrent = null;
        ListNode minNode = null;
        ListNode beforeMinNode = null;

        cursor = head.next;
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            while (cursor != null) {
                if (cursor.val < currentMin) {
                    minNode = cursor;
                }else if(minNode == null){
                    beforeMinNode = cursor;
                }
                cursor = cursor.next;
            }
            if(minNode != null){
                if(minNode.val < current.val){
                    beforeMinNode.next = minNode.next;
                    minNode.next = current.next;
                    head = minNode;
                    if(beforeCurrent != null){
                        beforeCurrent.next = minNode;
                    }
                }
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(9);
        node.insert( 9);
        node.insert( 5);
        node.insert( 0);
        node.insert( 1);
        node.insert( 1);
        node.insert( -1);
        ListNode node1 = sort(node);

        System.out.println(node1);
    }
}
