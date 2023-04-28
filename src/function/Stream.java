package function;
import java.util.List;
import java.util.ArrayList;

public class Stream {
    public static void main(String[] args) {
        record Student(String name, int score) {}

        var student1 = new Student("player1", 20);
        var student2 = new Student("player2", 40);
        var student3 = new Student("player3", 60);
        var student4 = new Student("player4", 80);
        var student5 = new Student("player5", 100);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.size();
    }
}
