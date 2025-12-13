import java.util.ArrayList;

import java.util.Collections;

public class demo5 {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();

        list.add(19);
        list.add(13);
        list.add(50);

        Collections.sort(list);
        System.out.println(list);

        
    }
    
}
