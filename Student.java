import java.util.ArrayList;
public class Student {
    private String studentID;
    private String studentName;
    private String Birthdate;
    private ArrayList<Student> studentList;


    public Student(String ID, String name, String Birthdate) {
        this.studentID = ID;
        this.studentName = name;
        this.Birthdate = Birthdate;
    }

    public String getID() {return studentID;}

    public String getName() {return studentName;}

    public String getBirthdate() {return Birthdate;}

    public ArrayList<Student> getStudentList() {return studentList;}

    public boolean add(Student S){
        if (studentList.contains(S)) {
            return false;
        }
        studentList.add(S);
        return true;
    }

    @Override
    public String toString(){
        return "Student{" + "studentName='" + studentName + '\'' +", studentID='" + studentID +'\'' +", Birthdate='" + Birthdate +'\'';
    }
}
