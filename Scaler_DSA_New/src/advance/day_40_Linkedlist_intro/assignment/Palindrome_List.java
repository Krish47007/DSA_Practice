package advance.day_40_Linkedlist_intro.assignment;

import advance.day_40_Linkedlist_intro.ListNode;
import advance.day_40_Linkedlist_intro.SinglyLL_Generator;

import java.util.List;

public class Palindrome_List {

    private static ListNode reverseList(ListNode head)
    {
        ListNode curr = head,prev = null;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    private static ListNode middleOfList(ListNode head)
    {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int lPalin(ListNode A) {

        ListNode curr = A;
        ListNode mid = middleOfList(A);
        ListNode newHead = reverseList(mid);

        while ( curr != null && newHead != null)
        {
            if(curr.val != newHead.val)
                return 0;
            curr = curr.next;
            newHead = newHead.next;
        }
        return 1;
    }
    public static void main(String[] args) {

        ListNode linkedList = SinglyLL_Generator.createSinglyLL(List.of(1,2,3,4,3,2,1));
        System.out.println(lPalin(linkedList));
    }
}
