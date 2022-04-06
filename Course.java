import java.util.ArrayList;
public class Course {
    private String courseID;
    private String courseName;
    private int Credits;
    private ArrayList<Course> courseList;



    public Course(String ID, String name, int credits) { // set the Course's Instructor
        this.courseID = ID;
        this.courseName = name;
        this.Credits = credits;
        this.courseList = new ArrayList<Course>();
    }

    public String getcourseID() {
        return courseID;
    }

    public String getcourseName() {
        return courseName;
    }

    public int getCredits() {
        return Credits;
    }

    public ArrayList<Course> getCourseList() {return courseList;}

    public boolean add(Course C){ // add Course to courseList
        if (courseList.contains(C)) {
            return false;
        }
        courseList.add(C);
        return true;
    }

    @Override
    public String toString(){
        return "Course{" + "courseName='" + courseName + '\'' +", courseID='" + courseID +'\'' + ", Credits='" + Credits +'\'';
    }
}
