class Node {
    int data;
    Node next;
    Node prev;

    public Node (int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class doublyLinkedlist {
    Node head;

        void insertEnd (int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }

        void insertBeginning (int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        void insertAt (int data, int position){
            Node newNode = new Node(data);
            if (position ==0 ){
                insertBeginning(data);
                return;
            }
            Node temp = head;
            for (int i = 0; temp !=null && i < position - 1; i++){
                temp = temp.next;
            }
            if(temp == null) return;
            newNode.next = temp.next;
            newNode.prev = temp;
            if(temp.next != null) temp.next.prev = newNode;
            temp.next = newNode;
        }

        void deletionByValue(int key){
            if (head ==null ) return;
            if (head.data == key) {
                head = head.next;
                if (head != null) head.prev = null;
                return;
            }
            
            Node temp = head;
            while(temp != null && temp.data != key){
                temp = temp.next;
            }
            if (temp == null) return;
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
        }
        

        boolean search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) return true;
                temp = temp.next;
            }
            return false;
        }

        void displayForward (){
            Node temp = head;
            while(temp != null ){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        void displayBackwards(){
            if (head == null) return;
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            while (temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.prev;
            }
            System.out.println("Null");
        }

}

public class doubly {
    public static void main(String[]args){
        doublyLinkedlist dll = new doublyLinkedlist();
        dll.insertEnd(50);
        dll.insertEnd(40);
        dll.insertBeginning(5);
        dll.insertAt(30, 2);
        dll.displayForward();
        dll.displayBackwards();
        dll.deletionByValue(40);
        System.out.println(dll.search(40));
        
    }
}
