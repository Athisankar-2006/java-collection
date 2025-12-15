import java.util.PriorityQueue;

class Task{
    int priority;
    String taskname;


    Task(int priority,String taskname){
        this.priority=priority;
        this.taskname=taskname;

    }
}

public class demopq5 {
        public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>(
            (t1, t2) -> t1.priority - t2.priority
        );

        pq.add(new Task(2, "Write Code"));
        pq.add(new Task(1, "Fix Bug"));
        pq.add(new Task(3, "Test App"));

      while(!pq.isEmpty()){
         System.out.println(pq.poll().taskname); // Athi
      }
       
    }
    
}
