package linked_list;

public class DoublyLinkedList {

    class Node
    {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void insertBegin(int data)
    {
        Node temp = new Node(data);

        if(head == null)
        {
            head = temp;
            tail = head;
        }
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
    }

    public void insertEnd(int data)
    {
        Node temp = new Node(data);

        if(head == null)
        {
            head = temp;
            tail = head;
        }
        else
        {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void display()
    {
        if(head == null)
            System.out.println("Empty list..nothing to display");
        else
        {
            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertBegin(5);
        dl.insertBegin(20);
        dl.insertBegin(10);

        dl.insertEnd(50);
        dl.insertEnd(60);
        dl.insertEnd(70);
        dl.display();
    }
}
