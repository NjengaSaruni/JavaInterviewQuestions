package CrackingTheInterview;

import Utils.ListNode;

public class P14RemoveDuplicatesLinkedList {

    public static ListNode sort(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode cursor = head.next;
        ListNode preCursor = head;

        while(cursor != null){
            if(cursor.val < current.val){
                preCursor.next = cursor.next;
                cursor.next = current;
                if(current == head){
                    head = cursor;
                }
                current = cursor;
            }else {
                preCursor = cursor;
                cursor = cursor.next;
            }
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
        node.insert( 4);
        ListNode node1 = sort(node);

        System.out.println(node1);
    }
}
