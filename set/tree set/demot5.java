

    import java.util.TreeSet;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id; // sort by id
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class demot5 {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student(3, "Java"));
        set.add(new Student(1, "Athi"));
        set.add(new Student(2, "Collections"));

        System.out.println(set);
    }
}


