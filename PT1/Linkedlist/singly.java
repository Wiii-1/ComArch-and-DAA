class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class singlyLinkedList {
    Node head;

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void insertBeginning (int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAt (int data, int position){
        Node newNode = new Node(data);
        if (position ==0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++){
            temp = temp.next;
        }
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    void display (){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(" null ");
    }

}

public class singly{
    public static void main(String[]args){
        singlyLinkedList sll = new singlyLinkedList();
        sll.insertEnd(30);
        sll.insertEnd(40);
        sll.insertBeginning(10);
        sll.insertAt(20, 2);
        sll.display();
        System.out.println(sll.search(10));
    }
}