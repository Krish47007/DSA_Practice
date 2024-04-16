package linked_list;

public class K_th_element_in_linked_list {

    public int solve(ListNode A, int B) {

        ListNode curr = A;
        int pos = 0;

        while (curr != null) {
            if (pos == B)
                return curr.val;
            pos++;
            curr = curr.next;
        }

        return -1;
    }
}
