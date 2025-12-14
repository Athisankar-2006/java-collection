import java.util.TreeSet;

public class demot2 {
      public static void main(String[] args) {
        TreeSet<Integer> li=new TreeSet<>();
        li.add(10);
        li.add(20);
        li.add(40);
        li.add(30);
        li.add(20);

        System.out.println("asending order="+li);
        System.out.println("desending order="+li.descendingSet());
    }
    
}
