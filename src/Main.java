import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name?");
    String name = scanner.nextLine();

    System.out.printf("So %s. How old are you?",name);
    int age = scanner.nextInt();

    scanner.nextLine();
    System.out.printf("Cool %d is a good age to start programming. \n what language do you prefer?", age);
    String language = scanner.nextLine();
    System.out.printf("Ah!! %s is a solid programming language." , language);
    System.out.println("What is the first number?");
//    will take the input as an integer
    int a = scanner.nextInt();
//    will consume the next dangling newline character
    scanner.nextLine();

//    ask for the second input
    System.out.print("What is the second number");
    int b = scanner.nextInt();

    scanner.nextLine();

    System.out.print("What operation would you like to perform?");
    System.out.print("subtract, sum, multiply, division");
    String operation = scanner.nextLine();

    switch (operation){
        case "sum":
            System.out.printf("%d + %d = %d" ,a,b,a+b);
            break;
        case "subtract":
            System.out.printf("%d - %d = %d" , a,b,a-b);
            break;
        case "multiply":
            System.out.printf("%d * %d = %d" , a, b , a*b);
            break;
        case "division":
            if (b == 0){
                System.out.print("Can not divide by 0");
            } else {
                System.out.printf("%d / %d = %d" , a,b,a/b);
                break;
            }
        default:
            System.out.printf("Invalid Operation");
    }
    scanner.close();



    scanner.close();
    }
}
