package inftrasutructure.Service;

import inftrasutructure.domain.Class;
import inftrasutructure.domain.Principal;
import inftrasutructure.domain.Student;
import inftrasutructure.domain.Teacher;
import inftrasutructure.repo.*;
import inftrasutructure.support.JsonUtil;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class PrincipalSerivce {

    private final PrincipalDAO pricipalDAO ;

    private final TeacherDAO teacherDAO ;

    private final StudentDAO studentDAO ;

    private final ClassDAO classDAO  ;

    private final SubjectDAO subjectDAO ;

    public PrincipalSerivce(PrincipalDAO pricipalDAO, TeacherDAO teacherDAO, StudentDAO studentDAO, ClassDAO classDAO, SubjectDAO subjectDAO) {
        this.pricipalDAO = pricipalDAO;
        this.teacherDAO = teacherDAO;
        this.studentDAO = studentDAO;
        this.classDAO = classDAO;
        this.subjectDAO = subjectDAO;
    }

    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("=======================================");
        System.out.println("1. Add a new teacher");
        System.out.println("2. Search teacher");
        System.out.println("3. Update Teacher by id");
        System.out.println("4. Add a new student");
        System.out.println("5. Update info student");
        System.out.println("6. Delete student by Id");
        System.out.println("7. add new class");
        System.out.println("8. Update class class");
        System.out.println("9. Search class detail by id");
        System.out.println("10.create ACCOUNT PRINCIPAL");
        System.out.println("11.List principal");
        System.out.println("0. Logout");
        System.out.println("-1.Exit");
        System.out.println("=======================================");


    }

    public int createAccountPrincipal() {
        System.out.println("==================  Create Account Principal  =====================");
        System.out.println("Enter userName principal:");
        String name = scanner.nextLine();
        System.out.println("Enter passsword principal:");
        String password = scanner.nextLine();
        System.out.println("Enter Email principal:");
        String email = scanner.nextLine();
//        List<Principal> principalList = pricipalDAO.loadData(Principal.class.getName());

        Principal principal = new Principal(name, email, password);
        this.pricipalDAO.save(principal.getId(), principal);
        return 1;
    }

    public int createTeacher() {
        System.out.println("=======================================");
        System.out.println("Enter userName teacher:");
        String name = scanner.nextLine();
        System.out.println("Enter passsword teacher:");
        String password = scanner.nextLine();
        System.out.println("Enter full Name teacher:");
        String fullName = scanner.nextLine();
        System.out.println("Enter Age teacher:");
        int age = scanner.nextInt();
        System.out.println("Enter email teacher:");
        String email = scanner.nextLine();
//        List<Teacher> teacherList = teacherDAO.loadData(Teacher.class.getName());
        // save info teacher
        Teacher teacher = new Teacher(name, password, fullName, age, email);
        this.teacherDAO.save(teacher.getId(), teacher);
        System.out.printf("==============  success u have %d record =========================", 1);
        return 1;
    }

    public void searchTeacher(String keyword) {
        List<Teacher> teacherList = teacherDAO.search(keyword);
        teacherList.forEach(System.out::println);

    }

    public int createStudent() {
        System.out.println("==================  Create Student  =====================");
        System.out.println("Enter userName student:");
        String name = scanner.nextLine();
        System.out.println("Enter enrollment No:");
        String enrollmentNo = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email number");
        String email = scanner.nextLine();
        System.out.println("Enter teacher id");
        String teacherId = new Scanner(System.in).nextLine();
        System.out.println("Enter Class id");
        String classID = new Scanner(System.in).nextLine();
//        List<Student> list = studentDAO.loadData(Student.class.getName());
        Student student = new Student(name, enrollmentNo, gender, phoneNumber, email, teacherId, classID);
//        list.add(student);
        this.studentDAO.save(student.getId(), student);
        System.out.println("=== Create success =====");
        return 1;

    }

    public int updateStudent(String id) {
        System.out.println("==================  Update Student  =====================");
        // check student exist
        Student student = studentDAO.findById(id);
        if (Objects.nonNull(student)) {
            System.out.println("Enter name student:");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter email student:");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Enter phone No:");
            String phone = scanner.nextLine();
            System.out.println("Enter  adress:");
            String adress = new Scanner(System.in).nextLine();
            System.out.println("Enter TeacherId:");
            String teacherId = new Scanner(System.in).nextLine();
            System.out.println("Enter Class Id:");
            String classid = new Scanner(System.in).nextLine();
            student.update(name, email, phone, adress, teacherId, classid);
            studentDAO.save(id, student);
            System.out.println("=== Update success =====");
        }
        return 1;
    }


    public int updateTeacher(String teacherId) {
        // check teacherId exist
//        List<Teacher> teacherList = teacherDAO.loadData(Teacher.class.getName());
        Teacher teacher = teacherDAO.findById(teacherId);
        if (Objects.isNull(teacher)) {
            System.err.println("teacher not found");
            return 0;
        }
        System.out.println("================  Update Teacher Account =======================");

        System.out.println("Enter userName teacher:");
        String name = scanner.nextLine();
        System.out.println("Enter passsword teacher:");
        String password = scanner.nextLine();
        System.out.println("Enter email:");
        Integer age = scanner.nextInt();
        teacher.update(name, password, age);
        this.teacherDAO.save(teacher.getId(), teacher);
        System.out.println("=== Update success =====");
//        teacherList.stream().filter(teacher -> teacher.getId().equals(teacherId))
//                .findFirst().ifPresentOrElse(teacher -> {
//                    teacher.update(name, email, password);
//                }, () -> {
//                    System.err.println("teacher not found");
//                });

        return 0;
    }

    public int createClass() {
        System.out.println("==================  Create Class  =====================");
        System.out.println("Enter class name:");
        String name = scanner.nextLine();
        Class aClass = new Class(name);
        this.classDAO.save(aClass.getId(), aClass);
        return 1;
    }

    public int updateClass(String classId) {
        Class aClass = classDAO.findById(classId);
        ;
        if (Objects.isNull(aClass)) {
            System.err.println("class not found");
            return 0;
        }
        System.out.println("================  Update Class =======================");
        System.out.println("Enter class name:");
        String name = scanner.nextLine();
        aClass.setName(name);
        this.classDAO.save(aClass.getId(), aClass);
        return 1;
    }

    public int deleteClass(String classId) {
        Class aClass = classDAO.findById(classId);
        if (Objects.isNull(aClass)) {
            System.err.println("class not found");
            return 0;
        }
        this.classDAO.delete(classId);
        return 1;
    }

    public int deleteTeacher(String teacherId) {
        Teacher teacher = this.teacherDAO.findById(teacherId);
        if (Objects.isNull(teacher)) {
            System.err.println("teacher not found");
            return 0;
        }
        this.teacherDAO.delete(teacherId);
        return 1;
    }

    public int deleteStudent(String studentId) {
        Student student = this.studentDAO.findById(studentId);
        if (Objects.isNull(student)) {
            System.err.println("student not found");
            return 0;
        }
        this.studentDAO.delete(studentId);
        return 1;
    }


//    public int login(String name, String password) {
//        // check teacherId exist
//        List<Principal> principals = pricipalDAO.loadData(Principal.class.getName());
//        System.out.println(principals.get(0).toString());
//        Principal principal = JsonUtil.toObejct(principals.get(0).toString(), Principal.class);
////        Optional<Principal> principal = principals.stream().filter(p -> p.getUserName().equals(name) && p.getPassword().equals(password)).findFirst();
////        if (principal.isPresent()) {
////            System.out.println("Login Success");
////            return 1;
////        }
//        return 0;
//    }

}
