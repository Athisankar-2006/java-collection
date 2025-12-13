import java.util.LinkedList;
import java.util.Queue;

// fifo

public class demoli3 {
    public static void main(String[] args) {
        Queue<Integer> li= new LinkedList<>();

        li.offer(10);
        li.offer(12);
        li.offer(14);

        System.out.println(li.poll());
        System.out.println(li);
    }
    
}
