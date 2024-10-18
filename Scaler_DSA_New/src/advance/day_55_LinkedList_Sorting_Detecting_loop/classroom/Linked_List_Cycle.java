package advance.day_55_LinkedList_Sorting_Detecting_loop.classroom;

import advance.day_40_Linkedlist_intro.ListNode;

public class Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }
}
