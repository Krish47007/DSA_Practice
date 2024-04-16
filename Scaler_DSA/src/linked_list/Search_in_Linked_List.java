package linked_list;

public class Search_in_Linked_List {

    public int solve(ListNode A, int B) {

        ListNode curr = A;
        if (curr == null)
            return 0;

        while (curr != null) {
            if (curr.val == B)
                return 1;
            curr = curr.next;
        }
        return 0;

    }
}
