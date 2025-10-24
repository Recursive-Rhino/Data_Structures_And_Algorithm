package LinkedList;
import java.util.*;
public class LLinCollection {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(100);
        l1.add(1,200);
        l1.add(300);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);

    }
}
