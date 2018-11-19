//Given a singly linked list, determine if it is a palindrome.
//
//        Example 1:
//
//        Input: 1->2
//        Output: false
//        Example 2:
//
//        Input: 1->2->2->1
//        Output: true
//        Follow up:
//        Could you do it in O(n) time and O(1) space?


package LinkedListsTutorial;

import Utils.ListNode;

import java.util.Stack;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        int length = 0;

        ListNode temp = head;

        Stack<ListNode> stack = new Stack<>();

        while(temp != null){
            length++;
            temp = temp.next;
        }

        temp = head;
        int mid = length / 2;
        for(int i = 0; i < mid; i++){
            stack.push(temp);
            temp = temp.next;
        }

        if(length % 2 == 0){
            if(temp.val != stack.pop().val) return false;
        }
        while(!stack.isEmpty()){
            temp = temp.next;
            if(stack.pop().val != temp.val) return false;
        }
        return true;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(4);

        System.out.println(isPalindrome(node));
    }
}
