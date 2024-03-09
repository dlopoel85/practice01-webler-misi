public class HomeworkIf {

    public static void main(String[] args) {

        char letter = '+';

        int a = 10;
        int b = 4;

        if (letter == '+') {
            int c = a + b;
            System.out.println("a + b = " + c);
        }
        if (letter == '-') {
            int c = a - b;
            System.out.println("a - b = " + c);
        }
        if (letter == '*') {
            int c = a * b;
            System.out.println("a * b = " + c);
        }
        if (letter == '/') {
            int c = a / b;
            System.out.println("a / b = " + c);
        }


        System.out.println("-----------------------------");
    }
}
