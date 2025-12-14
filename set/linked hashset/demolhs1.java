// Best way to remove duplicates without changing order

import java.util.LinkedHashSet;

public class demolhs1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("spider man");
        lhs.add("bat man");
        lhs.add("superman man");
        lhs.add("spider man");


        System.out.println(lhs);
    }
    
}
