

// import java.util.Comparator;
import java.util.TreeSet;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class demot4 {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>(
            (s1, s2) -> s1.name.compareTo(s2.name)
        );

        set.add(new Student(1, "Java"));
        set.add(new Student(3, "Athi"));
        set.add(new Student(2, "Collections"));

        System.out.println(set);
    }
}

