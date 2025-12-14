import java.util.HashSet;
import java.util.LinkedHashSet;

public class demolhs4 {
     public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        HashSet<Integer> hs= new HashSet<>();

        int[] values={40,30,20,10};

        for(int v:values){
            lhs.add(v);
            hs.add(v);
        }

        System.out.println("linked hash set="+lhs);
        System.out.println("hash set"+hs);
    }
    
    
}
