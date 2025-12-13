import java.util.LinkedList;

// lifo

public class demoli4 {
    public static void main(String[] args) {
        LinkedList <Integer> stack=new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
    
}
