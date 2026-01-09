public class linklist3 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void addinmiddle(int data, int idx) {
        if (idx == 0) {
            addfirst(data);
            return;
        }

        if (idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newnode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linklist3 li = new linklist3();
        li.addfirst(2);
        li.addfirst(1);
        li.addlast(4);
        li.addlast(3);
        li.addinmiddle(88, 2);

        li.print();
        System.out.println("Size = " + li.size);
    }
}
