

//add and remove the element

import java.util.LinkedList;

public class demoli1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);

       

        list.addFirst(11);
        list.addLast(20);

        System.out.println(list);

        
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
