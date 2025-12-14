import java.util.HashSet;

// check a element which  is present in the hashset or not

public class demohs2 {
    
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("Athi");
        hs.add("Athi sankar");
        hs.add("spider man");
        hs.add("Athi");

        System.out.println(hs.contains("spider man"));
        System.out.println(hs.contains("iron man"));


    }
    
}
