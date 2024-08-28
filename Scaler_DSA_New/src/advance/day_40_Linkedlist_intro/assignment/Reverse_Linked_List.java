package advance.day_40_Linkedlist_intro.assignment;

import advance.day_40_Linkedlist_intro.ListNode;

public class Reverse_Linked_List {

    private ListNode rev(ListNode curr,ListNode prev)
    {
        //return new head value which is stored in prev
        if(curr == null)
            return prev;

        ListNode temp = rev(curr.next,curr);
        curr.next = prev;
        return temp;
    }
    public ListNode reverseList(ListNode A) {

        return rev(A,null);
    }
}
