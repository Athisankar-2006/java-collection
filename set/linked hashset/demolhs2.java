import java.util.ArrayList;
import java.util.LinkedHashSet;

public class demolhs2 {

     public static void main(String[] args) {
        ArrayList<String> arrlist=new ArrayList<>();
        arrlist.add("spider man");
        arrlist.add("bat man");
        arrlist.add("superman man");
        arrlist.add("spider man");


        System.out.println(arrlist);

        LinkedHashSet<String> li=new LinkedHashSet<>(arrlist);
        System.out.println(li);
    }
    
    
}
