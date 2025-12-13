
// user defined class

import java.util.ArrayList;

class student{

    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;

    }
}

public class demo3 {
    public static void main(String[] args) {
        ArrayList <student> list= new ArrayList<>();

        list.add(new student(101,"Athi"));
        list.add(new student(102,"java"));



        for(student s:list){
            System.out.println(s.id+"---"+s.name);
        }
        
    }
    
}


