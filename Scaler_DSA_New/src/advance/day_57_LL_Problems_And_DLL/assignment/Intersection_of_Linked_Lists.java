package advance.day_57_LL_Problems_And_DLL.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Linked_Lists {

    /*
    Brute Force-
    Check all pairs of both Linked Lists. For each node of Linked List A, compare it with all nodes of Linked List B and return the node if it is found equal to current node of A.
    Return null if no intersection found.
    Time Complexity - O(lA * lB) where lA is length of A and lB is length of B.

    Optimized-
    Let’s say that the linked list A, has length lA, and linked list B has length lB. Let’s say both these linked lists merge at some point X. After X, both the linked lists will have the same length, but the lengths might differ before X.
    So, what we can do is, initially, calculate both lA and lB by doing a simple traversal of the linked lists. Then we can keep ptr1 at the head of A, and ptr2 at the head of B.
    If lA > lB, we move ptr1 forward, lA - lB times otherwise, we move ptr2 forward, lB - lA times. At this point, both the pointers will be equidistant from X. Now, we simple keep moving ptr1 and ptr2 ahead till they dont meet at a common point.

    If, even after reaching the end of A and B, ptr1 and ptr2 are not equal, we can return None/Null.
    */

    public ListNode getIntersectionNode(ListNode A, ListNode B) {

        ListNode res = null;

        int len_A = 0;
        ListNode curr = A;
        while (curr != null)
        {
            len_A++;
            curr = curr.next;
        }

        int len_B = 0;
        curr = B;
        while ( curr != null)
        {
            len_B++;
            curr = curr.next;
        }

        ListNode ptr1 = A, ptr2 = B;
        if (len_A > len_B)
        {
            int count = 0;
            while (ptr1 != null && count < len_A - len_B) {
                ptr1 = ptr1.next;
                count++;
            }
        }
        else
        {
            int count = 0;
            while (ptr2 != null && count <  len_B - len_A) {
                ptr2 = ptr2.next;
                count++;
            }
        }

        while (ptr1 != null && ptr2 != null)
        {
            if (ptr1 == ptr2)
            {
                res = ptr1;
                break;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return res;
    }
}
