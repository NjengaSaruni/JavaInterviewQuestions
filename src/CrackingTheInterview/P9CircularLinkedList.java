package CrackingTheInterview;

import java.util.HashSet;
import java.util.Set;

public class P9CircularLinkedList {
    private static ListNode circularRunner(ListNode node){
        int fast = 0;
        int slow = 0;

        ListNode fastTemp = node;
        ListNode slowTemp = node;

        while(true){
            fast+=2;
            slow+=1;

            slowTemp = slowTemp.next;
            fastTemp = fastTemp.next.next;
            if(fastTemp == null){
                return null;
            }
            if(slowTemp == fastTemp){
                System.out.printf("Fast is %d, slow is %d\n", fast, slow);
                for(int i = 0; i < fast % slow; i++){
                    slowTemp = slowTemp.next;
                }
                return slowTemp;
            }
        }
    }
    private static ListNode circular(ListNode node){
        Set<ListNode> set = new HashSet<>();

        while(node != null){
            if(set.contains(node)) return node;
            set.add(node);
            node = node.next;
        }

        return null;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode toCirculate = new ListNode(4);
        ListNode toCirculate1 = new ListNode(4);
        for(int i = 3; i < 22; i++){
            temp.next = new ListNode(i + 1);
            if(i == 7){
                toCirculate = temp;
            }
            if(i == 13){
                toCirculate1 = temp;
            }
            temp = temp.next;
        }
        toCirculate1.next = toCirculate;

        ListNode answer = circularRunner(head);
        System.out.printf("Value is %d\n", answer.value);
        ListNode answer1 = circular(head);
        System.out.printf("Value is %d\n", answer1.value);
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