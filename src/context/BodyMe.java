package context;

import java.util.Scanner;
import java.util.UUID;

public class BodyMe {

    static void menu() {
        System.out.println("=====================================");
        System.out.println("1. Manager teacher");
        System.out.println("2. Manager student");
        System.out.println("3. Manager course");
        System.out.println("4. Manager exam");
        System.out.println("5. Manager grade");
        System.out.println("6. Manager student grade");
        System.out.println("7. Manager teacher grade");
        System.out.println("8. Manager exam grade");
        System.out.println("9. Exit");
        System.out.println("===============================");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app = new App();

        System.out.println("Select Function: \n");
        int choice = 0;
        while (choice != 9) {
            menu();

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    app.managerTeacher();
                    break;
                case 2:
                    app.managerStudent();
                    break;
                case 3:
//                    app.managerCourse();
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

}
