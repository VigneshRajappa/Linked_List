import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Example {
    Node head;
    Example(){
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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Example ll=new Example();
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
