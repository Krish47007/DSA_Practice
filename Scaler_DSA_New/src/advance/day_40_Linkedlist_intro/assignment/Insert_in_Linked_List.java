package advance.day_40_Linkedlist_intro.assignment;

import advance.day_40_Linkedlist_intro.ListNode;
import advance.day_40_Linkedlist_intro.SinglyLL_Generator;

import java.util.List;

public class Insert_in_Linked_List {

    public static ListNode solve(ListNode A, int B, int C) {

        ListNode curr = A, prev = null;
        int pos = 0;
        ListNode temp = new ListNode(B);
        //Initial LL is empty
        if(curr == null)
            return temp;
        while (curr != null)
        {

            if(pos == C)
            {
                //Insert begin
                if(C == 0)
                {
                    temp.next = curr;
                    return temp;
                }
                //Insert at middle
                temp.next = curr;
                prev.next = temp;
                return A;

            }
            prev = curr;
            curr = curr.next;
            pos++;
        }

        //Insert at last
        while (prev.next != null)
            prev = prev.next;

        prev.next= temp;

        return A;

    }

    public static void main(String[] args) {

        ListNode head = SinglyLL_Generator.createSinglyLL(List.of(6,3,3,6,7,8,7,3,7));
        Print_Linked_List.solve(solve(head,3,5));
    }
}
