package AdminLogic;

import java.util.LinkedList;

public class StudentManager {
    private static LinkedList<Student> studentList = new LinkedList<>();

    private StudentManager() {}

  
    public static LinkedList<Student> getStudentList() {
        return studentList;
    }
    public static void addStudent(Student student) {
        studentList.add(student);
    }

      public static Student findStudentByRoll(String rollNo) {
        for (Student s : studentList) {
            if (s.getStudentID().equalsIgnoreCase(rollNo)) {
                return s;
            }
        }
        return null; 
    } 
      public static boolean removeStudent(String studentID) {
    Student student = findStudentByRoll(studentID);
    if (student != null) {
        studentList.remove(student);
        return true;
    }
    return false;
}
  }
