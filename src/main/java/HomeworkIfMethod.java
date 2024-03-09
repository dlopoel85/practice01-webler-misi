import java.util.Objects;
import java.util.Scanner;

public class HomeworkIfMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // System.out.println("Játék (i/n) ? ");
        // String answwer = scanner.next();

        //char letter = '+';
        System.out.print("Műveleti jel (+-/*) ? ");
        String letter = scanner.next();
        System.out.print("Egyik szám : ");
        int a = scanner.nextInt();
        System.out.print("Másik szám : ");
        int b = scanner.nextInt();

        //   int a = 10;
        //   int b = 5;
        int c = 0;


        resultOfnumber(letter, a, b, c);
        System.out.println("-----------------------------");

    }
    public static void resultOfnumber(String letter, int a, int b, int c) {


        if (Objects.equals(letter, String.valueOf('+'))) {
            c = a + b;

        }
        if (Objects.equals(letter, String.valueOf('-'))) {
            c = a - b;

        }
        if (Objects.equals(letter, String.valueOf('*'))) {
            c = a * b;

        }
        if (Objects.equals(letter, String.valueOf('/'))) {
            c = a / b;

        }
        System.out.println("Műveleti jel: " + letter + " eredmény: " + c);
    }


}