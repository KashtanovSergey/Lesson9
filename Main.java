import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<UniverStudentsCourses> course = new ArrayList<Courses>(Arrays.asList(

        new Courses("Василий", UniverStudentsCourses.nameCourses.JAVA ),
        new Courses("Василий", UniverStudentsCourses.nameCourses.PHP),
        new Courses("Василий", UniverStudentsCourses.nameCourses.PYTHON),
//        new Courses(UniverStudentsCourses.nameCourses.GO, "Василий"),
//        new Courses(UniverStudentsCourses.nameCourses.JAVA, "Екатерина"),
//        new Courses(UniverStudentsCourses.nameCourses.JAVA, "Дмитрий"),
//        new Courses(UniverStudentsCourses.nameCourses.JAVA, "Людмила"),
//        new Courses(UniverStudentsCourses.nameCourses.JAVA, "Светлана"),
        new Courses("Екатерина", UniverStudentsCourses.nameCourses.PYTHON)));

        System.out.println(course.stream()
                                   .filter(c -> c.getCourse));
    }
}
