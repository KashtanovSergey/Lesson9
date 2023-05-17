import java.util.stream.IntStream;

public class UniverStudentsCourses implements Courses, Student {
    private String course;
    private String students;

    public UniverStudentsCourses(String course, String students){
        this.course = course;
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "UniverStudentsCourses{" +
                       "course='" + course + '\'' +
                       ", students='" + students + '\'' +
                       '}';
    }

    enum nameCourses{
        JAVA, PYTHON, PHP, GO
    }
//    public static void main(String[] args) {}
}
