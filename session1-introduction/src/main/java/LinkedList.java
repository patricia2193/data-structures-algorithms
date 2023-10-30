public class LinkedList {
    Node head;
    Node tail;
    int length;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // adds at the end of the list
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.value == value) {
            head = head.next;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node findMiddleNode(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean hasCycle(Node head) {
        if (head == null) return false;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node reverseList(Node head) {
        if(head == null) return null;

        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(4);

        linkedList.display();

        linkedList.add(6);
        linkedList.add(8);

        linkedList.display();

        linkedList.delete(6);

        linkedList.display();


        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(5);

        System.out.println(findMiddleNode(linkedList2.head).value);

    }
}
