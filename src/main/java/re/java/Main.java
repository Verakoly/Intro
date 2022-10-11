package re.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 10, time = 2;
        String name = "Vera", surname = "Okoli";
        System.out.println("My name is " + name + surname);
        System.out.println("I am " + age);
        System.out.println("I arrive at " + time);

        int num1 = 5;
        double num2 = 23.5;
        double result = num1 - num2;
        System.out.println(result);
        System.out.println(result / 2);
        System.out.println(result * -3);
        System.out.println(result ++);  //?? did not change
        System.out.println(result --);  // result minus 1

        int number = 0;
        System.out.println(number ++); // ??
        System.out.println(number --); // gives 1

        int modulus = 11 % 3;
        System.out.println(modulus);  // remainder operator

        boolean sameName = name == surname;
        System.out.println(sameName);         //comparison


        double salary = 23.5;
        if (salary < 20) {
            System.out.println("You will get a pay raise soon!");
        } else {
            System.out.println("You will get a pay raise next year!");


        int level = 8;
        if (salary < 20) {
            System.out.println("You will get a pay raise soon!");
        } else if (salary < 20 && level > 5) {
            System.out.println("Apply for pay raise asap!");
        } else {
            System.out.println("Lagom!");



        int b1 = 2, b2 = 2, toGet = 7;
        char operator = '+';

        switch (operator) {
        case '+':
            toGet = b1 + b2;
            break;

        case '-':
            toGet = b1 - b2;
            break;

        case '*':
            toGet = b1 * b2;
            break;

        case '/':
            toGet = b1 / b2;
            break;

            default:
                System.out.println(operator + " is not supported");
                System.out.println(toGet);

        }

        }

        }



    }
}
