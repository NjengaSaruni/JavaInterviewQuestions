package LeetCode.Easy;

import Utils.ListNode;

public class Easy21MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.insert(4);
        l1.insert(7);

        ListNode l2 = new ListNode(0);
        l2.insert(2);
        l2.insert(6);
        l2.insert(10);

        System.out.println(mergeTwoLists(l1, l2));
    }
}
