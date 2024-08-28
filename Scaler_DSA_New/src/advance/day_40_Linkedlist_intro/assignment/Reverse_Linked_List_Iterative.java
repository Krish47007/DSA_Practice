package advance.day_40_Linkedlist_intro.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Reverse_Linked_List_Iterative {

    public ListNode reverseList(ListNode A) {

        ListNode curr = A, prev = null;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
