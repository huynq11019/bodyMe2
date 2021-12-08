package context;

import java.util.Scanner;
import java.util.UUID;

public class BodyMe {

    static void menu() {
        System.out.println("===============  Selection Role Function ======================");
        System.out.println("1. Principal");
        System.out.println("2. Teacher");
        System.out.println("3. Student");
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
                    app.rolePrincipal();
                    break;
                case 2:
                    app.managerTeacher();
                    break;
                case 3:
                    app.managerStudent();
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
