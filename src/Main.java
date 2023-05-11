import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int key;
        Scanner input = new Scanner(System.in);
        do {
            menu();
            key = input.nextInt();
            checkKey(key);
        } while (key != 4);
    }

    public static void menu() {
        System.out.println("***MENU***");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Input chose: ");
    }

    public static void checkKey(int key) {
        int a = 5, b = 10;

        switch (key) {
            case 1:
                rectangle(a, b);
                break;
            case 2:
                triangleBL(a);
                triangleTL(a);
                triangleBR(a);
                triangleTR(a);
                break;
            case 3:
                isoscelesTriangle(a);
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("Error key");
        }
    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void triangleBL(int a) {
        System.out.println("botton-left: ");
        for (int i = 0; i < a; i++) {
            for (int j = a - i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        ;
    }

    public static void triangleBR(int a) {
        System.out.println("botton-right: ");
        for (int i = 0; i < a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("   ");
            }
            for (int j = a - i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        ;
    }

    public static void triangleTL(int a) {
        System.out.println("top-left: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        ;
    }

    public static void triangleTR(int a) {
        System.out.println("top-right: ");
        for (int i = 0; i < a; i++) {
            for (int k = a - i; k >= 0; k--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        ;
    }

    public static void isoscelesTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int k = a - i; k >= 0; k--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  *  ");
            }
            System.out.println("");
        }
        ;
    }

}