import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Student a = new Mathstudent("Kirill", "Nikolaev", 1, 5);
    Student c = new IUstudent("Kirill", "Nikolaev", 1, 5);
    Teacher b = new Teacher("Pavel", "Panilov", new ArrayList<>());
    b.addCourse("Computer Science");
    Teacher d = new Teacher("Artem", "Nikolaev", new ArrayList<>());
    d.addCourse("Computer Science");
    a.setTutor(b);


    List<Student> p = new ArrayList<>();
    p.add(a);
    p.add(c);


    for (Student pp: p) {
        System.out.println(pp + " " + pp.writeExam());
    }

    }
}

