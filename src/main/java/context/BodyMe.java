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
         new App().homeMenu();



    }

}
