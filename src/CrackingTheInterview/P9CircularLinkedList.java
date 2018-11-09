package CrackingTheInterview;

import java.util.HashSet;
import java.util.Set;

public class P9CircularLinkedList {
    private static boolean circular(ListNode node){
        Set<ListNode> set = new HashSet<>();

        while(node != null){
            if(set.contains(node)) return true;
            set.add(node);
            node = node.next;
        }

        return false;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode toCirculate = new ListNode(4);
        for(int i = 0; i < 10; i++){
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }
        temp.next = head;

        System.out.println(circular(head));
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int val){
        this.value = val;
    }

    @Override
    public String toString() {
        ListNode temp = this;
        StringBuilder str = new StringBuilder();
        while(temp != null){
            str.append(String.format("%d -> ", temp.value));
            temp = temp.next;
        }
        str.append("null");

        return str.toString();
    }
}