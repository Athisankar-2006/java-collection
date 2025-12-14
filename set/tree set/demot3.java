import java.util.TreeSet;

public class demot3 {
    public static void main(String[] args) {
        TreeSet<Integer> li=new TreeSet<>();
        li.add(10);
        li.add(20);
        li.add(40);
        li.add(30);
        li.add(20);


        System.out.println("first element"+li.first());
        System.out.println("last element"+li.last());
        System.out.println("new head element"+li.headSet(40));
        System.out.println("new tail element"+li.tailSet(40));
        
    }
}
