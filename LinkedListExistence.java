import java.util.LinkedList;
public class LinkedListExistence {
    public static void main(String[] args) {
        LinkedList<String> str=new LinkedList<>();
        str.add("vignesh");
        str.add("Logesh");
        str.add("Mathan");
        str.add("Vishal");
        str.add("Dharani");
        for(String n:str){
            System.out.print(n+" ");
        }
        System.out.println(str);
        str.add(4,"Hemanth");
        System.out.println(str);
    }
}
