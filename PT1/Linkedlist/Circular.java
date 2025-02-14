class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class Circular_LinkedList {
    Node head;

    void insertEnd (int data){
        Node newNode = new Node(data);

        if (head ==null){
            head = newNode;
            head.next = head;
            return;
        }
        else {
            Node temp = head;
            while(temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }
    void insertBeginning (int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            head.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }
    public void display(){
        if (head == null){
            System.out.print("empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }
}


public class Circular {
    public static void main(String[]args){
        Circular_LinkedList cll = new Circular_LinkedList();

        cll.insertBeginning(1);
        cll.insertEnd(4);
        cll.insertEnd(3);
        cll.display();   
    }
}
