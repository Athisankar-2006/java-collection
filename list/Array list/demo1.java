import java.util.ArrayList;

public class demo1{
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();

        list.add(10);
        list.add(13);
        list.add(15);
        System.out.println(list);

        System.out.println("get "+list.get(0));

        list.remove(2);
        System.out.println(list);


    }
   

}