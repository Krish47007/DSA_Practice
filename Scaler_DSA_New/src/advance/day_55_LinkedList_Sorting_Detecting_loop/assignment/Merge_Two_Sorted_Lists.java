package advance.day_55_LinkedList_Sorting_Detecting_loop.assignment;

import advance.day_40_Linkedlist_intro.ListNode;
import advance.day_40_Linkedlist_intro.SinglyLinkedListUtil;

import java.util.List;

public class Merge_Two_Sorted_Lists {

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {

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


    public static void main(String[] args) {

        ListNode l1 = SinglyLinkedListUtil.createSinglyLL(List.of(5,8,20));
        ListNode l2 = SinglyLinkedListUtil.createSinglyLL(List.of(1,2,3));

        SinglyLinkedListUtil.printLL(mergeTwoLists(l1,l2));
    }
}
