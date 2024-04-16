package sorting;

public class Insertion_Sort_List {

    public static ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode();
        ListNode curr = head;

        while (curr != null) {
// At each iteration, we insert an element into the resulting list.
            ListNode prev = dummy;

// find the position to insert the current node
            while (prev.next != null && curr.val >= prev.next.val) {
                prev = prev.next;
            }

            ListNode next = curr.next;
// insert the current node to the new list
            curr.next = prev.next;
            prev.next = curr;

// moving on to the next iteration
            curr = next;
        }

        return dummy.next;

    }

    public static void display(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);

        display(insertionSortList(head));
    }
}
