import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SearchElement {
    Node head;
    SearchElement(){
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
    public boolean Searchelement(int key){
        //Node newnode=new Node(key);
        Node temp=head;
        while(temp!=null){
            //temp=temp.next;
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SearchElement ll=new SearchElement();
        while (true) { 
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            ll.insert(n);
        }
        ll.display();
        System.out.println("Enter the element to find : ");
        int key=sc.nextInt();
        if(ll.Searchelement(key)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}

