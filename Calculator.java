import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, a, b;
        do{
            System.out.println("Calculator");
            System.out.println("-----------------choose option------------------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("------------------------------------------------");
            System.out.print("Enter a option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the two values to perform Addition:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.print("Enter the two values to perform Subtraction:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.print("Enter the two values to perform Multiplication:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.print("Enter the two values to perform Division");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }while (option != 0);
    }
}
