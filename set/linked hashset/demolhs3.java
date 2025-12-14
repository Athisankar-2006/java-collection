import java.util.LinkedHashSet;

public class demolhs3 {
     public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("spider man");
        lhs.add("bat man");
        lhs.add("superman man");
        lhs.add("spider man");


        for(String s:lhs){
            System.out.println(s);
        }
    }
    
    
}
