package linked_list;

public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void insertBegin(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = head;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public int countNodes() {
        int count = 0;
        if (head == null)
            return count;
        else {
            Node temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public void insertAtPos(int pos, int data) {

        if (head == null)
            insertBegin(data);
        else if (pos >= countNodes()) // insert at end anyway if pos > total no. of nodes.
            insertEnd(data);
        else {
            int currPos = 0;
            Node curr = head;

            while (curr != null) {
                currPos++;
                if (currPos == pos) {
                    Node temp = new Node(data);
                    temp.next = curr.next;
                    curr.next = temp;
                    break;
                }
            }

        }

    }

    public void insertEnd(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = head;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Nothing to display...");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        /*list.insertBegin(30);
        list.insertBegin(20);
        list.insertBegin(10);

        list.insertEnd(40);
        list.insertEnd(50);*/
        list.insertAtPos(5, 10);
        list.insertAtPos(5, 20);
        list.insertAtPos(1, 15);

        list.display();
    }
}
