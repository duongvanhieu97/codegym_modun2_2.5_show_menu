import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        menu = scanner.nextInt();
        switch (menu) {
            case 0:
                System.exit(0);
                break;
            case 1:
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j <= 6; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                    for(int j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=7;i>=1;i--) {
                    for(int j=1;j<=i;j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

        }
    }
}
