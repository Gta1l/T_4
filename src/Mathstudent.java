public class Mathstudent extends Student {
    public Mathstudent(String name, String surname, int course, int mark) {
        super(name, surname, course, mark);
    }

    @Override
    public String writeExam() {
        return "is writing Math exam";
    }
}
