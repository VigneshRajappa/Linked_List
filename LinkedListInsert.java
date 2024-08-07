import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListInsert {
    Node head;
    //LinkedListInsert ll=new LinkedListInsert();
    LinkedListInsert(){
        this.head=null;
    }
    void insertdata(int data){
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
        LinkedListInsert ll=new LinkedListInsert();
        while (true) { 
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            ll.insertdata(n);
        }
        ll.display();
    }
}
