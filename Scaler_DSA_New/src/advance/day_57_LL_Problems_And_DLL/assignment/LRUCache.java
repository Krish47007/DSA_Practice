package advance.day_57_LL_Problems_And_DLL.assignment;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    static class Solution {

        private class Node {

            int key;
            int val;
            Node next;
            Node prev;

            public Node(int key,int val) {
                this.key = key;
                this.val = val;
            }
        }

        private Map<Integer, Node> hm;
        private Node head, tail;
        private int capacity;

        public Solution(int capacity) {
            this.capacity = capacity;
            this.hm = new HashMap<>();
            head = new Node(-1,Integer.MIN_VALUE);
            tail = new Node(-1,Integer.MAX_VALUE);

            head.next = tail;
            tail.prev = head;
        }

        private void deleteNodeFromMid(Node target) {
            target.prev.next = target.next;
            target.next.prev = target.prev;
            target.next = target.prev = null;
        }

        public int get(int key) {

            if (!hm.containsKey(key))
                return -1;
            else {
                Node temp = hm.get(key);
                //Delete from the current pos in DLL
                deleteNodeFromMid(temp);
                //Insert At the end
                Node newNode = new Node(key,temp.val);
                insertAtEndBeforeTail(newNode, tail);

                //Put in HashMap
                hm.put(key, newNode);
                return temp.val;
            }
        }

        private void insertAtEndBeforeTail(Node newNode, Node tail) {

            tail.prev.next = newNode;
            newNode.next = tail;
            newNode.prev = tail.prev;
            tail.prev = newNode;
        }

        public void set(int key, int value) {

            if (hm.containsKey(key)) {
                Node temp = hm.get(key);
                //Delete from the current pos in DLL
                deleteNodeFromMid(temp);
                //Insert At the end
                Node newNode = new Node(key,value);
                insertAtEndBeforeTail(newNode, tail);
                //Put in HashMap
                hm.put(key, newNode);
            } else {
                if (hm.size() < capacity) {
                    Node temp = new Node(key,value);
                    insertAtEndBeforeTail(temp, tail);
                    hm.put(key, temp);
                } else {
                    //Delete the least recently used val which is at head.
                    Node target = head.next;
                    deleteNodeFromMid(target);
                    hm.remove(target.key);
                    Node temp = new Node(key,value);
                    insertAtEndBeforeTail(temp, tail);
                    hm.put(key, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution(2);
        System.out.println(sol.get(4));
        sol.set(4,40);
        System.out.println(sol.get(4));
        sol.set(1,10);
        System.out.println(sol.get(1));
        sol.set(3,30);
        System.out.println(sol.get(4));
    }

}
