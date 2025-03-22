public class doubly {
    
    
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    
    public void insertAt(int data, int position) {
        if (position == 0) {
            insertBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;

        if (newNode.next == null) tail = newNode;
    }

    
    public void deletionByValue(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) return;

        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;

        if (temp == tail) tail = temp.prev;
    }

    
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    
    public void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("Null");
    }

        public static void main(String[] args) {
        doubly dll = new doubly();
        
        dll.insertEnd(50);
        dll.insertEnd(40);
        dll.insertBeginning(5);
        dll.insertAt(30, 2);
        
        dll.displayForward();
        dll.displayBackward();

        dll.deletionByValue(40);
        System.out.println("Search 40: " + dll.search(40));
    }
}
