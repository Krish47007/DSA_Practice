package linked_list;

public class Insert_in_Linked_List {

    public ListNode solve(ListNode A, int B, int C) {

        ListNode temp = new ListNode(B);
        if (C == 0) {
            if (A == null)
                return temp;
            else {
                temp.next = A;
                return temp;
            }
        } else {
            int p = 0;
            ListNode prev = null, curr = A;
            while (p < C && curr != null) {
                prev = curr;
                curr = curr.next;
                p++;
            }

            temp.next = prev.next;
            prev.next = temp;

            return A;
        }
    }
}
