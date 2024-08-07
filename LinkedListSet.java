import java.util.LinkedList;

public class LinkedListSet {
    public static void main(String[] args) {
        LinkedList<String> str=new LinkedList<>();
        str.add("Vignesh");
        str.add("Logesh");
        str.add("Mathan");
        str.add("Hemanth");
        str.add("harish");
        str.add("Hemanth");
        str.set(4, "Dharani");
        str.set(5,"Vishal");
        System.out.println(str);
    }
    
}
