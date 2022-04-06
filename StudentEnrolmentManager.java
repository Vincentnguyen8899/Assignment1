import java.util.List;

public interface StudentEnrolmentManager {
    public int add(StudentEnrolment enrolment);
    public int updateStudentEnrolment(String IDStudent, String IDCourse, String Semester, StudentEnrolment toBeUpdate, StudentEnrolment update );
    public int deleteStudentEnrolment(String IDStudent, String IDCourse, String Semester, StudentEnrolment enrolment);
    public int getOne(Student student, Course course, String semester);
    public List<StudentEnrolment>
    getAll();
}



