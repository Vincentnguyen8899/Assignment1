import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class EnrolmentManagement {
    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<>();
        ArrayList<Course> CourseList = new ArrayList<>();
        ArrayList<String> SemesterList = new ArrayList<>();
        ArrayList<StudentEnrolment> EnrolmentList = new ArrayList<>();
        try {
            File myFile = new File("default.csv");
            Scanner myFilee = new Scanner(myFile);
            while (myFilee.hasNextLine()) {
                String data = myFilee.nextLine();
                String[] arr = data.split(",");
                Student S = new Student(arr[0], arr[1], arr[2]);
                Course C = new Course(arr[3], arr[4], Integer.parseInt(arr[5]));
                StudentList.add(S);
                CourseList.add(C);
                SemesterList.add(arr[6]);
            }
            myFilee.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        boolean b1 = true;
        do {
            System.out.println("Enter 1 to add Student");
            System.out.println("Enter 2 to delete Student");
            System.out.println("Enter 3 to print all Enrolments");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    boolean b = true;
                    do {
                        System.out.println("Enter StudentID: ");
                        Scanner scanner1 = new Scanner(System.in);
                        String StudentID = scanner1.nextLine();
                        int index = 0;
                        for (int i = 0; i < StudentList.size(); i++) {
                            if (StudentID.equals(StudentList.get(i).getID())) {
                                index = i;
                            }
                        }
                        StudentEnrolment E = new StudentEnrolment(StudentList.get(index), CourseList.get(index), SemesterList.get(index));
                        EnrolmentList.add(E);
                        System.out.println("Student is enrolled.");
                        System.out.println("Do you want add another student ? (Yes / No)");
                        Scanner scanner2 = new Scanner(System.in);
                        String answer1 = scanner2.nextLine();
                        if (answer1.equals("No")) {
                            b = false;
                        }

                    } while (b == true);
                    break;
                case 2:
                    System.out.println("Enter StudentID: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String StudentID = scanner1.nextLine();
                    for (int i = 0; i < EnrolmentList.size(); i++) {
                        if (StudentID.equals(EnrolmentList.get(i).getStudent().getID())) {
                            EnrolmentList.remove(i);
                            System.out.println("Student is deleted. ");
                        }
                    }

                    break;
                case 3:
                    for (int i = 0; i < EnrolmentList.size(); i++) {
                        System.out.println(EnrolmentList.get(i).getStudent().toString() + " - " + EnrolmentList.get(i).getCourse().toString() + " - Semester: " + EnrolmentList.get(i).getSemester());
                    }
                    break;


            }
        } while(b1 == true);


    }
}