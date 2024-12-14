import java.util.ArrayList;
import java.util.List;


public class Teacher extends People{
    private List<String> Courses;
    public Teacher (String name, String surname, List<String> courses) {
        super(name, surname);
        this.Courses = new ArrayList<String>(courses);
    }


    public List<String> getPairs() {
        return this.Courses;
    }

    public void setPairs(List<String> pairs) {
        this.Courses = pairs;
    }

    public void addCourse (String course) {;
        this.Courses.add(course);
    }

    public void removeCourse (String course) {
        this.Courses.remove(course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Courses=" + Courses +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }





}