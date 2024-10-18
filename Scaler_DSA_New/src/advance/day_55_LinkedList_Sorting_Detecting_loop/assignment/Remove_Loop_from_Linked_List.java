package advance.day_55_LinkedList_Sorting_Detecting_loop.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Remove_Loop_from_Linked_List {

    public ListNode solve(ListNode head) {

        //If no node or only one node in the list
        if(head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        //If no cycle return head
        if (slow != fast)
            return head;

        /*
            According to Floyd's Cycle Detection algo,
            No. of nodes from head to the first node where cycle starts say (X) is equal to
            the num of nodes from start of cycle to the point where slow and fast met (Y).
            So X = Y always if there's a cycle.
         */
        slow = head;
        ListNode prevToFast = fast;
        while (slow != fast) {
            slow = slow.next;
            prevToFast = fast;
            fast = fast.next;
        }

        //Break the loop
        prevToFast.next = null;

        return head;
    }
}
