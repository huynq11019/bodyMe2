package inftrasutructure.Service;

import inftrasutructure.domain.Student;
import inftrasutructure.repo.StudentDAO;

import java.util.List;
import java.util.Objects;

public class StudentService {
    private final StudentDAO studentDAO = new StudentDAO();

    public StudentService() {
    }

    public int addStudent(String name, String address, String classId) {
        Student student = new Student(name, address, classId);
        studentDAO.save(student.getStudentID(), student);
        System.out.println("Student added successfully" + studentDAO.findById(student.getStudentID()));
        return 1;
    }

    public Student findStudent(String studentID) {
        return studentDAO.findById(studentID);
    }

    public int updateStudent(String studentID, String name, String address, String classId) {
        Student student = studentDAO.findById(studentID);
        if (Objects.isNull(student)) {
            System.err.println("Student not found");
            return 0;
        }
        student.update(name, address, classId);
        studentDAO.save(studentID, student);
        System.out.println("Student updated successfully");
        return 1;
    }
    public int deleteStudent(String studentID) {
        // check if student exists
        Student student = studentDAO.findById(studentID);
        if (Objects.isNull(student)) {
            System.err.println("Student not found");
            return 0;
        }
        studentDAO.delete(studentID);
        System.out.println("Student deleted successfully");
        return 1;
    }

    public List<Student> searchStudent(String name) {
        return studentDAO.search(name);
    }

    public void menu() {
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Update Student");
        System.out.println("4. Find Student");
        System.out.println("5. List Student");
        System.out.println("6. Exit");
    }
}
