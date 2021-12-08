package inftrasutructure.Service;

import inftrasutructure.domain.Class;
import inftrasutructure.domain.Student;
import inftrasutructure.domain.Subject;
import inftrasutructure.domain.Teacher;
import inftrasutructure.repo.ClassDAO;
import inftrasutructure.repo.StudentDAO;
import inftrasutructure.repo.SubjectDAO;
import inftrasutructure.repo.TeacherDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TeacherService {
    private final TeacherDAO teacherDAO;
    private final StudentDAO studentDAO;
    private final ClassDAO classDAO;
    private final SubjectDAO subjectDAO;

    public TeacherService(TeacherDAO teacherDAO, StudentDAO studentDAO, ClassDAO classDAO, SubjectDAO subjectDAO) {
        this.teacherDAO = teacherDAO;
        this.studentDAO = studentDAO;
        this.classDAO = classDAO;
        this.subjectDAO = subjectDAO;
    }

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Get list Class ");
        System.out.println("2. Get student by in class id");
        System.out.println("3. Find student by id");
        System.out.println("4. search student");
        System.out.println("5. Enter mark to student");
        System.out.println("6. search student");
        System.out.println("7. Logout");
        System.out.println("8. Exit");
    }

    public void getListClass() {
        List<Class> listClass = classDAO.loadAll();
    }

    public void getStudentByID() {
        System.out.println("Enter id student");
        String id = scanner.nextLine();
        Student student = studentDAO.findById(id);
        System.out.println(student);

    }

    public void searchStudent() {
        System.out.println("Enter name student");
        String name = scanner.nextLine();
        List<Student> listStudent = studentDAO.search(name.trim());
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    private List<Subject> enterMart() {
        List<Subject> subjectOfUser = this.subjectDAO.search("");
        for (Subject subject : subjectOfUser) {
            System.out.println("Enter mark for subject " + subject.getSubjectName());
            String mark = scanner.nextLine();
            subject.setMark(Integer.parseInt(mark));
        }
        return subjectOfUser;
    }

    public void enterMartStudent(String studentId) {
        Student student = studentDAO.findById(studentId);
        List<Subject> subjectOfUser = enterMart();
        student.enrichMark(subjectOfUser);
        studentDAO.save(student.getId(), student);
    }

    public void searchStudentByName() {
        System.out.println("Enter name student");
        String name = scanner.nextLine();
        List<Student> listStudent = studentDAO.search(name.trim());
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    public void getStudentInClass(String classid) {
        List<Student> listStudent = studentDAO.loadAll().stream().filter(student -> Objects.equals(student.getClassId(), classid))
                .collect(Collectors.toList());
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }


}
