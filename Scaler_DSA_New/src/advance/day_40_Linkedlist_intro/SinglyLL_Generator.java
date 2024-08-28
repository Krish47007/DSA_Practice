package advance.day_40_Linkedlist_intro;

import java.util.List;

public class SinglyLL_Generator {

    public static ListNode createSinglyLL(List<Integer> list)
    {
        if(!list.isEmpty())
        {
            ListNode head = new ListNode(list.get(0));
            ListNode curr = head;

            for (int i = 1;i<list.size();i++)
            {
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }
            return head;
        }
        return new ListNode();
    }
}
