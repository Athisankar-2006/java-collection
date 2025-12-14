// element not gonna store in the order (order not garunty)
// duplicate not alllowed
// element are stored based on the hash function (can not access the element by index)

import java.util.HashSet;


public class demohs1 {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("Athi");
        hs.add("Athi sankar");
        hs.add("spider man");
        hs.add("Athi");

        System.out.println(hs);


    }
    
}
