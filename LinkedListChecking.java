import java.util.LinkedList;

public class LinkedListChecking {
    public static void main(String[] args) {
        LinkedList<String> str=new LinkedList<>();
        str.add("Vignesh");
        str.add("Hemanth");
        str.add("Vishal");
        str.add("Logesh");
        str.add("Mathan");
        str.add("Dharani");
        if(str.contains("Vignesh")){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
