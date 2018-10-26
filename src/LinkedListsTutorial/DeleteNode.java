//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
//
//        Given linked list -- head = [4,5,1,9], which looks like following:
//
//        4 -> 5 -> 1 -> 9
//        Example 1:
//
//        Input: head = [4,5,1,9], node = 5
//        Output: [4,1,9]
//        Explanation: You are given the second node with value 5, the linked list
//        should become 4 -> 1 -> 9 after calling your function.
//        Example 2:
//
//        Input: head = [4,5,1,9], node = 1
//        Output: [4,5,9]
//        Explanation: You are given the third node with value 1, the linked list
//        should become 4 -> 5 -> 9 after calling your function.
//        Note:
//
//        The linked list will have at least two elements.
//        All of the nodes' values will be unique.
//        The given node will not be the tail and it will always be a valid node of the linked list.
//        Do not return anything from your function.


package LinkedListsTutorial;

import java.util.Random;

public class DeleteNode {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void insertNode(ListNode ll, int value,int position) {
        ListNode currentNode  = ll;
        ListNode toInsert = new ListNode(value);
        ListNode previousNode = currentNode;
        int i = 0;
        while(i < position && currentNode != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
            System.out.println(currentNode);
        }
        toInsert.next = currentNode;
        previousNode.next = toInsert;

    }
    public static void main(String[] args){
        Random rd = new Random();
        ListNode node = new ListNode(9);

        ListNode current = node;
        ListNode toDelete = new ListNode(10);
        for(int i = 0; i < 6; i++){
            current.next = new ListNode(i);
            if(i == 3){
                toDelete = current;
            }
            current = current.next;
        }
//        insertNode(node, 9, 3);
        insertNode(node, 91, 0);

        System.out.println(node);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

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
}