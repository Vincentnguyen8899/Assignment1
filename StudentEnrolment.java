import java.util.ArrayList;

public class StudentEnrolment {
    private Student student;
    private Course course;
    private String semester;
    private ArrayList<StudentEnrolment> studentEnrolmentList;

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public boolean add(StudentEnrolment E){
        if (studentEnrolmentList.contains(E)) {
            return false;
        }
        studentEnrolmentList.add(E);
        return true;
    }

}
