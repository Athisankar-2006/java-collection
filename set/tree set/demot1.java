
// TreeSet automatically sorts elements
// ignore the duplicstes

import java.util.TreeSet;

public class demot1 {
    public static void main(String[] args) {
        TreeSet<Integer> li=new TreeSet<>();
        li.add(10);
        li.add(20);
        
        li.add(40);
        li.add(30);
        li.add(20);

        System.out.println(li);
    }
}
