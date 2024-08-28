package advance.day_40_Linkedlist_intro.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Delete_in_Linked_List {

    public ListNode solve(ListNode A, int B) {

        int pos = 0;
        ListNode curr = A, prev = null;

        while (curr != null)
        {
            if(pos == B)
            {
                if(prev != null) {
                    prev.next = curr.next;
                    curr.next = null;
                    return A;
                }
                else
                {
                    //0th index node
                    curr = curr.next;
                    return curr;
                }
            }
            pos++;
            prev = curr;
            curr = curr.next;
        }
        return null;
    }
}
