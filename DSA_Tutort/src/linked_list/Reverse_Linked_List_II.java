package linked_list;

public class Reverse_Linked_List_II {

    /*
ListNode* reverseBetween(ListNode* head, int left, int right) {
ListNode* current = head, *prev = NULL;
int count = 1;
while(count != left){
prev = current;
current = current->next;
count++;
}

ListNode* start = current;
while(count != right){
current = current->next;
count++;
}

ListNode* rest = current->next;
current->next = NULL;

ListNode* newHead = reverse(start);
if (prev!=NULL){
prev->next = newHead;

}
current = newHead;
while(current->next!=NULL){
current= current->next;
}
current->next = rest;
if(left == 1){
return newHead;
}
else{
return head; }


} */

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        int count = 0;
        ListNode curr = head;
        ListNode leftPtr = null,rightPtr = null;
        while (curr != null)
        {
            count++;
            if(count == left)
                leftPtr = curr;
            if (count == right) {
                rightPtr = curr.next;
                break;
            }
            curr = curr.next;


        }

        return head;

    }


}
