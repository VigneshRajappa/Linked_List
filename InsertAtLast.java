import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertAtLast {
    Node head;
    InsertAtLast(){
        this.head=null;
    }
    void insertlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertAtLast ll=new InsertAtLast();
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            ll.insert(n);
        }
        System.out.println("Enter the number to add in first");
        int lastnum=sc.nextInt();
        ll.insertlast(lastnum);
        ll.display();
    }
}
