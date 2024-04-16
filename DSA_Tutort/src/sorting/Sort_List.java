package sorting;

public class Sort_List {

    // insertion sort TLE
   /* public static ListNode sortList(ListNode head) {

        if(head != null)
        {
            //Dummy points to the head of the new list
            ListNode dummy = new ListNode();
            ListNode curr = head;

            while (curr != null)
            {
                //keeps track of the pos where a new element would be inserted
                //always start from beginning so dummy
                ListNode prev = dummy;

                while (prev.next != null && curr.val >= prev.next.val)
                    prev = prev.next; //moves the pointer until we find the pos where curr element needs to be inserted.

                //storing address for next node
                ListNode next = curr.next;
                //inserting curr after prev.
                curr.next = prev.next;
                prev.next = curr;

                curr = next;
            }

            return dummy.next;
        }
        return null;
    }
*/

    public ListNode middleNode(ListNode head) {

        if (head == null)
            return null;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void display(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //breaking the list from mid
        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return mergeList(l1, l2);
    }

    private static ListNode mergeList(ListNode l1, ListNode l2) {

        ListNode head = null, tail = null;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    head = l1;
                    tail = l1;
                } else {
                    tail.next = l1;
                    tail = l1;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    tail = l2;
                } else {
                    tail.next = l2;
                    tail = l2;
                }
                l2 = l2.next;
            }

        }

        while (l1 != null) {
            tail.next = l1;
            tail = l1;
            l1 = l1.next;
        }

        while (l2 != null) {
            tail.next = l2;
            tail = l2;
            l2 = l2.next;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);

        display(sortList(head));
    }
}
