//import com.sun.jdi.Value;
import java.util.Scanner;
public class LinkedList{
    
    public static void main(String[] args) {

        LinkedListCreate ll=new LinkedListCreate();
        Scanner sc=new Scanner(System.in);
        // ll.insertFirst(3);
        // ll.insertFirst(4);
        // ll.insertFirst(5);
        // ll.insertFirst(6);
        // ll.insertFirst(7);
        // ll.insertFirst(8);
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            ll.insertFirst(n);
        }

        ll.display();
    }
}
