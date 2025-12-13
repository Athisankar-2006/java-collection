import java.util.ArrayList;



class student{

    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;

    }
    @Override
    public boolean equals(Object obj){
        student s=(student) obj;
        return this.id==s.id && this.name.equals(s.name);
    }



}


public class demo4 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student(1, "Athi"));

        System.out.println(list.contains( new student(1, "Athi")));
    }
    
}
