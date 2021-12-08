package context;

import inftrasutructure.Service.PrincipalSerivce;
import inftrasutructure.Service.StudentService;
import inftrasutructure.Service.TeacherService;
import inftrasutructure.repo.*;


import java.util.Scanner;

public class App {
    private final PrincipalDAO pricipalDAO = new PrincipalDAO();

    private final TeacherDAO teacherDAO = new TeacherDAO();

    private final StudentDAO studentDAO = new StudentDAO();

    private final ClassDAO classDAO = new ClassDAO();

    private final SubjectDAO subjectDAO = new SubjectDAO();
    private final TeacherService teacherService = new TeacherService(teacherDAO, studentDAO, classDAO, subjectDAO);
    private final StudentService studentService = new StudentService(pricipalDAO, teacherDAO, studentDAO, classDAO, subjectDAO);
    private final PrincipalSerivce principalSerivce = new PrincipalSerivce(pricipalDAO, teacherDAO, studentDAO, classDAO, subjectDAO);
    private final Scanner scanner = new Scanner(System.in);

    public static App getInstance() {
        return new App();
    }

    public void managerTeacher() {
        int choice;
        do {
            teacherService.menu();
            System.out.println("Select Function:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("get List class ");
                    teacherService.getListClass();
                    break;
                case 2:
                    System.out.println("Get student in class");
                    System.out.println("Enter id class to get list student");
                    String classId = scanner.nextLine();
                    this.teacherService.getStudentInClass(classId);
                    break;
                case 3:
                    System.out.println("get student by id");
                    this.teacherService.getStudentByID();
                    break;
                case 4:
                    System.out.println("Search student by name");
                    this.teacherService.searchStudentByName();
                    break;
                case 5:
                    System.out.println("Enter mark to student");
                    System.out.println("Enter id student");
                    String studentId = scanner.nextLine();
                    this.teacherService.enterMartStudent(studentId);
                    break;
                case 6:
                    System.out.println(">>>>>> Exit <<<<<<");
                    break;
                default:
                    System.out.println("======> function not found <=======\n");
            }
        } while (choice != 6);
    }

//    public void managerStudent() {
//        int choice;
//        do {
//            studentService.menu();
//            System.out.println("Select Function: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Add Student");
//                    this.principalSerivce.createTeacher();
//                    break;
//                case 2:
//                    System.out.println("Delete Student");
//                    studentService.deleteStudent("");
//                    break;
//                case 3:
//                    System.out.println("Update Student");
//                    studentService.updateStudent("", "", "", "");
//                    break;
//                case 4:
//                    System.out.println("Find Student by id");
//                    System.out.println(studentService.findStudent(""));;
//                    break;
//                case 5:
//                    System.out.println("Search Student");
//                    List<Student> list = studentService.searchStudent("");
//                    for (Student student : list) {
//                        System.out.println(student);
//                    }
//                    break;
//                case 6:
//                    System.out.println(">>>>>> Exit <<<<<<");
//                    break;
//                default:
//                    System.out.println("======> function not found <=======\n");
//            }
//        } while (choice != 6);
//    }

    public void rolePrincipal() {
        // check login

        int choice;
        do {
            this.principalSerivce.menu();
            System.out.println("Select Function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Teacher");
                    this.principalSerivce.createTeacher();
                    break;
                case 2:
                    System.out.println("Nhập từ khóa tìm kiếm: ");
                    String keyword = scanner.nextLine();
                    this.principalSerivce.searchTeacher(keyword.trim());
                    break;
                case 3:
                    System.out.println("Enter id Teacher to update");
                    String id = scanner.nextLine();
                    this.principalSerivce.updateTeacher(id);
                    break;
                case 4:
                    System.out.println(" Add a new student");
                    this.principalSerivce.createStudent();
                    break;
                case 5:
                    System.out.println(" Enter a student id to update");
                    String idStudent = scanner.nextLine();
                    this.principalSerivce.updateStudent(idStudent);
                    break;
                case 6:
                    System.out.println(" Delete a student by ids: enter id");
                    String idStudentDelete = scanner.nextLine();
                    this.principalSerivce.deleteStudent(idStudentDelete);
                    break;
                case 7:
                    System.out.println(" Add a new Class");
                    this.principalSerivce.createStudent();
                    break;
                case 10:
                    System.out.println(" Register a principal");
                    this.principalSerivce.createAccountPrincipal();
                    break;
                case 0:
                    System.out.println(">>>>>> Logout <<<<<<");

                    break;
                case -1:
                    System.out.println(">>>>>> Exit <<<<<<");
                    break;
                default:
                    System.out.println("======> function not found <=======\n");
            }
        } while (choice != 0);
    }

    public void homeMenu() {
        System.out.println("Select Function: \n");
        int choice = 0;
        while (choice != 9) {
            menu();

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello Principal: ");
                    this.rolePrincipal();
                    break;
                case 2:
                    System.out.println("hello teacher");
                    this.managerTeacher();
                    break;
                case 3:
                    System.out.println("heloo student");
                    break;
                case 9:
                    System.out.println(">>>>>> Exit <<<<<<");
                    System.exit(0);
                    break;
                default:
                    System.out.println("==========> function not found <=========>\n");
                    break;
            }

        }
    }

    void menu() {
        System.out.println("===============  Selection Role Function ======================");
        System.out.println("1. Principal");
        System.out.println("2. Teacher");
        System.out.println("3. Student");
        System.out.println("9. Exit");
        System.out.println("===============================");
    }

}
