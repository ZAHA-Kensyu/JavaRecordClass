package function;
import java.util.List;
import java.util.ArrayList;

public class Stream {
    public static void main(String[] args) {
        record Student(String name, int score) {}

        var student1 = new Student("player1", 30);
        var student2 = new Student("player2", 40);
        var student3 = new Student("player3", 20);
        var student4 = new Student("player4", 80);
        var student5 = new Student("player5", 10);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("合計値 "+students.stream().mapToInt(s -> s.score).sum());
        students.stream().filter(s->s.score >= 80).forEach(System.out::println);
        students.sort((s1,s2)->s2.score - s1.score);
        students.stream().forEach(s->System.out.println("名前 "+s.name() + " スコア "+s.score));
    }
}
