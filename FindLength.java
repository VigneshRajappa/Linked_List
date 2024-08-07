import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindLength {
    Node head;
    FindLength(){
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
                //System.out.print(temp.data+" -> ");
                temp=temp.next;

            }
            temp.next=newnode;
        }
    }
    void findlength(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The length of the List is "+count);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindLength ll=new FindLength();
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            ll.insert(n);
        }
        ll.display();
        ll.findlength();
    }
}
