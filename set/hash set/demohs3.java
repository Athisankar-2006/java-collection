import java.util.HashSet;

// iterable all element in the hash set  through the loop

public class demohs3 {
    

        public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("Athi");
        hs.add("captain america");
        hs.add("spider man");
        hs.add("super man");
        hs.add("Athi");
        hs.add("bat man");
        hs.add("iron man");
        hs.add("hulk");

        for (String s:hs){
            System.out.println(s);
        }


    }
}
