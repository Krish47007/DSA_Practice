package linked_list;

public class Compare_Linked_List {

    public int solve(ListNode A, ListNode B) {

        while (A != null && B != null) {
            if (A.val != B.val)
                return 0;
            A = A.next;
            B = B.next;
        }

        if (A == null && B == null)
            return 1;
        else
            return 0;
    }

}
