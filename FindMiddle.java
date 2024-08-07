import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindMiddle {
    Node head;
    FindMiddle(){
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
    public int middle(){
        if(head==null){
            return 0;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindMiddle ll = new FindMiddle();
        while (true) { 
            int n=sc.nextInt(); 
            if(n==-1){
                break;
            }  
            ll.insert(n);
        }
        ll.display();
        int n=ll.middle();
        System.out.println("Middle element is "+n);
    }
}
