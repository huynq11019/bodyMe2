package context;

import inftrasutructure.Service.StudentService;
import inftrasutructure.Service.TeacherService;
import inftrasutructure.domain.Student;
import inftrasutructure.domain.Teacher;


import java.util.List;
import java.util.Scanner;

public class App {
    private final TeacherService teacherService = new TeacherService();
    private final StudentService studentService = new StudentService();


    public static App getInstance() {
        return new App();
    }

    public void managerTeacher() {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            teacherService.menu();
            System.out.println("Select Function:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Teacher");
                    teacherService.addTeacher("Ten", "dia chi");
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
            Scanner scanner = new Scanner(System.in);
            studentService.menu();
            System.out.println("Select Function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Student");
                    studentService.addStudent("", "", "");
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

}
