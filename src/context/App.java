package context;

import inftrasutructure.Service.PrincipalSerivce;
import inftrasutructure.Service.StudentService;
import inftrasutructure.Service.TeacherService;
import inftrasutructure.domain.Student;
import inftrasutructure.domain.Teacher;


import java.util.List;
import java.util.Scanner;

public class App {
    private final TeacherService teacherService = new TeacherService();
    private final StudentService studentService = new StudentService();
    private final PrincipalSerivce principalSerivce = new PrincipalSerivce();
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
                    teacherService.addTeacher();
                    break;
                case 2:
                    System.out.println("Delete Teacher");
                    teacherService.deleteTeacher("type id teacher");
                    break;
                case 3:
                    System.out.println("Update Teacher");
                    teacherService.updateTeacher("", "", "");
                    break;
                case 4:
                    System.out.println("Find Teacher by id");
                    System.out.println(teacherService.findTeacher(""));
                    break;
                case 5:
                    System.out.println("Search Teacher");
                    List<Teacher> list = teacherService.searchTeacher(null);
                    for (Teacher teacher : list) {
                        System.out.println(teacher);
                    }
                    break;
                case 6:
                    System.out.println(">>>>>> Exit <<<<<<");
                    break;
                default:
                    System.out.println("======> function not found <=======\n");
            }
        } while (choice != 6);
    }

    public void managerStudent() {
        int choice;
        do {
            studentService.menu();
            System.out.println("Select Function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Student");
                    break;
                case 2:
                    System.out.println("Delete Student");
                    studentService.deleteStudent("");
                    break;
                case 3:
                    System.out.println("Update Student");
                    studentService.updateStudent("", "", "", "");
                    break;
                case 4:
                    System.out.println("Find Student by id");
                    System.out.println(studentService.findStudent(""));;
                    break;
                case 5:
                    System.out.println("Search Student");
                    List<Student> list = studentService.searchStudent("");
                    for (Student student : list) {
                        System.out.println(student);
                    }
                    break;
                case 6:
                    System.out.println(">>>>>> Exit <<<<<<");
                    break;
                default:
                    System.out.println("======> function not found <=======\n");
            }
        } while (choice != 6);
    }

    public void rolePrincipal() {
        int choice;
        do {
            this.principalSerivce.menu();
            System.out.println("Select Function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Teacher");
                    break;
                case 2:
                    System.out.println("Add Student");
                    break;
                case 3:
                    System.out.println("Create account");
                    this.principalSerivce.createAccountPrincipal("huy", "huy", "huy");
                    break;
                case 4:
                    System.out.println(">>>>>> Exit <<<<<<");
                    break;
                default:
                    System.out.println("======> function not found <=======\n");
            }
        } while (choice != 3);
    }

}
