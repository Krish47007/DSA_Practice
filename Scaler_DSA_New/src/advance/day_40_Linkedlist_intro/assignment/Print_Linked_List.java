package advance.day_40_Linkedlist_intro.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Print_Linked_List {

    public static void solve(ListNode A) {

        while (A != null)
        {
            System.out.print(A.val+" ");
            A = A.next;
        }
        System.out.println();
    }
}
