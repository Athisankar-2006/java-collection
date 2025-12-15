import java.util.PriorityQueue;

class Student{
    int rank;
    String name;

    Student(int rank,String name){
        this.rank=rank;
        this.name=name;
    }

}

public class demopq4 {

     public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(
            (s1, s2) -> s1.rank - s2.rank
        );

        pq.add(new Student(3, "Java"));
        pq.add(new Student(1, "Athi"));
        pq.add(new Student(2, "Collections"));

        System.out.println(pq.poll().name); // Athi
    }
    
}
