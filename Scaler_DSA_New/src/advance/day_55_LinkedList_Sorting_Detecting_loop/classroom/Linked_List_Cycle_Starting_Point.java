package advance.day_55_LinkedList_Sorting_Detecting_loop.classroom;

import advance.day_40_Linkedlist_intro.ListNode;

public class Linked_List_Cycle_Starting_Point {

    public ListNode detectCycle(ListNode head) {

        //If no node or only one node in the list
        if(head == null || head.next == null)
            return null;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
               break;
        }

        //If no cycle return null
        if (slow != fast)
            return null;

        /*
            According to Floyd's Cycle Detection algo,
            No. of nodes from head to the first node where cycle starts say (X) is equal to
            the num of nodes from start of cycle to the point where slow and fast met (Y).
            So X = Y always if there's a cycle.
         */
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
