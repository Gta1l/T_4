public abstract class Student extends People {

    private Teacher Tutor;
    private int course;
    private int mark;
    public Student(String name, String surname, int course, int mark) {
        super(name, surname);
        this.course = course;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Tutor=" + Tutor +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }

    public void setTutor(Teacher tutor) {
        if (this.Tutor != null) {
            throw new IllegalStateException("Student already have tutor" + this.Tutor);

        } else {
            this.Tutor = tutor;
        }

    }
    public abstract String writeExam();
}
