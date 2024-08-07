import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLL {
    Node head;
    ReverseLL(){
        this.head=null;
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
        System.out.println("END");
    }
    void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        System.out.println("Afetr Reversed : ");
        display();
        //return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseLL ll=new ReverseLL();
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            ll.insert(n);
        }
        ll.display();
        ll.reverse();
        //System.out.println("After reversed : ");
        
    }
}
