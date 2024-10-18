package advance.day_55_LinkedList_Sorting_Detecting_loop.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Middle_element_of_linked_list {

    public int solve(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
