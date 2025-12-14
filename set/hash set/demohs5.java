import java.util.HashSet;
import java.util.Objects;


class student{
    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj){
    student s= (student) obj;
    return this.id==s.id && this.name.equals(s.name);
    }

    @Override
    
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class demohs5 {
    public static void main(String[] args) {
        HashSet<student> hs =new HashSet<>();

        hs.add(new student(101, "tom"));
        hs.add(new student(101, "tom"));//duplicate object doesnot accept

        System.out.println(hs.size());

    }
    
}
