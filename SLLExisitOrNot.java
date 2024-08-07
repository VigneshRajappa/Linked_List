//package LinkedListLearning;
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLLExisitOrNot {
    static Node head;
    
    SLLExisitOrNot() {
        head = null;
    }

    void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean find(int k) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SLLExisitOrNot list = new SLLExisitOrNot();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.display();

        int k = 30;
        if (find(k)) {
            System.out.println(k + " exists in the list.");
        } else {
            System.out.println(k + " does not exist in the list.");
        }
    }
}