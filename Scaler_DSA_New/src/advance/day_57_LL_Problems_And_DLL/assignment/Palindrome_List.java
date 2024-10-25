package advance.day_57_LL_Problems_And_DLL.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Palindrome_List {

    private ListNode midOfLL(ListNode head)
    {
        if (head == null)
            return head;

        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
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
    public int lPalin(ListNode head) {

        //Find mid of LL
        ListNode midNode = midOfLL(head);
        ListNode newHead = midNode.next;
        //break connection
        midNode.next = null;

        //reverse the other half
        newHead = reverseList(newHead);

        while (head != null && newHead != null)
        {
            if (head.val != newHead.val)
                return 0;
            head = head.next;
            newHead = newHead.next;
        }

        return 1;

    }
}
