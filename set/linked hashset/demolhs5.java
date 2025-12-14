

    import java.util.LinkedHashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class demolhs5 {
    public static void main(String[] args) {

        LinkedHashSet<Student> set = new LinkedHashSet<>();

        set.add(new Student(1, "Athi"));
        set.add(new Student(1, "Athi"));

        System.out.println(set.size()); // 1
    }
}

    

