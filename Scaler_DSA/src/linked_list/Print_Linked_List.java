package linked_list;

public class Print_Linked_List {

    public void solve(ListNode A) {

        ListNode curr = A;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
