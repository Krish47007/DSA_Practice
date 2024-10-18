package advance.day_55_LinkedList_Sorting_Detecting_loop.assignment;

import advance.day_40_Linkedlist_intro.ListNode;
import advance.day_40_Linkedlist_intro.SinglyLinkedListUtil;

import java.util.List;

public class Sort_List {

    /**
     *
     * @param head - head of the LL
     * @return the first middle node in case of even num of nodes and middle node in case of odd num of nodes.
     */
    private static ListNode findMiddleNode(ListNode head) {

        ListNode slow = head, fast = head;

        while ( fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static ListNode mergeTwoLists(ListNode A, ListNode B) {

        if(A == null)
            return B;
        else if(B == null)
            return A;
        else
        {
            ListNode head = null;
            ListNode tail = null;

            while( A != null && B != null)
            {
                if (A.val <= B.val)
                {
                    if(head == null) {
                        head = new ListNode(A.val);
                        tail = head;
                    }
                    else
                    {
                        tail.next = new ListNode(A.val);
                        tail = tail.next;
                    }
                    A = A.next;
                }
                else
                {
                    if(head == null) {
                        head = new ListNode(B.val);
                        tail = head;
                    }
                    else
                    {
                        tail.next = new ListNode(B.val);
                        tail = tail.next;
                    }
                    B = B.next;
                }
            }

            if(A == null)
                tail.next = B;

            if (B == null)
                tail.next = A;

            return head;
        }

    }

    private static ListNode mergeSortLL(ListNode head)
    {
        //If empty list or only one element
        if(head == null || head.next == null)
            return head;

        ListNode midNode = findMiddleNode(head);
        ListNode nextToMidNode = midNode.next;
        //break the list
        midNode.next = null;

        //sort 1st half
        ListNode leftHalf = mergeSortLL(head);
        //sort 2nd half
        ListNode rightHalf = mergeSortLL(nextToMidNode);
        //merge both the halves.
        return mergeTwoLists(leftHalf,rightHalf);

    }
    public static ListNode sortList(ListNode A) {

        return mergeSortLL(A);
    }

    public static void main(String[] args) {

        SinglyLinkedListUtil.printLL(mergeSortLL(SinglyLinkedListUtil.createSinglyLL(List.of(3,4,2,8))));
    }
}
