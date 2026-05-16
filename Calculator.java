import java.util.Scanner;

public class Calculator {

    // Addition Method
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction Method
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication Method
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division Method
    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double num1, num2, result;
        char continueChoice;

        System.out.println("==================================================");
        System.out.println("            JAVA CALCULATOR APPLICATION           ");
        System.out.println("==================================================");

        do {

            System.out.println("\n--------------- MENU ---------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("------------------------------------");

            System.out.print("Enter Your Choice (1-4): ");
            choice = sc.nextInt();

            System.out.print("Enter First Number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter Second Number: ");
            num2 = sc.nextDouble();

            switch(choice) {

                case 1:

                    result = add(num1, num2);

                    System.out.println("\n========== RESULT ==========");
                    System.out.println("Addition Result = " + result);
                    System.out.println("============================");
                    break;

                case 2:

                    result = subtract(num1, num2);

                    System.out.println("\n========== RESULT ==========");
                    System.out.println("Subtraction Result = " + result);
                    System.out.println("============================");
                    break;

                case 3:

                    result = multiply(num1, num2);

                    System.out.println("\n========== RESULT ==========");
                    System.out.println("Multiplication Result = " + result);
                    System.out.println("============================");
                    break;

                case 4:

                    if(num2 != 0) {

                        result = divide(num1, num2);

                        System.out.println("\n========== RESULT ==========");
                        System.out.println("Division Result = " + result);
                        System.out.println("============================");

                    } else {

                        System.out.println("\n=================================");
                        System.out.println("ERROR: Cannot Divide By Zero");
                        System.out.println("=================================");
                    }

                    break;

                default:

                    System.out.println("\n=================================");
                    System.out.println("Invalid Choice! Please Try Again");
                    System.out.println("=================================");
            }

            System.out.print("\nDo You Want To Continue? (y/n): ");
            continueChoice = sc.next().charAt(0);

        } while(continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("\n==================================================");
        System.out.println("       THANK YOU FOR USING CALCULATOR             ");
        System.out.println("==================================================");

        sc.close();
    }
}