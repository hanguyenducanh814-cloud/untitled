import java.util.Scanner;

public class hienthihinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void printRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printSquareTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printIsoscelesTriangle() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}