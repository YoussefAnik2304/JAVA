package List;

public class List<T> {
    class Node {
        private T data;
        Node next;

        public Node(T x) {
            data = x;
            next = null;
        }
    }

    private Node head;

    public List() {
        head = null;
    }

    private void appendNode(T value) {
        Node x = new Node(value);
        if (head == null) {
            head = x;
        } else {
            Node par = head;
            while (par.next != null)
                par = par.next;
            par.next = x;
        }
    }

    public void append_last(T value) {
        appendNode(value);
    }

    public void append_first(T value) {
        Node x = new Node(value);
        if (head == null) {
            head = x;
        } else {
            x.next = head;
            head = x;
        }
    }

    public boolean is_empty() {
        return head == null;
    }

    public boolean search(T value) {
        Node par = head;
        while (par != null) {
            if (par.data.equals(value))
                return true;
            else
                par = par.next;
        }
        return false;
    }

    public void sort() {
        Node a, b;
        for (a = head; a != null; a = a.next) {
            for (b = a.next; b != null; b = b.next) {
                if (((Comparable<T>) a.data).compareTo(b.data) > 0) {
                    T tmp = a.data;
                    a.data = b.data;
                    b.data = tmp;
                }
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
