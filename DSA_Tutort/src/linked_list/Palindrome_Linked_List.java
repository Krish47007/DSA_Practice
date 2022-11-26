package linked_list;

public class Palindrome_Linked_List {

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
            return true;

        ListNode slow = head,fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode head1 = reverseList(head);
        //for odd length list fast points to last node
        // and for even length list fast points to last.
        ListNode head2 = (fast == null) ? slow : slow.next;

        while (head1 != null && head2 != null)
        {
            if(head1.val != head2.val)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;

    }
}
