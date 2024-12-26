public class IUstudent extends Student {

    public IUstudent(String name, String surname, int course, int mark) {
        super(name, surname, course, mark);
    }

    @Override
    public String writeExam() {
        return "is writing CS exam";
    }
}
