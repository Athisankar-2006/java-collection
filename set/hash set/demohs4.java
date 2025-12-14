import java.util.ArrayList;
import java.util.HashSet;

public class demohs4 {

       public static void main(String[] args) {
        ArrayList<String> Arrlist= new ArrayList<>();
        Arrlist.add("Athi");
        Arrlist.add("captain america");
        Arrlist.add("spider man");
        Arrlist.add("spider man");
        Arrlist.add("super man");
        Arrlist.add("Athi");
        Arrlist.add("bat man");
        Arrlist.add("iron man");
        Arrlist.add("hulk");
        Arrlist.add("hulk");

        // without duplicate
        System.out.println(Arrlist);


        HashSet<String> hs=new HashSet<>(Arrlist);
        System.out.println(hs);//without the duplicate


       }
    
}
