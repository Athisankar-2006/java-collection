
import java.util.LinkedList;

class student{

    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;

    }
}


public class demoli5 {
    public static void main(String[] args) {

           LinkedList <student> list= new LinkedList<>();

        list.add(new student(101,"Athi"));
        list.add(new student(102,"java"));



        for(student s:list){
            System.out.println(s.id+"---"+s.name);
        }
        
    
        
    }
    
}
